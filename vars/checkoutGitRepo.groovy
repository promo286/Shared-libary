def checkoutGitRepo(String branch = 'master', String repoUrl) {
    checkout([
        $class: 'GitSCM',
        branches: [[name: "*/${branch}"]],
        extensions: [],
        userRemoteConfigs: [[url: repoUrl]]
    ])
}
