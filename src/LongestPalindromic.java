
public class LongestPalindromic {
	private int start;
	private int maxLen;

	public static void main(String[] args) {
		LongestPalindromic longPalindrmic=new LongestPalindromic();
		System.out.println(longPalindrmic.longestPalindrome("bb"));
	}

	public String longestPalindrome(String s) {
		int len=s.length();
			if (len < 2)
				return s;
			for (int i = 0; i < len - 1; i++) {
				getPalindrome(s, i, i);// for odd string
				getPalindrome(s, i, i + 1);// for even string
			}
			System.out.println("maxLen="+maxLen);
			System.out.println("start="+start);
		return s.substring(start, start + maxLen);
	}

	private void getPalindrome(String s, int m, int n) {
			while (m >= 0 && n < s.length() && s.charAt(m) == s.charAt(n)) {
				m--;
				n++;
			}
			if (maxLen < n - m - 1) {
				start = m + 1;
				maxLen = n - m - 1;
			}
		}
}
