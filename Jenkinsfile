peline {
    agent {
        // This label MUST match the 'Labels' field you set 
        // in your Docker Template configuration earlier
        label 'agent' 
    }
    stages {
        stage('Dynamic Build') {
            steps {
                sh 'echo "I am running inside a dynamic container!"'
                sh 'cat /etc/os-release' // Shows the OS of the container
                sh 'select * from Table'
            }
        }
    }
}
