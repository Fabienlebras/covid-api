pipeline {
    agent any

    stages {
        stage('Git clone') {
            steps {
                script {
                    git branch: 'main', url: 'https://github.com/Fabienlebras/covid-api.git'
                    
                    // Ajoutez la commande pour vérifier la présence du dossier build/libs/
                    bat 'dir build\\libs'
                }
            }
        }
        stage("Docker login") {
    steps {
        withCredentials([usernamePassword(credentialsId: 'docker', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {
            bat "docker login -u $DOCKER_USERNAME -p $DOCKER_PASSWORD"
        }
    }
}
         stage('Docker Build') {
            steps {
                script {
              bat 'docker build -t fabienlebras/miseenprod:mep .'
                    bat 'docker push fabienlebras/miseenprod:mep'


                }
            }
        }

}
}
