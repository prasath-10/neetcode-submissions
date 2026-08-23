class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<List<Integer>> sc = new HashSet<>();

        int x = 0, y = 0;

        sc.add(Arrays.asList(x, y));

        for (int i = 0; i < path.length(); i++) {

            if (path.charAt(i) == 'N') {
                y++;
            } 
            else if (path.charAt(i) == 'S') {
                y--;
            } 
            else if (path.charAt(i) == 'E') {
                x++;
            } 
            else if (path.charAt(i) == 'W') {
                x--;
            }

            List<Integer> position = Arrays.asList(x, y);

            if (sc.contains(position)) {
                return true;
            }

            sc.add(position);
        }

        return false;
    }
}