pipeline {
    agent any

    stages {
        stage ('GetProject') {
            steps {
                git 'https://github.com/clusson1/Springboot.git'
            }
        }
        stage ('Build and Package') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage ('Exec') {
            steps {
                sh 'java -jar target/ct5171_springBoot*.jar'
            }
        }
    }
    post {
        success {
            archiveArtifacts allowEmptyArchive: true,
                artifacts: '**/ct5171_springBoot*.jar'
        }
    }
}
