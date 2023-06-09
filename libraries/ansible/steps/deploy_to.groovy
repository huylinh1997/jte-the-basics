void call(environment){
    stage("Deploy To: ${environment.environment.APP_NAME}"){
        println "performing a deployment through ansible.."
    }
}
