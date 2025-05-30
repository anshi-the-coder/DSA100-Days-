class Solution {
    public boolean isAnagram(String s, String t) {
         if (s.length() != t.length()){ 
            return false;
}
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        
        return Arrays.equals(sArray, tArray);
    }
    

    public static void main(String[] args) {
         Solution solution = new Solution();  
        System.out.println(solution.isAnagram("anagram", "nagaram"));  // true
        System.out.println(solution.isAnagram("rat", "car"));          // false
    }
}
