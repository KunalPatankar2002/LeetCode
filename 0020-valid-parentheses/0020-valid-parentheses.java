class Solution {
    public boolean isValid(String str) {
        stack_opr s = new stack_opr();
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            switch (temp) {
                case '(', '{', '[':
                    s.push(temp);
                    break;
                case ')':
                    if (s.pop() != '(')
                        return false;
                    break;
                case '}':
                    if (s.pop() != '{')
                        return false;
                    break;
                case ']':
                    if (s.pop() != '[')
                        return false;
                    break;
            }
        }
        if (s.pop() != '\0')
            return false;
        return true;
    }
}
class node {
    char data;
    node next;
}

class stack_opr {
    node head;

    void disp() {
        node t;
        t = head;
        while (t != null) {
            System.out.println(t.data);
            t = t.next;
        }
    }

    void push(char n) {
        node nn = new node();
        nn.data = n;
        nn.next = head;
        head = nn;
    }

    char pop() {
        if (head == null) {
            // System.out.println("Underflow");
            return 0;
        }
        char temp = head.data;
        head = head.next;
        return temp;
    }
}