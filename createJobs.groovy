pipelineJob('pipelineJob') {
    definition {
        cps {
            script(this.readFileFromWorkspace('pipeline-demo-job.groovy'))
            sandbox()
        }
    }
}
pipelineJob('cryptography-build') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/soumyabrata09/Cryptography-Reference-App.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}