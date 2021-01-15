pipeline {
    agent any

    stages {
        stage('setup') {
            steps {
                bat 'docker-compose up'
                bat 'mvn clean compile'
            }
        }
        stage('test') {
            steps {
                bat 'mvn surefire:test'
            }
        }
        stage('teardown') {
            steps {
                bat 'docker-compose down'
            }
        }
    }
}
