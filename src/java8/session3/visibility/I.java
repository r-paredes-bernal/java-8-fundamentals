package java8.session3.visibility;
//Yes, it is written correctly. Output will be 1221 1221
class I {
	protected int i = 1221;
	void methodOfX() {
		System.out.println(i);
	}
}
