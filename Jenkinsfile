import groovy.json.JsonSlurperClassic

def jsonParse(def json){
    new groovy.json.JsonSlurperClassic().perseText(json)
}

pipeline{
    agent any
    environment{
        appName = "variable"
        GRADLE_HOME = tool "Gradle"
    }
    stages{
        stage('Build'){
            steps{
                script{
                    bat "{$GRADLE_HOME}\\gradle build"
                }
            }
        }
    }
    post{
        always{

            echo "Fase Always"
        }
        success{
            echo "Fase Success"
        }
        failure{
            echo "Fase Failure"
        }
    }
}
