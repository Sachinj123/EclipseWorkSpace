package com.cdac;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cdac.entity.Library;
import com.cdac.entity.Library.BookType;
import com.cdac.entity.Student;
import com.cdac.repository.LibraryRepository;
import com.cdac.repository.StudentRepository;

@SpringBootTest
class SpringBootPracticeProjectApplicationTests {

	@Autowired
	private LibraryRepository libraryRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	void addLibrary() {
		
		Library library = new Library();
		library.setLibraryName("JSPM Library");
		library.setAddress("Tathwade, Pune");
		library.setBooktype(BookType.DSA);
		library.setIssueDate(LocalDate.of(2023, 5, 20));
		
		libraryRepository.save(library);
		
	}
	
	@Test
	void addStudent()
	{
		Library library = libraryRepository.findById(1).get();
				
		Student student = new Student();
		student.setName("Nitin Jadhav");
		student.setCollageName("Collage of Engg. Pune");
		student.setGender("Female");
		student.setDateOfBirth(LocalDate.of(1996, 6, 16));
		student.setReturnDate(LocalDate.of(2023, 8, 15));
		student.setLibrary(library);
		
		
		studentRepository.save(student);
	}
	
	@Test
	void fetchSong()
	{
		List<Library> list = libraryRepository.findByLibraryName("JSPM Library");
		for(Library library:list)
		{
			System.out.println(library.getLibraryId()+" "+library.getAddress()+" "+library.getIssueDate());
		}
	}

}
