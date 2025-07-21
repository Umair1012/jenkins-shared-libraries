def call(String composeFile) {
    sh """
        docker-compose -f ${composeFile} --env-file .env down
        docker-compose -f ${composeFile} --env-file .env pull
        docker-compose -f ${composeFile} --env-file .env up -d --remove-orphans
    """
}
