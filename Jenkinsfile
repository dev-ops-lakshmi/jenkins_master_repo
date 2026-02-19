
peline {
    agent {
        label 'agent'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Unit Test') {
            steps {
                // Ensure Maven is available in your agent image
                sh 'mvn test'
            }
            post {
                always {
                    // JUnit plugin archives the results
                    junit '**/target/surefire-reports/*.xml'
                }
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
                // sh 'mvn deploy -DskipTests' // Uncomment when ready
            }
        }
    }

    post {
        always {
            // Workspace Cleanup plugin wipes the agent
            cleanWs()
        }
    }
}
}
