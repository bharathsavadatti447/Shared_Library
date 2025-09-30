def call (String build = 'mvn clean pakage') {
    echo "Building Project..."
    sh 'build'
}