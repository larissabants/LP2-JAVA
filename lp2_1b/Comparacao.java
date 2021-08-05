package lp2_1b;

import java.util.Comparator;

public class Comparacao implements Comparator<Produto> {

	@Override
	public int compare(Produto prod1, Produto prod2) {
		return prod1.getNome().compareTo(prod2.getNome());

	}

}
