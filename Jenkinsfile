node {

    stages {

       stage('Preparation') { // for display purposes
          steps {
          step {
              def mvnHome
              // Get some code from a GitHub repository
              git 'https://github.com/mgoode180566/rest-api-jenkins.git'
              // Get the Maven tool.
              // ** NOTE: This 'M3' Maven tool must be configured
              // **       in the global configuration.
              mvnHome = tool 'M3'
          }
          }
       }

       stage('Build') {
          steps {
                step {
              // Run the maven build
              if (isUnix()) {
                 sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean package"
              } else {
                 bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean package/)
              }
              }
          }
       }

       stage('Results') {
          steps {
          step {
            junit '**/target/surefire-reports/TEST-*.xml'
            archiveArtifacts 'target/*.jar'
          }
          }
       }

       stage('Deploy') {
          steps {
          step {
            echo 'Deploying.....'
          }
          }
       }

    }
}
