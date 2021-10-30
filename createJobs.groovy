pipelineJob('pipeline-demo') {
    definition {
        cps {
            script(readFileFromWorkspace(pipeline-demo-job.groovy))
            sandbox()
        }
    }
}