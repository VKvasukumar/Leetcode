class Solution {
    public int countKeyChanges(String s) {
        String v = s.toLowerCase();
        int count = 0;
        for(int i = 0;i<v.length()-1;i++){
            if(v.charAt(i) != v.charAt(i+1)){
                count++;
            }
        }
        return count;
    }
}