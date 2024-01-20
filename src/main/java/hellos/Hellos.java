package hellos;

/**
 * A simple Java program used to demonstrate merge conflicts when
 * multiple people edit the same piece of code.
 */
public class Hellos {

  public String generateOutput() {
    StringBuilder builder = new StringBuilder();
    builder.append(alijaSaysHello());
    builder.append(kkSaysHello());
    builder.append(linneaSaysHello());
    builder.append(nicSaysHello());
    return builder.toString();
  }

  private String alijaSaysHello() {
    return "Alija says 'Howdy!'\n";
  }

  private String kkSaysHello() {
    return "KK says 'Hello!'\n";
  }

  private String linneaSaysHello() {
    return "Linnea says 'Hi!'\n";
  }

  private String nicSaysHello() {
    return "Nic says 'Howdy!'\n";
  }

}
