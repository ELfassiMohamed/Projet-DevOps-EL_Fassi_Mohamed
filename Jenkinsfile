pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/ELfassiMohamed/Projet-DevOps-EL_Fassi_Mohamed.git'
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Archive') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying application...'
                // Example (optional):
                // sh 'java -jar target/Projet-DevOps-0.0.1-SNAPSHOT.jar'
            }
        }
    }

    post {
        success {
            slackSend(
                channel: '#jenkins-ci',
                message: "SUCCESS: Job ${env.JOB_NAME} #${env.BUILD_NUMBER} passed and deployed."
            )
        }

        failure {
            slackSend(
                channel: '#jenkins-ci',
                message: "FAILURE: Job ${env.JOB_NAME} #${env.BUILD_NUMBER} failed. Deployment skipped."
            )
        }
    }
}
