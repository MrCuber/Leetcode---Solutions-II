class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Deque<Integer> dq = new ArrayDeque<Integer>();
        dq.addFirst(deck[deck.length-1]);
        for(int i=deck.length-2; i>=0; i--) {
            dq.addFirst(dq.removeLast());
            dq.addFirst(deck[i]);
        }
        for(int i=0; i<deck.length; i++) {
            deck[i] = (int) dq.remove();
        }
        return deck;
    }
}Hii
