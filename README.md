# Présentation

Cette présentation écrite en HTML 5 a pour titre `Vos tests ont besoin d'amour`.

Son but est d'expliquer comment faire des tests efficaces et rentables. Plus d'informations sur son contenu
[ici](http://www.fierdecoder.fr/2014/11/vos-tests-ont-besoin-damour/).

# Visualiser

## En ligne

La présentation est visible en ligne [ici](http://files.fierdecoder.fr/your-tests-need-love/).

## Sur un serveur web

Simplement placer l'ensemble des fichiers dans un répertoire du serveur web et y accéder.

## Avec Docker

### Build an image

At the root directory, this command will build a Ubuntu based image embedding the presentation.

    docker build -t your-tests-need-love .

### Run the image in a container

Once the image is built

    docker run -P -d your-tests-need-love

List running containers. This enables to retrieve the name of the running container.

    docker ps

Find the port

    docker port <container-name> 8000

Open your browser to `http://localhost:<port>/`

### Stop the container

    docker stop <container-name>
