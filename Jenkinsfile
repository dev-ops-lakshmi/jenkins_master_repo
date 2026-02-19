pipeline {
    agent { label 'agent' }
    stages {
        stage('Test') {
            steps {
                // Runs Maven tests
                sh 'mvn test'
            }
            post {
                always {
                    // JUnit plugin: Archives XML results from target/surefire-reports/
                    junit '**/target/surefire-reports/*.xml' 
                }
            }
        }
        stage('Deploy') {
            steps {
                sh 'mvn deploy -DskipTests'
            }
        }
    }
    post {
        always {
            // Workspace Cleanup plugin: Wipes the entire agent directory
            cleanWs() 
        }
    }
}
}
