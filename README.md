# 📚 LibraNet - Digital Library Management System

**LibraNet** is a future-ready, object-oriented library management system built in Java to manage **Books**, **Audiobooks**, and **E-Magazines**. Designed with clean code principles and extensibility in mind, this project demonstrates real-world application of OOP, robust error handling, and reusable components.

---

## 🚀 Features

- ✅ **Borrowing and Returning** library items with due date tracking
- 📌 **Availability** checks for every item
- 💰 **Fine calculation** for late returns (₹10 per overdue day)
- 🧩 **Specialized behaviors**:
  - Books → `getPageCount()`
  - Audiobooks → implements `Playable` interface
  - E-Magazines → `archiveIssue()` method
- ⚙️ **Extensible design** to easily add new item types
- 🔐 Proper **error handling** (e.g., borrowing already borrowed item, invalid durations)

---

## 📂 Project Structure

```
LibraNet/
├── .gitignore             # Git ignore rules
├── LibraNet.iml           # IntelliJ project file
├── Book.java              # Book subclass with page count
├── Audiobook.java         # Audiobook subclass, implements Playable
├── EMagazine.java         # E-Magazine subclass with issue number
├── LibraryItem.java       # Abstract base class for all library items
├── Playable.java          # Interface for playable media types
└── LibraNetTest.java      # Main test class with sample usage
```
---

## 🧪 How to Run

### ✅ Requirements

- Java 8 or higher
- Any Java IDE (IntelliJ, Eclipse) or terminal

### ▶️ Run via Terminal

javac *.java
java LibraNetTest


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

🧠 Design Principles Used

Abstraction & Inheritance → LibraryItem abstract class

Polymorphism → Common methods like displayInfo()

Interface-Based Design → Playable for media

Encapsulation → Private fields with protected/public accessors

Open/Closed Principle → System is open for extension, closed for modification

Exception Handling → Runtime checks and validation logic

🛠️ Potential Extensions

👤 User accounts and borrowing history

🔍 Search functionality by author, title, or type

🖥️ GUI using JavaFX or Swing

🌐 Web version using Spring Boot + MySQL

📊 Reports for most borrowed items, fines collected, etc.

👨‍💻 Author

Devansh Singh
🎓 B.Tech CSE | KIIT University
📫 Email: 2205030@kiit.ac.in

📜 License

This project is for academic and educational use only.
