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
			post {
				always {

					// JUnit Test Reports
					junit keepLongStdio: true, testResults: 'build/test-results/**/*.xml'

					// JaCoCo Test Coverage Report
					jacoco()

				}
			}

		}

    }

}
