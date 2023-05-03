pipeline {
    agent any
    tools{
        maven 'Maven-path'
    }
    stages {
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }
        
    }
}

