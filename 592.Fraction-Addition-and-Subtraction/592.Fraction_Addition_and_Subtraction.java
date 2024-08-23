class Solution {
    public String fractionAddition(String expression) {
        int num = 0;
        int denom = 1;
        int i = 0;
        while(i < expression.length()) {
            int currNum = 0;
            int currDenom = 0;
            int isNegative = 0;
            if(expression.charAt(i) == '-' || expression.charAt(i) == '+') {
                if(expression.charAt(i) == '-') {
                    isNegative = 1;
                }
                i++;
            }
            while(Character.isDigit(expression.charAt(i))) {
                int val = expression.charAt(i) - '0';
                currNum = currNum * 10 + val;
                i++;
            }
            if(isNegative == 1) currNum *= -1;
            i++;
            while(i < expression.length() && Character.isDigit(expression.charAt(i))) {
                int val = expression.charAt(i) - '0';
                currDenom = currDenom * 10 + val;
                i++;
            }
            num = num * currDenom + currNum * denom;
            denom = denom * currDenom;
        }

        int gcd = Math.abs(FindGCD(num, denom));
        num /= gcd;
        denom /= gcd;
        return num + "/" + denom;
    }

    public int FindGCD(int a, int b) {
        if(a == 0) return b;
        return FindGCD(b % a, a);
    }
}