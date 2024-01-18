package hellos;

/**
 * A simple Java program used to demonstrate merge conflicts when
 * multiple people edit the same piece of code.
 */
public class Hellos {

  public String generateOutput() {
    StringBuilder builder = new StringBuilder();

    builder.append(jackSaysHello());
    builder.append(kkSaysHello());
    builder.append(nicSaysHello());

    return builder.toString();
  }

  private String jackSaysHello() {
    // TODO Auto-generated method stub
    return "Jack says 'Hello!'\n";
  }

  private String nicSaysHello() {
    return "Nic says 'Howdy!'\n";
  }

  private String kkSaysHello() {
    return "KK says 'Hello!'\n";
  }

}
