/* Rule 09. Locking (LCK)
LCK01-J. Do not synchronize on objects that may be reused */

/* noncompliant code
// This bug was found in jetty-6.1.3 BoundedThreadPool
private final String lock = "LOCK";
 
public void doSomething() {
  synchronized (lock) {
    // ...
  }
}
*/

//compliant code
private final String lock = new String("LOCK");
 
public void doSomething() {
  synchronized (lock) {
    // ...
  }
}