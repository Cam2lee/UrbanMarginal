<h1>Introduction</h1>

<h2>But de l'application</h2>
Urban Marginal est un jeu de combat en 2D, où plusieurs joueurs peuvent se retrouver dans une arène et
combattre. Le but est de tuer tous les autres joueurs.<br>
Pour jouer, il faut que le jeu soit lancé une fois en mode serveur, puis autant de fois que nécessaire en mode client
(un par joueur).

<h1>Configuration requise</h1>

<h2>1. Système d'exploitation</h2>
L'application est utilisable sur tous les systèmes d'exploitation

<h2>2. Configuration</h2>
La machine virtuelle Java (JVM) doit être installée (le chargeur d'application java.exe doit être présent sur
l'ordinateur). L'installation de JDK permet d'obtenir la machine virtuelle.

<h2>3. Installation</h2>
L'application ne nécessite pas d'installation. Il suffit de lancer le fichier Urban_Marginal.jar.


<h1>Utilisation</h1>

<h2>1. Lancer le serveur</h2>

![Connexion](https://github.com/user-attachments/assets/38e147d9-8432-4472-965b-a64f6e586b1f)

Cliquez sur Start pour lancer un serveur.
L'arène vide s'affiche<br>

![Arene](https://i.imgur.com/arWAVnN.png)

<br>
L'arène de jeu est constituée d'une zone de jeu contenant des murs infranchissables, d'une zone de discussion
affichant les échanges entre les joueurs.
Côté serveur, aucune manipulation n'est possible

<h2>2. Lancer un client</h2>
Lancer l'application. Vous obtenez la fenêtre de connexion :

![Connexion](https://github.com/user-attachments/assets/38e147d9-8432-4472-965b-a64f6e586b1f)

<br>
Dans la zone de texte, tapez l'adresse IP du serveur (laissez 127.0.0.1 si le serveur est sur le même ordinateur)
puis cliquez sur Connect.
La fenêtre du choix du personnage et du pseudo s'affiche :

![ChoixJoueur](https://github.com/user-attachments/assets/48b897b1-df50-4220-8668-2a6ec13003c3)
<br>
Avec les flèches, choisissez un personnage. Dans la zone de saisie, tapez un pseudo puis cliquez sur GO.
Vous entrez dans l'arène du jeu :

![Arene](https://i.imgur.com/nEG4Hy9.png)
<br>
Votre personnage s'affiche à une position aléatoire et, sous le personnage, il y a le login et la valeur de la vie (10
points au départ).
Dans la zone de discussion, un message informe de l'arrivée du joueur.<br>
Plusieurs clients peuvent ainsi se connecter et entrer dans la même arène.


<br>

<h2>3. Jouer</h3>
Chaque joueur à les possibilités suivantes : <br>
- Se déplacer (avec les 4 flèches) dans la limite de la taille de l'arène et sans pouvoir passer par-dessus un
obstacle (mur ou autre joueur).<br>
- Tirer une boule de feu (avec la barre d'espacement) pour tenter de toucher un autre joueur.<br>
- Discuter avec les autres joueurs (en saisissant une phrase dans la zone de saisie et en validant).
Attention, pendant la saisie, les autres touches sont inactives (flèches et barre d'espacement) : il faut
valider pour revenir au jeu.

![Arene](https://i.imgur.com/WPHORCf.png)

A chaque fois qu'un joueur touche un autre joueur, il gagne un point de vie et le joueur touché perd 2 points de vie.
Lorsqu'un joueur meurt, il reste allongé dans l'arène et ne peut plus rien faire.

<h2>4. Partir</h3>
Si un joueur ferme sa fenêtre, il disparaît de toutes les arènes.
Si le serveur ferme sa fenêtre, le jeu s'arrête et toutes les fenêtres des joueurs (clients) se ferment
automatiquement.
