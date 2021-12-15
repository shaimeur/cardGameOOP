# cardGameOOP
Contexte du projet
Vous êtes médiateur numérique et on vous demande de faire des ateliers de jeux aux profils des apprenants YouCode.

L’équipe pédagogique décide de créer un jeu de cartes qui aident les apprenants à s’amuser.

​

Le jeu comporte au plus 10 cartes. Il existe trois types de cartes : les terrains, les créatures et les sortilèges.

​

• Les terrains possèdent une couleur : blanche('B'), bleue ('b'), noir ('n'), rouge ('r') et verte ('v').

• Les créatures possèdent un nom, un nombre de points de dégâts et un nombre de points de vie.

• Les sortilèges possèdent un nom et une explication sous forme de texte.

​

Distribuer aléatoirement 12 cartes à chaque joueur. Simultanément chaque joueur joue une carte, la carte la plus forte emporte le pli. Quand toutes les cartes sont jouées, chaque joueur fait la somme des nombres portés par les cartes, le plus fort total l'emporte.

Chaque carte, indépendamment de son type, possède un coût ( ou une valeur). Celui d'un terrain est 0. Proposez et implémentez une hiérarchie de classes permettant de représenter des cartes de différents types.

​

Valeur des cartes

​

• Les cartes sortilèges l'emportent sur les cartes terrains et créatures.

• Les cartes créatures l'emportent sur les cartes terrains.

• Si deux cartes créatures sont jouées en même temps la plus grande l'emporte.

• Si deux cartes terrains sont jouées en même temps la plus grande l'emporte

• Si deux cartes identiques sont jouées en même temps, les cartes sont écartées et ne compoteront pas dans le total final.

​

Le jeu comportera également une méthode permettant de jouer une carte. Pour simplifier, on jouera les cartes dans l'ordre où elles sont stockées dans le jeu, et on mettra la carte jouée à null dans le jeu de cartes.

Modalités pédagogiques
Travail individuel
Durée 3 jours

Critères de performance
Le code produit doit respecter les consignes expliquées dans le contexte du brief.

Modalités d'évaluation
Présentation orale du travail. Effectuer les modifications demandés par le formateur, le back-end reste fonctionnel.

Livrables
Vous discuterez des concepts que vous avez abordés, ce que vous avez compris, ce que vous n'avez pas compris. Le but de cette discussion est que le groupe monte en compétence.

A la suite de cette discussion, le groupe écrira un redu décrivant ce que vous avez abordé (les principes de la programmation orientée objet) et compris dans un fichier. Ce fichier sera poussé sur simplonLine.