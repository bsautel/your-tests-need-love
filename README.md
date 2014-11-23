# Run with Docker

## Build an image

At the root directory

    docker build -t your-tests-need-love .

## Run the image in a container

Once the image is built

    docker run -P -d your-tests-need-love

List running containers. This enables to retrieve the name of the running container.

    docker ps

Find the port

    docker port <container-name> 8000

Open your browser to `http://localhost:<port>/`

## Stop the container

    docker stop <container-name>
