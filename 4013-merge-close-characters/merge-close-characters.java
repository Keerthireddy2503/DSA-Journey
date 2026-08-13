class Solution {
    public String mergeCharacters(String s, int k) {

        StringBuilder sb = new StringBuilder(s);

        boolean changed = true;

        while (changed) {
            changed = false;

            for (int i = 0; i < sb.length() && !changed; i++) {

                for (int j = i + 1; j < sb.length(); j++) {

                    if (sb.charAt(i) == sb.charAt(j) && j - i <= k) {

                        sb.deleteCharAt(j);

                        changed = true;

                        break;
                    }
                }
            }
        }

        return sb.toString();
    }
}