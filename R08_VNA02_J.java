/* Rule 08. Visibility and Atomicity (VNA)
VNA02-J. Ensure that compound operations on shared variables are atomic */

/* noncompliant code
final class Flag {
  private volatile boolean flag = true;
 
  public void toggle() {  // Unsafe
    flag ^= true;
  }
 
  public boolean getFlag() { // Safe
    return flag;
  }
}
*/

//compliant code
final class Flag {
  private boolean flag = true;
 
  public synchronized void toggle() {
    flag ^= true; // Same as flag = !flag;
  }
 
  public synchronized boolean getFlag() {
    return flag;
  }
}