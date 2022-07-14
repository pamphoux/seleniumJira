pipeline {
    agent any

    tools {
        // Installation Maven selon le nom donné dans la configuration globale de Jenkins
        maven "Maven"
    }

    stages {
        stage('Pre Build'){
            steps{
                sh "chmod +x src/main/resources/chromedriver"
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
                step([$class: 'XrayImportBuilder', endpointName: '/testng', importFilePath: 'target/surefire-reports/testng-results.xml', importToSameExecution: 'true', projectKey: 'TNG', serverInstance: '5b33af57-887c-4b5c-b98c-6e6fe7d365f7'])
            }
        }
        }
    }
}
