
class Media {
  constructor(title) {
    this._title = title;
    this._isCheckOut = true;
    this._ratings = []
    }
  get title() {
    return this._title;
  }
  get isCheckOut() {
    return this._isCheckOut;
  }
  get ratings() {
    return this._ratings
  }
 set isCheckOut(isCheckOut) {
   this._isCheckOut = isCheckOut;
 }
 toggleCheckOutStatus() {
   return this._isCheckOut = !this._isCheckOut;
 }
 getAvaregeRating(ratings) {
   let ratingsMedia = 0;
   let ratingsTotal = 0;
  for (let i = 0; i < ratings.length; i++) {
    ratingsTotal += ratings[i]
  }
  ratingsMedia = ratingsTotal / ratings.length;
  return ratingsMedia;
 }
 addRating(input) {
   return this.ratings.push(input);
 }
}

class Book extends Media {
  constructor(title, author, pages) {
    super(title)
    this._author = author;
    this._pages = pages;
  }
  get author() {
    return this._author;
  }
  get pages() {
    return this._pages;
  }
}

const harryPotter = new Book('harry Potter','Gabriel Henrique', 23)
console.log(harryPotter)





