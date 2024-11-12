class Solution {
    public boolean isPalindrome(int x) {
        boolean answer = false;

        String str = String.valueOf(x);
        char[] arr = str.toCharArray();
        char[] newArr = new char[arr.length];

        for(int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr.length-i-1];
        }

        String newStr = String.valueOf(newArr);

        if(newStr.equals(str)) {
            answer = true;
        }
        return answer;
    }
}