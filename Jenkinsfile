pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh "sleep 20"
                // Run Maven on a Unix agent.
                sh "mvn -Dmaven.test.failure.ignore=true clean verify"
            }

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    junit checksName: 'Testss', testResults: '**/target/surefire-reports/TEST-*.xml', testDataPublishers: [attachments()]
                    archiveArtifacts 'target/*.jar'
                    recordCoverage(tools: [[pattern: '**/jacoco/jacoco.xml']])
                }
            }
        }
        stage('Sleep') {
            steps {
                sh "sleep 3"
            }
        }
        stage('Sleep2') {
            steps {
                sh "sleep 4"
            }
        }
    }
}
