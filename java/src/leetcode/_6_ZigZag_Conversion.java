package leetcode;

/**
 * @author jade on 16/7/16 上午9:23
 */
public class _6_ZigZag_Conversion {


  public static void main(String[] args) {
    _6_ZigZag_Conversion s = new _6_ZigZag_Conversion();
    System.out.println(s.convert("abcde", 2));
  }

  public String convert(String s, int k) {
    if (k <= 0) {
      return "";
    }
    if (k == 1 || s.length() <= k) {
      return s;
    }

    int interval = 2 * k - 2;
    int mid = interval;  // interval in process

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < k && i < s.length(); i++) {
      for (int j = i; j < s.length(); j = j + interval) {
        sb.append(s.charAt(j));
        if (mid != interval && mid != 0 && j + mid < s.length()) {
          sb.append(s.charAt(j + mid));
        }
      }
      mid -= 2;
    }
    return sb.toString();
  }


}
