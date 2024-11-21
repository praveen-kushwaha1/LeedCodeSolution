class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        // Step 1: Normalize the paragraph by converting it to lowercase and removing punctuation
        String normalizedParagraph = paragraph.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", " ");
        
        // Step 2: Split the normalized paragraph into words
        String[] words = normalizedParagraph.split("\\s+");

        // Step 3: Create a set for banned words for O(1) lookup
        Set<String> bannedSet = new HashSet<>();
        for (String word : banned) {
            bannedSet.add(word.toLowerCase());  // Convert banned words to lowercase
        }

        // Step 4: Count the frequency of non-banned words
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty() && !bannedSet.contains(word)) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        // Step 5: Find the most frequent word
        String mostFrequentWord = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostFrequentWord;
    }
}