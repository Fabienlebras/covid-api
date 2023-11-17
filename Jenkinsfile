pipeline {
    agent any

    stages {
        stage('Git clone') {
            steps {
                script {
                    git branch: 'main', url: 'https://github.com/Fabienlebras/covid-api.git'
                }
            }
        }
        stage("Docker login") {
    steps {
        withCredentials([usernamePassword(credentialsId: 'docker', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {
            sh "docker login -u $DOCKER_USERNAME -p $DOCKER_PASSWORD"
        }
    }
}
         stage('Docker Build and push') {
            steps {
                script {
              sh 'docker build -t fabienlebras/miseenprod:mep .'
              sh 'docker push fabienlebras/miseenprod:mep'
                }
            }
        }

}
}
