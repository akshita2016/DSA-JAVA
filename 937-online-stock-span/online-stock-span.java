class StockSpanner {
    Stack<Integer> st;
    List<Integer> prices;
    int i;

    public StockSpanner() {
        st = new Stack<>();
        prices = new ArrayList<>();
        i = -1;
    }

    public int next(int price) {
        i++;
        prices.add(price);

        while (!st.isEmpty() && prices.get(st.peek()) <= price) {
            st.pop();
        }

        int ans = i - (st.isEmpty() ? -1 : st.peek());
        st.push(i);

        return ans;
    }
}