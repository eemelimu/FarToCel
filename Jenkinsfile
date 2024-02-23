pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
            post {
                success {
                    junit'**/target/surefire-reports/TEST-*.xml'
                    jacoco(execPattern:'**/target/jaclcl.exec')
                }
            }
        }
    }
}
