# Fikry

This is an app that uses the [Google ML Kit API](https://developers.google.com/ml-kit) to scan a book's ISBN
and then query for the book's ratings using the [Goodreads](www.goodreads.com) API.  

This app is heavily based on this [existing sample](https://github.com/firebase/mlkit-material-android) that 
showcases how to use ML Kit APIs with Material Design.

<img src="fikry_demo.gif" alt="Demo" title="Demo" width="300" />

#### Why I Built This
I spend a lot of time browsing physical book stores. Before I decide if I want to buy a book, I always end up searching for its reviews first. This was a tedious process that involved (1) opening up the Goodreads app (2) typing in the name of the book (3) tapping on the actual book from the list of search results and (4) looking for the reviews of the book. 

I basically wanted to replicate the experience of browsing books on Amazon and immediately be able to see a book's ratings. 

#### Tech stack
- Kotlin
- [ML Kit Barcode Scanning API](https://firebase.google.com/docs/ml-kit/read-barcodes)
- [Retrofit](https://github.com/square/retrofit)
