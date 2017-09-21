package problems.techdelight.trie;

import java.util.ArrayList;
import java.util.List;

public class Trie {

	TrieNode root;

	public Trie(String[] words){
		root = new TrieNode();
		for (String word : words) {
			root.addWord(word);
		}
	}

	public boolean contains(String word){
		TrieNode lastNode = root;

		for(int i = 0; i < word.length(); ++i){
			lastNode = lastNode.children.get(word.charAt(i));

			if(lastNode == null)
				return false;
		}

		return true;
	}

	public List<String> list(String prefix){
		if(root == null)
			return null;

		TrieNode lastNode = root;

		for(int i = 0; i < prefix.length(); ++i){
			lastNode = lastNode.children.get(prefix.charAt(i));

			if(lastNode == null)
				return null;
		}

		List<String> list = new ArrayList<String>();
		traverse(lastNode, prefix, list);

		return list;
	}

	public void traverse(TrieNode n, String str, List<String> list){
		if(n.isLeaf){
			list.add(str);
		}

		for(Character c : n.children.keySet()){
			TrieNode child = n.children.get(c);

			str = str.concat(child.character + "");

			traverse(child, str, list);
		}
	}

	public static void main(String[] args) {
		String[] words = {"hello", "helloworld", "helloworld2"};

		Trie trie = new Trie(words);
		List<String> list = trie.list("hellow");

		if(list != null)
			for (String str : list) {
				System.out.println(str);
			}
	}
}
