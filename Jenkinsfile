pipeline {

    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking out Online Examination System project'
            }
        }

        stage('Compile') {
            steps {
                bat 'javac Login.java LoginTest.java'
            }
        }

        stage('Test') {
            steps {
                bat 'java LoginTest'
            }
        }

        stage('Build Result') {
            steps {
                echo 'Online Examination System build completed successfully'
            }
        }
    }

    post {
        success {
            echo 'BUILD SUCCESSFUL'
        }

        failure {
            echo 'BUILD FAILED'
        }
    }
}
