package kt.leetcode.editor.en.definition

class Node(var `val`: Int) {
    val children: List<Node> = listOf()
    var neighbors = mutableListOf<Node>()
}