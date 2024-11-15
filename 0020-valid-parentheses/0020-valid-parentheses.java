class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            
            if(c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    return false;
                }

                if (c == ')' && st.peek() == '(') {
                    st.pop();
                } else if (c == '}' && st.peek() == '{') {
                    st.pop();
                } else if (c == ']' && st.peek() == '[') {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        
        return st.isEmpty();
    }
}