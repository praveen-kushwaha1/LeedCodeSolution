class Solution {
    
    static void printHelper(int i, int n) {
    if (i > n) return;                  // 🛑 Stop when i > n
    printHelper(i + 1, n);              // 🔁 Go deep (ascending)
    System.out.print(i + " ");          // ✅ Backtrack print → gives n to 1
    }

    void printNos(int n) {
        printHelper(1, n);
        
    }
}