package hellos;

/**
 * A simple Java program used to demonstrate merge conflicts when
 * multiple people edit the same piece of code.
 */
public class Hellos {

  public String generateOutput() {
    StringBuilder builder = new StringBuilder();

    builder.append(andreasSaysHello());
    builder.append(elySaysHello());
    builder.append(jadenSaysHello());
    builder.append(kkSaysHello());
    builder.append(KenSaysHello());
    builder.append(nicSaysHello());
    builder.append(patSaysHello());

    return builder.toString();
  }

  private String elySaysHello() {
    return "Ely says 'How's it going!'\n";
  }

  private String KenSaysHello() {
    return "Ken says 'whats up!'\n";
  }

  private String andreasSaysHello() {
    return "Andreas says 'Aloha!'\n";
  }

  private String patSaysHello() {
    return "Pat says 'Hello to everyone!'\n";
  }

  private String nicSaysHello() {
    return "Nic says 'Howdy!'\n";
  }

  private String kkSaysHello() {
    return "KK says 'Hello!'\n";
  }

  private String jadenSaysHello() {
    return "Jaden says 'Yo!'\n";
  }

}
