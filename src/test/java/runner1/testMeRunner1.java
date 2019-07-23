package runner1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome= true, features="Features\\tag_demo1.Feature",tags= {"@SmokeTest","~@End2End"})

public class testMeRunner1 {

}
