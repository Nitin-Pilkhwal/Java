package TRIE;
// Implementation of TRIE data structure
class Node{
    Node links[] = new Node[26];
    boolean flag = false;

    boolean isContainKey(char ch){
        return (links[ch-'a'] != null);
    }

    void put(char ch,Node node){
        this.links[ch-'a'] = node;
    }

    Node get(char ch){
        return this.links[ch-'a'];
    }

    void setEnd(){
        this.flag = true;
    }
    boolean isEnd(){
        return flag;
    }
};

class Trie {
    private static Node root;
    /// Initializing data structure
    public Trie() {
        root = new Node();
    }
    /// Inserts a word into the trie.
    public void insert(String word) {
        Node temp = root;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(!temp.isContainKey(ch)){
                temp.put(ch,new Node());
            }
            temp = temp.get(ch);
        }
        temp.setEnd();
    }
    /// Returns if the word is in the trie.
    public boolean search(String word) {
        Node temp = root;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(!temp.isContainKey(ch)){
                return false;
            }
            temp = temp.get(ch);
        }
        return temp.isEnd();
    }
    /// Returns if there is any word in the trie that starts with the given prefix.
    public boolean startsWith(String word) {
        Node temp = root;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(!temp.isContainKey(ch)){
                return false;
            }
            temp = temp.get(ch);
        }
        return true;
    }
}