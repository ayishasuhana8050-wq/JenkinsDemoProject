pipeline {
    agent any

    tools {
        maven 'Maven_3_9_6'   // (Use the name of Maven you configured in Jenkins)
        jdk 'JDK11'           // (Use the name of JDK installed in Jenkins)
    }

    stages {
        stage('Checkout Code') {
            steps {
                echo 'Pulling code from GitHub...'
                git branch: 'main', url: 'https://github.com/ayishasuhana8050-wq/CRUD-practice.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Building Maven Project...'
                bat 'mvn clean compile'
            }
        }

        stage('Run Tests') {
            steps {
                echo 'Running Unit Tests...'
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging the Project...'
                bat 'mvn package'
            }
        }
    }

    post {
        success {
            echo '✅ Build Successful!'
        }
        failure {
            echo '❌ Build Failed! Check console output for details.'
        }
    }
}
