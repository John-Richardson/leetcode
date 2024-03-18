class Solution {
    public boolean isValid(String s) {
        if(s.length()<2) return false;
        Stack<Character> opens = new Stack<>();
        for (char c : s.toCharArray()){
            switch(c){
                case '[':
                case '{':
                case '(':
                    opens.push(c);
                break;
                case ']':
                case '}':
                case ')':
                    if(opens.size()==0) return false;
                    pair p = new pair(opens.pop());
                    if(!p.isClose(c)) return false;
            }
        }
        return opens.size() ==0;
    }
    class pair{
        private char open;
        public pair(char open){
            this.open = open;
        }
        public boolean isClose(char close){
            switch(open){
                case '[':
                    return close == ']';
                case '{':
                    return close == '}';
                case '(':
                    return close == ')';
            }
            return false;
        }
    }
}