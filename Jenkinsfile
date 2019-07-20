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
        archiveArtifacts '/var/jenkins_home/workspace/Pipeline_Test_jenkins/target/site/serenity/index.html'
      }
    }
  }
  environment {
    dev = 'dev'
  }
}