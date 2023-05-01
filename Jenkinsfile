// pipeline {
//     agent any

//     stages {
//         stage('Build') {
//             steps {
//                 bat 'mvn clean package'
//             }
//         }
        
//     }
// }
pipeline {
    agent any

 

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "apache-maven-3.8.6"
    }

 

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'repo-link'

 

                // Run Maven on a Unix agent.
                bat "mvn clean install -DskipTests"

 

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }
        }
        stage('Test'){
            steps{
                bat "mvn test"
            }
        }

 

    }
}
