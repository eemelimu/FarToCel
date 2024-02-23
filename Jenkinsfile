pipeline {
 agent any
 environment {
    MAVEN_HOME = tool 'maven'
 }

 stages {
 stage('Checkout') {
 steps {
 git branch: 'main', url: 'https://github.com/eemelimu/FarToCel.git'
 }
 }
 stage('Build') {
 steps {
 bat "\"${env.MAVEN_HOME}bin\\mvn.cmd\" clean install"
 }
 }
 stage('Test') {
 steps{
 bat "\"${env.MAVEN_HOME}bin\\mvn.cmd\" test"
 }
 post {
 success {
 // Publish JUnit test results
 junit '**/target/surefire-reports/TEST-*.xml'
 // Generate JaCoCo code coverage report
 jacoco(execPattern: '**/target/jacoco.exec')
 }
 }
 }
 }
}
