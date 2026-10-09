class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> out = new ArrayList<>();
        Set<Integer> alreadyIn = new HashSet<>(); 
        for(int i = 0;i < strs.length;i++){
            if(alreadyIn.contains(i)){
                continue;
            }
            List<String> temp = new ArrayList<>();
            temp.add(strs[i]);
            alreadyIn.add(i);
            for(int j = i+1;j < strs.length;j++){
                if(isAnagram(strs[i],strs[j])){
                  temp.add(strs[j]);  
                  alreadyIn.add(j);
                }
            }
            out.add(temp);
        }
        return out;

    }
        public boolean isAnagram(String a, String b){
            int[] abc = new int[26];
            if(a.length() == b.length()){
            for(int i = 0; i < a.length();i++){
                abc[a.charAt(i) - 'a']++;
                abc[b.charAt(i) - 'a']--;
            }
            }
            else{
                return false;}
            for (int num : abc) {
                if (num != 0) {
                    return false; 
                }
            }
        
        return true;                     
    }
}

