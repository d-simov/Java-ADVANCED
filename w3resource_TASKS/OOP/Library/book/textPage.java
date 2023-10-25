package main.book;

public class textPage extends Page {

    protected textPage(int pageNumber) {
        super(pageNumber);
    }

    @Override
    protected void setContents() {
        this.text = "page No " + this.pageNumber + " full of text.";
    }
}
