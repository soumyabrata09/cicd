pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Demo Build Stage'
            }
        }
        stage('Test') {
            steps {
                echo 'Demo Test Stage'
            }
        }
    }
}