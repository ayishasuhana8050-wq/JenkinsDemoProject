pipeline {
    agent any

    tools {
        maven 'Maven3.9'  // make sure the name matches your Maven installation in Jenkins
    }

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/ayishasuhana8050-wq/JenkinsDemoProject.git'
            }
        }

        stage('Build Project') {
            steps {
                script {
                    bat 'mvn clean install'
                }
            }
        }

        stage('Run Tests') {
            steps {
                script {
                    bat 'mvn test'
                }
            }
        }

        stage('Publish Test Results') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }
    }

    post {
        success {
            echo '✅ Build and Tests Passed Successfully!'
        }
        failure {
            echo '❌ Build or Tests Failed!'
        }
    }
}
