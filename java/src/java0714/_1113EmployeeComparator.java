package java0714;

import java.util.Comparator;

public class _1113EmployeeComparator  implements Comparator<_1113Employee>{

	@Override
	public int compare(_1113Employee o1, _1113Employee o2) {
		return o1.name.compareTo(o2.name);
	}

}
