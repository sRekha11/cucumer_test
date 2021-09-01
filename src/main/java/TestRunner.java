import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features ={ "src/test/java/featureFiles" },
        plugin = {"pretty", "html:target/cucumber-html-report","json:target/cucumber.json","junit:target/cucumber.xml"},
        glue= {"helpers","classpath/stepDefinitions", "classpath/stepDefinitions.stepDefinitions"})

//public class TestRunner extends AbstractTestNGCucumberTests{
public class TestRunner{

//        @Override
//    public Object[][] scenarios(){
//        return super.scenarios();
//    }
}

