pipeline {
    agent any
    tools{
        maven 'Maven-path'
    }
    stages {
        stage('Build') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/kankshicodes/Devops']]])
                bat 'mvn clean package'
            }
        }
        
    }
}

