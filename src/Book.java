public class Book {
 public int id;
 public String title, authorName, authorYear, pubYear, status;

 public Book(int id, String pubYear, String title, String authorName, String authorYear, String status) {
  this.id = id;
  this.pubYear = pubYear;
  this.title = title;
  this.authorName = authorName;
  this.authorYear = authorYear;
  this.status = status;
 }

 public Book() {

 }

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public String getTitle() {
  return title;
 }

 public void setTitle(String title) {
  this.title = title;
 }

 public String getAuthorName() {
  return authorName;
 }

 public void setAuthorName(String authorName) {
  this.authorName = authorName;
 }

 public String getAuthorYear() {
  return authorYear;
 }

 public void setAuthorYear(String authorYear) {
  this.authorYear = authorYear;
 }

 public String getPubYear() {
  return pubYear;
 }

 public void setPubYear(String pubYear) {
  this.pubYear = pubYear;
 }

 public String getStatus() {
  return status;
 }

 public void setStatus(String status) {
  this.status = status;
 }

}
