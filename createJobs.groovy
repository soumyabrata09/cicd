pipelineJob('pipelineJob') {
    definition {
        cps {
            script(this.readFileFromWorkspace('pipeline-demo-job.groovy'))
            sandbox()
        }
    }
}