echo "Branch name: ${BRANCH_NAME}"
BUILD = BRANCH_NAME == 'master' ? 'latest' : BRANCH_NAME
echo "Build: ${BUILD}"

node ('master') {
    checkout scm
    echo "Build: ${BUILD}"
    stage ('Build Building container') {
        echo "Build: ${BUILD}"
        sh "mvn clean package"
        sh "docker build -t wilkhu90/micro1:${BUILD} ."
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

