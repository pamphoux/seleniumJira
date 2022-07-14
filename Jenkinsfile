pipeline {
    agent any

    tools {
        // Installation Maven selon le nom donné dans la configuration globale de Jenkins
        maven "Maven"
    }

    stages {
        stage('Pre Build'){
            steps{
                sh "chmod +x driver/chromedriver"
            }
        }
        stage('Build') {
            steps {
                // Exécuter Maven (version pour un système Unix)
                sh "mvn -Dmaven.test.failure.ignore=true clean"
                sh "mvn install"
            }
        stage('Import results to Xray') {
            steps {
                step([$class: 'XrayImportBuilder', endpointName: '/testng', importFilePath: 'target/surefire-reports/testng-results.xml', importToSameExecution: 'true', projectKey: 'HTUTO', serverInstance: 'fd45sd-dq7856-dsdd5656ytz'])
            }
        }
        }
    }
}
