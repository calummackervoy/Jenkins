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
	      sh 'echo "current directory is:"'
	      sh 'pwd'
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
		sh 'echo "current directory is:"'
		sh 'pwd'
		sh './deploy.sh'
	   }
	}
    }
    post {
        always {
	    echo 'quick & dirty fix 3'
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
