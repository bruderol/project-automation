pipeline {
    agent {
        docker {
            image 'openjdk:12.0.1'
        }
    }
    stages {
        stage('Build') {
            steps {
                sh './gradlew build -i -s --no-daemon'
            }
        }
    }
}