package java0714;

import java.util.Comparator;

public class _1112TigerComparator  implements Comparator<_1112Tiger>{

	@Override
	public int compare(_1112Tiger o1, _1112Tiger o2) {
		return o1.name.compareTo(o2.name);
	}

}
