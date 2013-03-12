package bookorder;

import java.util.List;

public class BookService implements IBookService {
	public List<IBookSupplier> suppliers;

	public BookService(List<IBookSupplier> suppliers) {
		this.suppliers = suppliers;
	}

}
