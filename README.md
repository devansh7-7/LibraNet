📚 LibraNet - Digital Library Management System

LibraNet is a future-ready, object-oriented library management system designed to manage Books, Audiobooks, and E-Magazines. It demonstrates reusable design, extensibility, and strong data handling and error management principles in Java.

🚀 Features

📖 Borrow, return, and track availability of items

💰 Automatically calculate fines for late returns (₹10/day)

🧩 Support for specialised behaviours:

Books → getPageCount()

Audiobooks → Playable interface

E-Magazines → archiveIssue() method

📦 Modular OOP design: clean, extensible, and testable

🔐 Proper error handling and validation for borrowing rules

🧠 Easy to extend for future item types like DVDs, Research Papers, etc.

📂 Project Structure
LibraNet/
│
├── LibraryItem.java         # Abstract base class for all items
├── Book.java                # Book subclass with pageCount
├── Audiobook.java           # Audiobook subclass, implements Playable
├── EMagazine.java           # EMagazine subclass with issue number
├── Playable.java            # Interface for playable media
└── LibraNetTest.java        # Main test class with sample execution

🛠️ How to Run
Prerequisites

Java 8 or higher

A Java IDE (like IntelliJ IDEA or Eclipse) or command line setup

Compile and Run
javac *.java
java LibraNetTest

🧪 Sample Output
📖 Book: Atomic Habits by James Clear | Pages: 320 | Available: true
🎧 Audiobook: Deep Work by Cal Newport | Duration: 180 mins | Available: true
📰 E-Magazine: NatGeo | Issue: #2025 | Available: true

Atomic Habits borrowed for 7 days.
Deep Work borrowed for 5 days.
NatGeo borrowed for 10 days.

Pages in book: 320
🔊 Playing audiobook: Deep Work [180 mins]
🗂️ Archiving issue #2025 of NatGeo

Item returned on time. No fine.
Fine for book: ₹0

⚙️ Design Principles Followed

✅ Abstraction & Inheritance
✅ Polymorphism for displayInfo()
✅ Interface-based Design via Playable
✅ Error Handling using exceptions
✅ Single Responsibility Principle
✅ Open/Closed Principle — easy to extend without modifying base code

💡 Future Enhancements

User profiles and login

Search and filter by title, author, or type

GUI or Web interface (JavaFX / Spring Boot)

Borrowing history and statistics

Integration with databases

👨‍💻 Author

Devansh Singh
KIIT University (CSE 2022–present)

📜 License

This project is for academic and educational use. No license attached.
