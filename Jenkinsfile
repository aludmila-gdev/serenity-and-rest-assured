pipeline {
  agent any
  stages {
    stage('checkout') {
      steps {
        sh 'ls'
      }
    }
    stage('Tests') {
      steps {
        sh './gradlew clean test aggregate'
      }
    }
  }
  environment {
    dev = 'dev'
  }
}