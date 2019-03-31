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
		stage('deploy') {
            steps {
                //bat 'copy tlt/target/GitSQLJavaWebTutorial.war TOMCAT_DIRECTORY/webapps/'
                bat 'copy target/GitSQLJavaWebTutorial.war C:/apache-tomcat-8.5.37-windows-x64/apache-tomcat-8.5.37/webapps'
            }
        }
	}
}