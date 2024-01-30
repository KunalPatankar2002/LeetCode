class Solution {
    public int evalRPN(String[] tokens) {
        int i = 0, opr1, opr2, temp = 0;
        Stack<String> value = new Stack<String>();
        // expression += "\0";
        // while (expression.charAt(i) != '\0')
        for(String a: tokens) {
            try{
                temp = Integer.parseInt(a);
                value.push(a);
            }catch(Exception e){
                opr2 = Integer.parseInt(value.pop());
                opr1 = Integer.parseInt(value.pop());
                switch (a) {
                    case "/":
                        temp = opr1 / opr2;
                        break;
                    case "*":
                        temp = opr1 * opr2;
                        break;
                    case "+":
                        temp = opr1 + opr2;
                        break;
                    case "-":
                        temp = opr1 - opr2;
                        break;
                }
                value.push(String.valueOf(temp));
            }
        }
        return Integer.parseInt(value.peek());
    }   
}