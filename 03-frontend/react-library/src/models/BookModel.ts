class BookModel {
    book_name: string;
    ISBN: string;
    author_name: string;
    qty: number;

    constructor(book_name: string, ISBN: string, author_name: string, qty: number) {
        this.book_name = book_name;
        this.ISBN = ISBN;
        this.author_name = author_name;
        this.qty = qty;
    }
}

export default BookModel;