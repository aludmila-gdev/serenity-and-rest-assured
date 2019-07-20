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
        archiveArtifacts 'target/site/serenity/index.html'
      }
    }
  }
  environment {
    dev = 'dev'
  }
}