node {
    stage('Checkout') {
        checkout scm
    }

    stage('Build') {
        withChecks(name: 'Tests', includeStage: true) {
            sh 'sleep 20'
            try {
                sh 'mvn -Dmaven.test.failure.ignore=true clean verify'
            } finally {
                junit '**/target/surefire-reports/TEST-*.xml'
                archiveArtifacts 'target/*.jar'
            }
        }
    }

    stage('Sleep') {
        sh 'sleep 3'
    }
}