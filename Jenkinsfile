pipeline {
    agent { 
        label 'agent' 
    }

    tools {
        maven 'Maven-3.8.1'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Unit Test') {
            steps {
                sh 'mvn clean test'
            }
        }

        stage('Build & Package') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying application...'
            }
        }
    }

    post {
        always {
            // Publish test results
            junit testResults: '**/target/surefire-reports/*.xml', 
                  allowEmptyResults: true,
                  skipPublishingChecks: true
            
            // Clean workspace
            cleanWs()
        }
        
        unstable {
            echo 'Tests failed but continuing pipeline...'
        }
        
        failure {
            echo 'Pipeline failed!'
        }
    }
}}
