/* Rule 07. Exceptional Behavior (ERR)
ERR00-J. Do not suppress or ignore checked exceptions */

/* noncompliant code
class Foo implements Runnable {
  public void run() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      // Ignore
    }
  }
}*/

class Foo implements Runnable {
  public void run() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt(); // Reset interrupted status
    }
  }
}