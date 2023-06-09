void call(){
    stage("Deploy To: ${env.APP_NAME}"){
        println "performing a deployment through ansible.."
    }
}
