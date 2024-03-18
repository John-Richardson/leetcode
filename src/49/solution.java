class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<ExtraCrap, List<String>> grouped = new HashMap<ExtraCrap, List<String>>();
        
        for (String s : strs){
            ExtraCrap ec = new ExtraCrap();
            for(char c : s.toCharArray())            {
                ec.chars[(int) c - (int)'a']++;
            }
            
            if(!grouped.containsKey(ec)){
                grouped.put(ec, new ArrayList<String>());
            }

            grouped.get(ec).add(s);
        }

        return new ArrayList<List<String>>(grouped.values());
    }

    class ExtraCrap{
        public int[] chars = new int[26];
        @Override
        public boolean equals(Object o){
            if(! (o instanceof ExtraCrap)) return false;
            return java.util.Arrays.equals(this.chars, ((ExtraCrap)o).chars);
        }

        @Override
        public int hashCode(){
            return java.util.Arrays.hashCode(this.chars);
        }
    }
}