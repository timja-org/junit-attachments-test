// Test pipeline for jenkinsci/checks-api-plugin#355.
// - The implicit "Declarative: Checkout SCM" stage starts a stage and checks out straight away, the case where
//   the stage update and the checkout update used to race to create the check.
// - 'Labelled steps' covers #351: labelled sh steps must not publish.
// - 'Parallel' starts 21 stages or branches at once; publishing each on the CPS VM thread stalls the build.
pipeline {
    agent any
    stages {
        stage('Labelled steps') {
            steps {
                script {
                    for (int i = 1; i <= 20; i++) {
                        sh(label: "labelled step ${i}", script: 'true')
                    }
                }
            }
        }
        stage('Parallel') {
            steps {
                script {
                    def branches = [:]
                    for (int i = 1; i <= 10; i++) {
                        def name = "branch ${i}"
                        branches[name] = {
                            stage(name) {
                                sh(label: "work in ${name}", script: 'sleep 1')
                            }
                        }
                    }
                    parallel branches
                }
            }
        }
        stage('Done') {
            steps {
                echo 'done'
            }
        }
    }
}
