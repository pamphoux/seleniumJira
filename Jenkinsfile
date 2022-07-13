pipeline {
  agent any
  stages {
    stage('Publish TestNG result report') {
      steps {
        jiraSendBuildInfo(branch: 'main', site: 'https://pamphoux.atlassian.net')
      }
    }

  }
}