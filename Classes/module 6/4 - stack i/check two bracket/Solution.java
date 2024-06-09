public class Solution {

    int MAX_CHAR = 26;

    public int solve(String A, String B) {
        if (areSame(A, B))
            return 1;
        return 0;
    }

    Boolean areSame(String expr1, String expr2) {
        int v[] = new int[MAX_CHAR];
        eval(expr1, v, true);
        // calls the second expression with opposite sign
        eval(expr2, v, false);
        // checks if both the expressions are equal
        for (int i = 0; i < MAX_CHAR; i++)
            if (v[i] != 0)
                return false;
        return true;
    }

    void eval(String s, int v[], Boolean add) {
        Stack < Boolean > stk = new Stack < Boolean > ();
        stk.push(true);
        int i = 0;
        // we evaluate the contribution of each character in the expression
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c == '+' || c == '-') {
                i++;
                continue;
            }
            if (c == '(') {
                if (adjSign(s, i))
                    stk.push(stk.peek());
                else
                    stk.push(!stk.peek());
            } else if (c == ')')
                stk.pop();
            else {
                if (stk.peek())
                    v[c - 'a'] += (adjSign(s, i) ? add ? 1 : -1 :
                        add ? -1 : 1);
                else
                    v[c - 'a'] += (adjSign(s, i) ? add ? -1 : 1 :
                        add ? 1 : -1);
            }
            i++;
        }
    }
    
    Boolean adjSign(String s, int i) {
        if (i == 0)
            return true;
        if (s.charAt(i - 1) == '-')
            return false;
        return true;
    };
}