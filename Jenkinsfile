pipeline {
    agent any
    echo "Branch name: ${BRANCH_NAME}"
    BUILD = BRANCH_NAME == 'master' ? 'latest' : BRANCH_NAME
    echo "Build: ${BUILD}"
    environment {
        HTTP_PROXY    = 'http://no-proxy.app.c9.equifax.com:3128'
        HTTPS_PROXY    = 'http://no-proxy.app.c9.equifax.com:3128'
    }

    stages {
        stage('Build') {
          steps {
            sh "echo 'Build in progress...'"
            sh '/var/jenkins_home/maven/bin/mvn clean package'
            sh 'docker build -t wilkhu90/micro1:${BUILD} .'
          }
        }
        stage('Test') {
          steps {
            echo 'Testing..'
          }  
        }
        stage('Deploy') {
          steps {
            echo 'Deploying....'
          }
        }
    }
}
