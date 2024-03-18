class Solution {
    public  int calPoints(String[] operations) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        for (String s : operations){
            switch (s) {
                case "C":
                    result -= stack.pop();
                    break;
                case "D":
                    int newVal = stack.peek() * 2;
                    result += newVal;
                    stack.push(newVal);
                    break;
                case "+":
                    int prev = stack.pop();
                    int newVal2 = prev + stack.peek();
                    result += newVal2;
                    stack.push(prev);
                    stack.push(newVal2);
                    break;
                default:
                    int score = Integer.valueOf(s);
                    stack.push(score);
                    result += score;
                    break;
            }
        }
        System.out.println(result);
        return result;
    }
}