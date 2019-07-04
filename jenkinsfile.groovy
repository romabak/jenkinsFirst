pipeline{
    agent {lable 'backend'}
    stage('Build'){
        steps{
            echo 'Hello World'
        }
    }
}