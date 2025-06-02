class Solution(object):
    def groupAnagrams(self, strs):
        from collections import defaultdict
        
        anagram_map = defaultdict(list)
        
        for word in strs:
            key = ''.join(sorted(word))
            anagram_map[key].append(word)
        
        return list(anagram_map.values())