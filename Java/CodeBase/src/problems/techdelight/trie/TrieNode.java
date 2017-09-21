package problems.techdelight.trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
	boolean isLeaf;

	Map<Character, TrieNode> children;
	char character;

	public TrieNode(){
		children = new HashMap<Character, TrieNode>();
	}

	public TrieNode(char c){
		this();
		this.character = c;
	}

	void addWord(String word){
		if(word == null || word.isEmpty())
			return;

		char firstChar = word.charAt(0);

		TrieNode child = children.get(firstChar);

		if(child == null){
			child = new TrieNode(firstChar);
			children.put(firstChar, child);
		}

		if(word.length() > 1){
			child.addWord(word.substring(1));
		} else{
			child.isLeaf = true;
		}
	}
}
