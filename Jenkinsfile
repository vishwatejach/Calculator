pipeline{
    agent any
    tools{
        maven 'maven'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/vishwatejach/Calculator']])
                sh 'mvn clean install'
            }
        }

        stage('Build Docker Image'){
            steps{
                script{
                    sh 'docker build -t vishwatejach/calculator .'
                }
            }
        }
        stage('Push to DockerHub') {
            steps {
                script {
                        withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
                        sh "docker login -u vishwatejach -p $dockerhubpwd docker.io"
                        sh 'docker push vishwatejach/calculator'
                    }
                }
            }
        }
    }
}