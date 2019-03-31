pipeline {
	agent any
	stages {
	    stage('Initialize') {
			steps {
				//enable remote triggers
				script {
					properties([
                        pipelineTriggers([[$class: "GitHubPushTrigger"]])
                    ])
				}
				//define scm connection for polling
				git branch: 'master', credentialsId: 'Arun', url: 'https://github.com/Krishnaarunangsu/GitSQLJavaWebTutorial.git'
			}
		}
		stage('SCM') {
			steps {
				git url: 'https://github.com/Krishnaarunangsu/GitSQLJavaWebTutorial.git'
			}
		}
		stage('build && SonarQube analysis') {
			steps {
				withSonarQubeEnv('SonarAbzooba') {
					// Optionally use a Maven environment you've configured already
						bat 'mvn clean package sonar:sonar'
				}
			}
		}
	}
}