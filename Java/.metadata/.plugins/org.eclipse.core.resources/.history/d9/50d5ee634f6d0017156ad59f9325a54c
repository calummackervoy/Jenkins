package jenkins;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
  final static String configFileLocation = "config.txt";

  public static void main(String[] args) {

  }

  public static boolean readConfig() {
    try {
      for (String line : Files.readAllLines(Paths.get(configFileLocation))) {
        //do something
      }
      return true;
    }
    catch(Exception e) {
      return false;
    }
  }
}