class Imutable {
	private Integer a;
	private Integer b;

	public Imutable (Integer a, Integer b) {
		this.a = a;
		this.b = b;
	}
	public Integer getA() {
		return this.a;
	}

	public static void main(String[] args) {
		Imutable im = new Imutable(1, 2);
		System.out.println(im.a);
		Integer change = im.getA();
		change = 10;
		System.out.println(change);
		System.out.println(im.a);
	}
}
