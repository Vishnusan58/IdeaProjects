class Main {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int len = Math.max(v1.length, v2.length);

        // Compare versions by iterating through each revision.
        for (int i = 0; i < len; i++) {
            int n1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            int n2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;

            if (n1 > n2) {
                return 1;
            } else if (n1 < n2) {
                return -1;
            }
        }

        // Versions are equal
        return 0;
    }
}

