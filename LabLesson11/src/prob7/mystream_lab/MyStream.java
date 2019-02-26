package prob7.mystream_lab;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyStream<T> {

	private List<T> listElements;

	public static <T> MyStream<T> of(List<T> aList) {
		MyStream<T> mS = new MyStream<T>(aList);
		return mS;
	}

	private MyStream(List<T> aList) {
		listElements = aList;
	}

	public static <S> MyStream<S> concat(MyStream<S> s1, MyStream<S> s2) {
		List<S> list1 = s1.asList();
		list1.addAll(s2.asList());
		return MyStream.of(list1);
	}

	public <R> MyStream<R> flatMap(Function<T, MyStream<R>> mapper) {
		MyStream<R> myStream = MyStream.of(new ArrayList<R>());
		for (T el : listElements) {
			MyStream.concat(myStream, mapper.apply(el));
		}
		return myStream;
	}

	public List<T> asList() {
		return listElements;
	}

	public <R> MyStream<R> map(Function<T, R> mapper) {
		List<R> listMyStream = new ArrayList<>();
		for (T elt : listElements) {
			listMyStream.add(mapper.apply(elt));
		}
		return MyStream.of(listMyStream);
	}

	public MyStream<T> filter(Predicate<T> predicate) {
		List<T> listMyStream = new ArrayList<>();
		for (T elt : listElements) {
			if (predicate.test(elt)) {
				listMyStream.add(elt);
			}
		}
		return MyStream.of(listMyStream);
	}
}
