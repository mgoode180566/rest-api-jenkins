node {
   def mvnHome
   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
      git 'https://github.com/mgoode180566/rest-api-jenkins.git'
      mvnHome = tool 'M3'
   }
   stage('Build') {
      // Run the maven build
      bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean package/)
   }
   stage('Results') {
      junit '**/target/surefire-reports/TEST-*.xml'
      archiveArtifacts 'target/*.jar'
   }
   stage('Deploy') {
       sh 'mvn clean install'
   }
}
