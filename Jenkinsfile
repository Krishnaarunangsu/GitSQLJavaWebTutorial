pipeline {
	agent any
	stages {
	    stage('tomcat'){
	        steps{
	            bat 'startup'
	        }
	    }
		stage('SCM') {
			steps {
				git url: 'https://github.com/Krishnaarunangsu/GitSQLJavaWebTutorial.git'
			}
		}
		stage('build') {
			steps {
			            //bat 'startup'
					// Optionally use a Maven environment you've configured already
						//bat 'mvn package'
						withSonarQubeEnv('SonarAbzooba') {
					// Optionally use a Maven environment you've configured already
						bat 'mvn package sonar:sonar'
				}
			}
		}
		stage('database'){
	        bat '@echo on'
            bat 'cd src/database'
            bat 'mysql -hlocalhost -t -v -uroot -pabz00ba -Darunangsukrishna < "testclear.sql"'
            //startup.bat
            bat 'pause'
	    }
	}
}