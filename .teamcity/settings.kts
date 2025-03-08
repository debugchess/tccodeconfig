import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.script

version = "2024.03"

project {
    buildType {
        id("Tccodeconfig")
        name = "Hello World Build"

        vcs {
            root(DslContext.settingsRoot)
        }

        steps {
            script {
                name = "Print Hello World"
                scriptContent = """
                    #!/bin/bash
                    echo "Hello, World!"
                """.trimIndent()
            }
        }
    }
}