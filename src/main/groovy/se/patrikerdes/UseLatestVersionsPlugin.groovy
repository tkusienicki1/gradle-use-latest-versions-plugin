package se.patrikerdes

import groovy.transform.CompileStatic
import org.gradle.api.Project
import org.gradle.api.Plugin

@CompileStatic
class UseLatestVersionsPlugin implements Plugin<Project> {
    void apply(Project project) {
        System.setProperty('outputFormatter', 'json')
        project.task('useLatestVersions', type: UseLatestVersionsTask, dependsOn: 'dependencyUpdates')
    }
}