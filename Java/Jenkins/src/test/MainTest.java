package test;
import junit.framework.*;
import jenkins.Main;

public class MainTest extends TestCase {
  public void testConfigSuccessful() {
    assertTrue(Main.readConfig());
  }
}
