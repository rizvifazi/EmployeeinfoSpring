pipeline {
    agent any
    tools {
        maven 'Maven-3.8.6' // Name defined in Jenkins Global Tools
        jdk 'JDK-11' // JDK version configured in Jenkins
    }
    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/your-username/your-repo.git',
                    credentialsId: 'github-credentials' // Only for private repos
            }
        }
        stage('Build with Maven') {
            steps {
                sh 'mvn clean package' // Builds the JAR/WAR
            }
        }
        stage('Archive Artifact') {
            steps {
                archiveArtifacts 'target/*.jar' // Saves the JAR for later use
            }
        }
    }
}