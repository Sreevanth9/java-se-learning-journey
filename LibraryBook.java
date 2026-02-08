/** @author Sreevanth
 *  @version 1.0
 *  @since 2026
 **/
package librarydemo;


/**
 * 
 * @author Sreevanth
 * 
 * Class for Library Book
 */


public class LibraryBook
{ 
    
    /**
     * @value 10 default value
     */
    static int defaultValue=10;
    
    
    /**
     * Parametrized Constructor
     * @param title Book Name
     */
    
    public LibraryBook(String title){
    }
  
    /**
     * Issue a Book to a Student
     * @param studentRoll roll number of a Student
     * @throws Exception if book is not available, throws Exception
     */
    public void issue(int studentRoll) throws Exception{
    }
    
    /**
     * Check if book is available
     * @param bookName Book Name
     * @return if book is available returns true else false
     */
    public boolean available(String bookName){
        return true;
    }
    
    /**
     * Get Book name
     * @param bookId book id
     * @return returns book name
     */
    public String getName(int bookId){       
        return "";
    }
}
