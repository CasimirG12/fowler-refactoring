import org.junit.Test;
import static org.junit.Assert.*;

public class MovieTest {

  @Test
  public void testConstructorAndGetters() {
    Movie movie = new Movie("Inception", Movie.NEW_RELEASE);
    assertEquals("Inception", movie.getTitle());
    assertEquals(Movie.NEW_RELEASE, movie.getPriceCode());
  }

  @Test
  public void testSetPriceCode() {
    Movie movie = new Movie("The Matrix", Movie.REGULAR);
    movie.setPriceCode(Movie.CHILDRENS);
    assertEquals(Movie.CHILDRENS, movie.getPriceCode());
  }
}
