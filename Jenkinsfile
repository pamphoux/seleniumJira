pipeline {
  agent any
  stages {
    stage('Pre Build') {
      steps {
        sh 'chmod +x src/main/resources/chromedriver'
      }
    }

    stage('Build') {
      steps {
        sh 'mvn -Dmaven.test.failure.ignore=true clean'
        sh 'mvn install'
      }
    }

    stage('Import results to Xray') {
      agent any
      environment {
        endpointName = '/testng'
        importFilePath = 'target/surefire-reports/testng-results.xml'
        importToSameExecution = 'true'
        projectKey = 'TNG'
        serverInstance = '5b33af57-887c-4b5c-b98c-6e6fe7d365f7'
      }
      steps {
        echo 'ok'
      }
    }

  }
}