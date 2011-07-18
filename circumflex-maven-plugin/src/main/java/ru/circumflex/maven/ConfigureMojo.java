package ru.circumflex
package maven;
import java.io.File;

/**
 * @goal cfg
 */
public class ConfigureMojo extends AbstractConfigureMojo {

  /**
   * @parameter default-value="${project.build.outputDirectory}/cx.properties"
   */
  protected File targetFile;

  public File targetFile() {
    return targetFile;
  }
}
