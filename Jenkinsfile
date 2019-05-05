pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh './gradlew clean build -x test -i -s --no-daemon'
            }
        }
		stage('Test') {
			steps {
				sh './gradlew test -i -s --no-daemon'
			}
		}
    }
}
