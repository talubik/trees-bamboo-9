package nodes

class AVLNode<K : Comparable<K>, V>(key: K, value: V) : Node<K, V, AVLNode<K, V>>(key, value) {
    internal var height: Int = 1
}