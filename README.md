#  ![](https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/i/8939caba-2c60-4aeb-bb20-d61b0458b178/d8w4iw2-5fb1b71f-3c66-4d45-a3fb-44bab70cafca.jpg)  Mafia.EDU : Suivi des étudiants dans une formation à la carte. 
L3 Miage, projet de programmation


[![forthebadge](http://forthebadge.com/images/badges/built-with-love.svg)](http://forthebadge.com)  [![forthebadge](http://forthebadge.com/images/badges/powered-by-electricity.svg)](http://forthebadge.com)

L’objet de l’application est de suivre les étudiants : les inscrire aux enseignements, voir où ils en sont de leur
parcours et saisir les enseignement validés.

## Pour commencer
**Fonctionnalité :**
Inscrire un étudiant à un enseignement
voir parcours d’un étudiant 
ajouter enseignement validés
1 année universitaire : 2020-2021 avec 2 Semestre : pair (début) & impair (fin)

**Formations et UE :**

1 formation : 1 mention & plusieurs parcours ( mention MIASHS parcours MIAGE)
Chaque cours possède des UE lié à des mentions
1 UE : crédits ECTS & codeUE
Faire des prérequis.
UE sans prérequis : semestre pair

**Etudiant:**

Défini par numEtu, prénom, nom et inscrit à un parcours d’une mention
Chaque étudiant aura un suivi de toute ses UE + Année correspondante à l’UE ( soit 2 variables UE/ANNEE) et si validé.

**Objectif:**

Charger les données d’un CSV et l’envoyer sur la BD. CSV = { Mentions, parcours, UE, liste etudiants}
Charger la BD avec un document depuis le PC.
Rôle d’utilisateur : directeur d’étude, secrétariat pédagogique, bureau des examens, étudiant

**Visualisation  :**

”Directeur d’étude”;  liste des étudiants, triables par mention et parcours.
Pouvoir sélectionner un étudiant.
Accessible:
- les UE que l’étudiant a déjà validé 
- les UE que l’étudiant suit actuellement (potentiellement vide en inter-semestre) 
- les UE pour lesquels l’étudiant a les prérequis. C

Pouvoir filtrer par mention &parcours, voir les UE d’ouverture.

**Inscriptions:**

"Secretariat Pedagogique”. Accès à la liste d’étudiant, la sélection d’un étudiant et affiche la liste des UE dont l’étudiant a les prérequis. Pouvoir filtrer & trier la liste.
**Saisie des résultats:**
"Bureau des examens”. Donne accès à la liste des UE triable et filtrable, sélectionner une UE donne la liste des étudiants inscrits, avec possibilité de cocher si l’UE est validée.



### Pré-requis

- des fichiers de données permettant de tester extensivement les fonctionnalités de l’application.
- la javadoc de l'application
- un diagramme de classes.
- un fichier .jar permettant le déploiement de l’application.
- le MCD 

### Installation

- Telecharger XAMP
- Ouvrir Apache & MySql
- Se rendre sur PHPMyAdmin pour accéder à la BD
- Ouvrir le .jar


## Fabriqué avec

Programmes/logiciels/resources que nous avons utilisé pour développer notre projet :

* [Netbeans 8.2](https://netbeans.org/downloads/8.2/rc/) 
* [SQL Connector Java ](https://dev.mysql.com/downloads/connector/j/) - Connexion entre le code et notre base de donnée.
* [GIT & GITHUB](https://github.com/) - Travail collaboratif
* [PHPMyAdmin](https://www.phpmyadmin.net/) - Base de donnée



## Versions

**Dernière version stable :** Pas encore de release.
**Dernière version :** Pas encore de release.

Liste des versions : [Cliquer pour afficher](https://github.com/mafia.EDU/tags) 

## Auteurs

* **Noureddine BEKHDADI** _alias_ [@staratwars](https://github.com/staratwars)
* **Gaetan SCOPEL** _alias_ [@Jeaneyamarre](https://github.com/Jeaneyamarre)





