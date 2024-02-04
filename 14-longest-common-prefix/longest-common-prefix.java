class Solution {
    // sort alphabetically
    public String longestCommonPrefix(String[] strs) {
        String[] sortedStrs = Arrays.stream(strs).sorted().toArray(String[]::new);
        String first = sortedStrs[0];
        String last = sortedStrs[sortedStrs.length - 1];
        String commonPrefix = "";
        
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) == last.charAt(i)) {
                commonPrefix += first.charAt(i);
            } else {
                break;
            }
        }
        
        return commonPrefix;
    }

    // sort by length
    // public String longestCommonPrefix(String[] strs) {
    
    //     String[] sortedStrs = Arrays.stream(strs)
    //             .sorted(Comparator.comparingInt(String::length))
    //             .toArray(String[]::new);

    //     String commonPrefix = sortedStrs[0];
    //     for (String str : sortedStrs) {
    //         commonPrefix = getCommonPrefix(commonPrefix, str);
    //         if (commonPrefix.isEmpty()) {
    //             return "";
    //         }
    //     }
        
    //     return commonPrefix;
    // }
    
    // private String getCommonPrefix(String s1, String s2) {
    //     int i1 = 0;
    //     int i2 = 0;
    //     String commonPrefix = "";
        
    //     while (i1 < s1.length() && i2 < s2.length()) {
    //         if (s1.charAt(i1) == s2.charAt(i2)) {
    //             commonPrefix += s1.charAt(i1);
    //             i1++;
    //             i2++;
    //         } else {
    //             break;
    //         }
    //     }
        
    //     return commonPrefix;
    // }
}