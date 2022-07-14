pipeline {
  agent any
  stages {
    stage('Pre Build') {
      steps {
        sh 'sh "chmod +x src/main/resources/chromedriver"'
      }
    }

    stage('Build') {
      steps {
        sh '''sh "mvn -Dmaven.test.failure.ignore=true clean"



sh "mvn install"'''
      }
    }

    stage('Import results to Xray') {
      steps {
        jiraSendBuildInfo(branch: 'main', site: 'pamphoux.atlassian.net')
      }
    }

  }
}