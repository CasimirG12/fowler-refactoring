import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {
  @Test
  public void testConstructorAndGetters() {
    Customer customer = new Customer("Jan");
    assertEquals("Jan", customer.getName());
  }
}
