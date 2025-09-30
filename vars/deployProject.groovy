def call (String deploy_Path = '', String artifact = '') {
    echo "Deploying Artifact ${artifact} to ${deploy_Path}"
    sh 'scp ${artifact} ${deploy_Path}'
}