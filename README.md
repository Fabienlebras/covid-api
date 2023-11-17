
## Build en local

1. Ouvrez un terminal ou une invite de commande.

2. Exécutez la commande suivante pour cloner le repository :
      git clone https://github.com/Fabienlebras/covid-api.git
3. Accédez au répertoire du projet :
      cd covid-api

4. Exécutez la commande Gradle pour construire le projet :
      gradle build
5. Exécutez la commande suivante pour démarrer l'application avec Docker Compose :
      docker-compose up --build -d
Ensuite, l'application sera disponible à l'adresse http://localhost:8080.
6. Test de l'application :
    Vous pouvez accéder à l'url : "localhost:8080/test", si vous obtenez le message "Hello" cela veut dire que l'application est bien lancé.

## Build en utilisant Jenkins 

1. Installation de Jenkins :

   Une image de jenkins est disponible sur ce repository :  https://github.com/jredel/jenkins-compose.git.
   pour accéder à jenkins, il est nécessaire  de cloner ce repository à l'aide de la commande : git clone  https://github.com/jredel/jenkins-compose.git
   puis d'utiliser la commande dockerc compose-up --build -d et accéder à jenkins sur l'url : localhost:8001 .
   Le mot de passe admin se trouve dans le dossier covid-api\jenkins-compose\data\jenkins_home\secret.key

2. Création d'un compte Docker-Hub et un repository "miseenprod" sur le lien suivant : 
   " https://hub.docker.com/"
3. Ajoutez vos identifiants Docker sur Jenkins en suivant le chemin suivant :

   Dashboard / Manage Jenkins / Credentials / System / Global credentials

   L'id du credential doit être : "docker"
4. Créez une Pipeline :
   Récupérez le contenu du fichier Jenkinsfile sur le repository  et modifier la partie "fabienlebras" sur les lignes suivantes pour mettre le lien correspondant au repository : 

      sh 'docker build -t fabienlebras/miseenprod:mep .'
      sh 'docker push fabienlebras/miseenprod:mep'

5.  Une fois  la pipeline executée, vous aurez accès à l'application.

La partie 5 n'a pas fonctionné dans mon cas, lors du push vers mon dockerHub, le push ne renvoyait pas d'erreur mais ne se finissait jamais malgré plusieurs tentatives. Cela est peut-être dû  à ma connexion internet.


