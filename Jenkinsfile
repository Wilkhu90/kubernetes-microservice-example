pipeline {
    agent any
    environment {
        HTTP_PROXY    = 'http://no-proxy.app.c9.equifax.com:3128'
        HTTPS_PROXY    = 'http://no-proxy.app.c9.equifax.com:3128'
    }

    stages {
       stage('Build') {
          steps {
            sh "echo 'Build in progress...'"
            sh 'mvn clean package'
            script {
              docker.build("wilkhu90/micro1:${env.BUILD_ID}")
            }
          }
        }
        stage('Test') {
          steps {
            echo 'Testing..'
            sh "mvn test"
          }  
        }
        stage('Deploy') {
          steps {
            echo 'Deploying....'
            script {
              docker.withRegistry('https://registry.hub.docker.com', 'docker-hub-id') {
                def app = docker.build("wilkhu90/micro1:${env.BUILD_ID}")
                app.push("${env.BUILD_ID}")
                app.push("latest")
              }
            }
          }
        }
    }
}
