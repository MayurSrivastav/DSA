class Solution {

    public int minimumPairRemoval(int[] nums) {

        List<Integer> list = new ArrayList<>();

        for (int x : nums) {
            list.add(x);
        }

        int operations = 0;

        while (true) {

            boolean sorted = true;

            for (int i = 1; i < list.size(); i++) {

                if (list.get(i) < list.get(i - 1)) {
                    sorted = false;
                    break;
                }
            }

            if (sorted) {
                return operations;
            }

            int idx = 0;
            int minSum = list.get(0) + list.get(1);

            for (int i = 1; i < list.size() - 1; i++) {

                int sum = list.get(i) + list.get(i + 1);

                if (sum < minSum) {
                    minSum = sum;
                    idx = i;
                }
            }

            list.set(idx, minSum);
            list.remove(idx + 1);

            operations++;
        }
    }
}