pipeline {
    agent any
    stages {
        stage('Hello World') {
            steps {
                sh 'javac HelloWorld.java'
                sh 'java HelloWorld'
            }
        }
        stage('Hello Wipro') {
            steps {
                sh 'javac HelloWipro.java'
                sh 'java HelloWipro'
            }
        }
        stage('Hello Jenkins') {
            steps {
                sh 'javac HelloJenkins.java'
                sh 'java HelloJenkins'
            }
        }
    }
}
