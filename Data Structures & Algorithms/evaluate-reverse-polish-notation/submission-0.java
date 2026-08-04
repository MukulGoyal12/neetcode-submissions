class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> nums = new Stack<>();

        for(String s:tokens){
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int top=nums.pop();
                int next=nums.pop();
                int ele=0;
                switch(s){
                    case "+":
                        ele=top+next;
                        break;
                    case "-":
                        ele=next-top;
                        break;
                    case "*":
                        ele=top*next;
                        break;
                    case "/":
                        ele=next/top;
                        break;
                }
                nums.push(ele);
            }else{
                nums.push(Integer.parseInt(s));
            }
        }

        return nums.pop();
    }
}
