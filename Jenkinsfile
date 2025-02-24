pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Run Maven on a Unix agent.
                realtimeJUnit('**/target/surefire-reports/TEST-*.xml') {
                    sh "mvn -Dmaven.test.failure.ignore=true clean verify"
                }
            }

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    archiveArtifacts 'target/*.jar'
                    recordCoverage(tools: [[pattern: '**/jacoco/jacoco.xml']])
                }
            }
        }
    }
}
