package flatten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import flatten.Tree.Leaf;
import flatten.Tree.Node;

public class MyFlattenTree<T> implements FlattenTree<T> {
	
	public List<T> flattenInOrder(final Tree<T> tree) {
        final Either<T, Triple<Tree<T>>> eitherLeftOrRight = tree.get();
        if (eitherLeftOrRight.isLeft()) {
            return Collections.singletonList(eitherLeftOrRight.ifLeft(this.leftFunction));
        }

        return eitherLeftOrRight.ifRight(this.rightFunction);
    }
	
	private final Function<Triple<Tree<T>>, List<T>> rightFunction = new Function<Triple<Tree<T>>, List<T>>() {

        @Override
        public List<T> apply(final Triple<Tree<T>> node) {
            final List<T> result = new ArrayList<T>();
            result.addAll(MyFlattenTree.this.flattenInOrder(node.left()));
            result.addAll(MyFlattenTree.this.flattenInOrder(node.middle()));
            result.addAll(MyFlattenTree.this.flattenInOrder(node.right()));
            return result;
        }
    };

    private final Function<T, T> leftFunction = new Function<T, T>() {

		@Override
		public T apply(T p) {
			// TODO Auto-generated method stub
			return p;
		}
    };

    public static void main(final String[] args) {
        final Tree<String> tree = new Node<String>(new Node<String>(new Leaf<String>("11"), new Leaf<String>("12"), new Leaf<String>("1")), new Node<String>(new Leaf<String>("5"), new Leaf<String>("4"), new Leaf<String>("9")), new Leaf<String>("6"));
        System.out.println(new MyFlattenTree<String>().flattenInOrder(tree));
    }
}
