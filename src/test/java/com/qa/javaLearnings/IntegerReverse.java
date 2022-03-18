package com.qa.javaLearnings;

public class IntegerReverse {

	public static void main(String[] args) {
		
		System.out.println(reverse(123));
		System.out.println(reverse(-123));
		System.out.println(reverse(120));
		System.out.println(reverse(0));
		System.out.println(reverse(1534236469));
	}

	public static int reverse(int x) {
		
		int rev = 0;
        while (x != 0) {
            int rem = x % 10;
            x = x/10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && rem > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && rem < -8)) return 0;
            rev = rev * 10 + rem;
        }
        return rev;
    }

}
