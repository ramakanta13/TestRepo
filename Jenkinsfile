pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
                bat "git clone https://github.com/ramakanta13/TestRepo"
            }
        }
        stage('Test') { 
            steps {
                bat "echo Hello"
            }
        }
        stage('Deploy') { 
            steps {
                bat "echo Hello"
            }
        }
    }
}
