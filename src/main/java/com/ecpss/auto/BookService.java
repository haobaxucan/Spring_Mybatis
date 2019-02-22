package com.ecpss.auto;


import org.springframework.stereotype.Service;


@Service
public class BookService {

//	@Qualifier("bookDao")
//	@Autowired(required=false)
	//@Resource(name="bookDao2")

	private BookDao bookDao2;

	public void print(){
		System.out.println(bookDao2);
	}

	@Override
	public String toString() {
		return "BookService [bookDao=" + bookDao2 + "]";
	}





}
