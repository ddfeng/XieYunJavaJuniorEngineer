package 类适配器模式;

/**
 * 适配器模式(类适配器模式)
 * 现实实例：如果我们需要一个三个口的插座，但是现在只有一个两孔插座
 * 解决办法：加一个插线板，接出来之后就会有三个口的插座了
 * 这就是适配器，这里我们需要一个Usb插口，但是我们只有Ps2
 * 我们通过一个适配器用Ps2调用Usb的
 * @author Administrator
 * 
 * 类适配器和对象适配器运用场景一致，就是实现的手段稍有不同
 *
 */
public class ClassAdapter extends Usber implements Ps2 {
	public void isPs2() {
		isUsb();
	}
}