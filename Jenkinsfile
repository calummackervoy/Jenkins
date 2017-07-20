pipeline {
    agent any

    /*environment {
	
    }*/

    stages {
        stage('build') {
            steps {
                /*sh 'mvn --version'*/
		sh 'echo "Hello World"'
		/*sh 'printenv'*/
            }
        }
	stage('test') {
	   steps {
	      pwd
              sh './Java/Jenkins/src/test/runtests.sh'
	   }
	}
	stage('sanity check') {
	   steps {
		input "Does everything look OK?"
	   }
	}
	/*common to split deploy into staging & production*/
	stage('deploy') {
	   steps {
		sh './deploy.sh'
	   }
	}
    }
    post {
        always {
	    archive 'build/libs/**/*.jar'
            junit 'build/reports/**/*.xml'
	    /*deleteDir() clean up our workspace */
        }
        success {
            echo 'RUN SUCCESSFUL'
        }
        failure {
            echo 'RUN FAILED'
        }
        unstable {
            echo 'RUN MARKED UNSTABLE'
        }
    }
}
