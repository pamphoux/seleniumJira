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
      steps {
        echo 'ok'
      }
    }

  }
}