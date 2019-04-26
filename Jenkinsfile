pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh './gradlew build -i -s --no-daemon'
            }
        }
    }
}