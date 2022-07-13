pipeline {
  agent any
  stages {
    stage('Publish TestNG result report') {
      agent any
      steps {
        jiraSendBuildInfo(branch: 'main', site: 'https://pamphoux.atlassian.net')
      }
    }

  }
}