package main.book;

public abstract class Page {

    protected String text;
    protected int pageNumber;

    protected Page(int pageNumber) {
        this.pageNumber = pageNumber;
        setContents();
    }

    protected abstract void setContents();

    public int getPageNumber() {
        return pageNumber;
    }

    @Override
    public String toString() {
        return text;
    }
}
