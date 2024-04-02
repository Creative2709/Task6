pipeline {
    agent any

    tools{
        maven 'mvn'
    }
    
    stages {
        stage("Checkout") {
            steps {
                git branch: 'main', url: 'https://github.com/Creative2709/Task6.git'
            }
        }
        
        stage("Build") {
            steps {
                bat 'mvn clean'
            }
        }
        
        stage("Test") {
            steps {
                bat 'mvn test'
            }
        }
        
        stage("Deploy") {
            steps {
                echo 'Deployed Successfully'
            }
        }
    }
}
