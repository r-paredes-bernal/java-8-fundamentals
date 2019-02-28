package java8.session3.visibility.otherpackage;

import java8.session3.visibility.T;

class U extends T {
	int methodOne(int i) {
		return methodTwo(++i);
	}
}