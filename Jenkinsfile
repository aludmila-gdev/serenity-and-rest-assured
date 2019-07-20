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
      } finally {
            publishHTML (target: [
            reportDir: 'target/site/serenity',
            reportFiles: 'index.html',
            reportName: "Tests report"
            ])
        }
    }
  }
  environment {
    dev = 'dev'
  }
}
