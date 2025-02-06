public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        long temp;
        temp = Double.doubleToLongBits(year);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Book other)) {
            return false;
        }
        return this.title.equals(other.title) && this.author.equals(other.author) && this.year == other.year;
    }

    @Override
    public String toString() {
        return "title: " + title + ", author: " + author + ", year: " + year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

            public void setAuthor(String author) {
        this.author = author;
            }

            public int getYear() {
        return year;
            }

            public void setYear(int year) {
        this.year = year;
            }
}
