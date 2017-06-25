package test.java;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)  //run with the junit command
@CucumberOptions(features="src/test/resources") //configuration for cucumber
public class TestCalculatorRunner {


}
