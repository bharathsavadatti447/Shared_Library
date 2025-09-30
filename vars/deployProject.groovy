def call (String deploy_Path = './', String artifact = './') {
    echo "Deploying Artifact ${artifact} to ${deploy_Path}"
    sh 'cp ${artifact} ${deploy_Path}'
}
