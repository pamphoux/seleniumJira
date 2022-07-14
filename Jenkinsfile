pipeline {
  agent {
    node {
      label 'Pipeline'
    }

  }
  stages {
    stage('Report Test Auto in Xray') {
      steps {
        echo 'Success'
      }
    }

  }
  environment {
    jiraInstance = 'pamphoux.atlassian.net'
    SCM = 'Git'
    Repositories = 'Repository URL'
  }
}