package jiegouxing.day06facade;

public interface 税务局 {
	void taxCertificate();// 办理税务登记证
}

class 海淀税务局 implements 税务局 {
	@Override
	public void taxCertificate() {
		System.out.println("海淀税务局办理税务登记证...");
	}
}
