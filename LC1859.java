class Solution {
    public String sortSentence(String s) {
        String str []= s.split(" ");
        Map<Integer , String > map = new HashMap<>();
        for(int i =0;i<str.length;i++){
            int lastInd=str[i].length()-1;
            int lastVal=str[i].charAt(lastInd)-'0';
            String prefix = str[i].substring(0,lastInd);
            map.put(lastVal , prefix);
        }
        StringBuilder fin = new StringBuilder();
        for(int i=1; i<=str.length;i++){
            fin.append(map.get(i)+" ");
        }
        return new String(fin).trim();
    }
}