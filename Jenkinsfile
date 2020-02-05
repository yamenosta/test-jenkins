
pipeline {
agent any 
stages {
  stage('Build') {
    steps {
    sh '/opt/maven/bin/mvn clean install'
    }
  }
  stage ('Test') {
    steps {
    sh '/opt/maven/bin/mvn test'
    }
   }
}
}
