public class Duplicate {

    public String find(int[][] a) {

        String result = "";

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {

                boolean alreadyChecked = false;

                // Check if the number was already checked
                for (int x = 0; x < i; x++) {

                    for (int y = 0; y < a[x].length; y++) {

                        if (a[i][j] == a[x][y]) {
                            alreadyChecked = true;
                        }
                    }
                }

                if (!alreadyChecked) {

                    String locations = "";
                    int count = 0;

                    // Find all locations of the same number
                    for (int x = 0; x < a.length; x++) {

                        for (int y = 0; y < a[x].length; y++) {

                            if (a[i][j] == a[x][y]) {

                                count++;

                                if (!locations.isEmpty()) {
                                    locations += " and ";
                                }

                                locations += "Row " + (x + 1)
                                        + ", Column " + (y + 1);
                            }
                        }
                    }

                    // If the number appears more than once
                    if (count > 1) {

                        result += "Number " + a[i][j]
                                + " -> " + locations + "\n";
                    }
                }
            }
        }

        if (result.isEmpty()) {
            return "No duplicates found.";
        }

        return result;
    }
}