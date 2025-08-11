class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
    int len = words.length;
    ArrayList<Integer> list  = new ArrayList<>();
    String s;
    
    for(int i = 0;i<len;i++){
        s=words[i];
        for(int j=0 ;j<s.length();j++){
            if(x==s.charAt(j)){
                list.add(i);
                break;
            }
        }
    }
    return list;
    }
}