def call (String repo_url='', String branch = 'main') {
    echo "Cloning the Repository ${repourl}, branch ${branch}"
    git branch: branch, url: repo_url
}