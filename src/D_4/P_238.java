package D_4;

import java.util.stream.Stream;

public class P_238 {
	public static void main(String[] args) {
		Stream<String>stream=Stream.of("��","��","��","��","��","��","��");
		stream.skip(0).limit(7).forEach(System.out::println);
	}
}
