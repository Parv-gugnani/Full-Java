public class main {
    public String solve(String A) {
        
        char[] chars = A.toCharArray();
        
        for(int i = 0;i < chars.length;i++){
        
            char curr = chars[i];
            if(Character.isLowerCase(curr)){
                chars[i] = Character.toUpperCase(curr);
            }
            else if(Character.isUpperCase(curr)){
                chars[i] = Character.toLowerCase(curr);
            }
        }
        return new String(chars);
        
    }
}
