pipelineJob('pipeline-demo') {
    definition {
        cps {
            script(this.readFileFromWorkspace(pipeline-demo-job.groovy))
            sandbox()
        }
    }
}