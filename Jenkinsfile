pipeline {
    agent any

    stages {
        stage('setup') {
            steps {
                sh 'docker-compose up'
                sh 'mvn clean compile'
            }
        }
        stage('test') {
            steps {
                sh 'mvn surefire:test'
            }
        }
        stage('teardown') {
            steps {
                sh 'docker-compose down'
            }
        }
    }
}
