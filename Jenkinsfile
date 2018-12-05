pipeline {
    agent any

    environment {
        HTTP_PROXY    = 'http://no-proxy.app.c9.equifax.com:3128'
        HTTPS_PROXY    = 'http://no-proxy.app.c9.equifax.com:3128'
    }

    stages {
        stage('Build') {
            steps {
                sh 'printenv'
                sh '/var/jenkins_home/maven/bin/mvn clean package'
            }
        }
    }
}
