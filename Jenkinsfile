pipeline {
    //agent any 
    stages {
        stage('Build') { 
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/ramakanta13/TestRepo.git']]])
            }
        }
        stage('Test') { 
            steps {
                bat "echo Test"
            }
        }
        stage('Deploy') { 
            steps {
                bat "echo Deploy"
            }
        }
    }
}
