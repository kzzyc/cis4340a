/* Rule 05. Object Orientation (OBJ)
OBJ01-J. Limit accessibility of fields */

/* noncompliant code 
public static final HashMap<Integer, String> hm = new HashMap<Integer, String>();
*/


private static final HashMap<Integer, String> hm = new HashMap<Integer, String>();
 
public static String getElement(int key) {
  return hm.get(key);
}