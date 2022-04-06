package dependency;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import utils.Utils;

import java.io.File;

@Mojo(name = "file-counter", defaultPhase = LifecyclePhase.COMPILE)
public class FileProjectMojo extends AbstractMojo {

    @Parameter(property = "scope")
    File scope;

    @Parameter(defaultValue = "${path}", required = true, readonly = true)
    MavenProject path;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {


        String filePath = "C:\\Users\\AEO\\Documents";
//        File file = new File(filePath);
        int countOfFiles = Utils.getCountOfFiles(scope);
        getLog().info("Number of file count in the given directory " + countOfFiles);
    }
}