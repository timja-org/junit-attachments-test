def axes = [
  platforms: ['linux', 'windows'],
  jdks: [17, 21],
]
def builds = [:]
axes.values().combinations {
     builds["${platform}-jdk${jdk}"] = {
        node {
         stage("${platform.capitalize()} - JDK ${jdk} - Test") {
            checkout scm
            sh 'sleep 20'
             withChecks(name: 'Tests', includeStage: true) {
                 sh 'mvn -Dmaven.test.failure.ignore=true clean verify'
                 junit '**/target/surefire-reports/TEST-*.xml'
             }
         }
        }
     }
}

parallel tasks
