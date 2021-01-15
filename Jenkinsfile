def ex(cmd) {
    if (Boolean.valueOf(isUnix())) {
        sh cmd
    }
    else {
        bat cmd
    }
}

pipeline {
    agent any

    stages {
        stage('setup') {
            steps {
                ex 'docker-compose up'
                ex 'mvn clean compile'
            }
        }
        stage('test') {
            steps {
                ex 'mvn surefire:test'
            }
        }
        stage('teardown') {
            steps {
                ex 'docker-compose down'
            }
        }
    }
}
