package hellos;

/**
 * A simple Java program used to demonstrate merge conflicts when
 * multiple people edit the same piece of code.
 */
public class Hellos {

  public String generateOutput() {
    StringBuilder builder = new StringBuilder();

    builder.append(kkSaysHello());
    builder.append(nateSaysHello());
    builder.append(nicSaysHello());

    return builder.toString();
  }

  private String nicSaysHello() {
    return "Nic says 'Howdy!'\n";
  }

  private String nateSaysHello() {
    return "Nate says 'Hola!'\n";

  private String kkSaysHello() {
    return "KK says 'Hello!'\n";
  }

}
