package testcases;

import base.ProjectSpecificmethod;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/main/java/feature/TC01_Login.feature",glue="pages")
public class Runner extends ProjectSpecificmethod{

}
