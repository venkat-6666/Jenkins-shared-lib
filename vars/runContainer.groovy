def call(String imageName = "java-app:latest", String containerName = "java-container", int port = 8080) {
    stage('Run Container') {
        echo "Running Container ${containerName}..."
        sh """
            docker run -d --name ${containerName} -p ${port}:${port} ${imageName}
        """
        echo "Container ${containerName} is running on port ${port}"
    }
}


