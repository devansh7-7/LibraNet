# 📚 LibraNet - Digital Library Management System

> **A modern, object-oriented library management system built with Java, demonstrating clean architecture, design patterns, and extensible software engineering principles.**

LibraNet is a comprehensive digital library management solution that seamlessly handles **Books**, **Audiobooks**, and **E-Magazines**. Built with robust OOP principles, it showcases advanced Java programming concepts including abstract classes, interfaces, inheritance, and polymorphism while maintaining clean, maintainable, and extensible code architecture.

---

## ✨ Features

### Core Library Operations
- **📖 Item Management** - Borrow, return, and track availability of library items
- **💰 Smart Fine System** - Automatic calculation of late return fines (₹10/day)
- **🔒 Data Validation** - Robust error handling and input validation
- **📊 Real-time Status** - Live tracking of item availability and borrowing status

### Specialized Item Behaviors
- **📚 Books** - Page count tracking with `getPageCount()` method
- **🎧 Audiobooks** - Playable interface implementation with duration management
- **📰 E-Magazines** - Issue archiving functionality with `archiveIssue()` method

### Technical Excellence
- **🏗️ Modular Architecture** - Clean, extensible, and thoroughly testable design
- **🎯 Type Safety** - Strong typing with comprehensive exception handling
- **🔄 Extensibility** - Easy integration of new item types (DVDs, Research Papers, etc.)
- **⚡ Performance** - Efficient memory management and optimized data structures

---

## 📁 Project Structure

```
LibraNet/
│
├── 📄 README.md                 # Project documentation and setup guide
├── 🏗️ LibraryItem.java         # Abstract base class defining core library item behavior
├── 📖 Book.java                 # Book implementation with page count functionality
├── 🎧 Audiobook.java            # Audiobook with Playable interface implementation
├── 📰 EMagazine.java            # E-Magazine with issue management capabilities
├── 🎮 Playable.java             # Interface for playable media content
├── ⚡ LibraNetTest.java         # Main demonstration class with comprehensive examples
├── 🔧 LibraNet.iml              # IntelliJ IDEA project configuration
└── 📝 .gitignore                # Git ignore rules for clean repository management
```

---

## 🚀 Getting Started

### Prerequisites

| Requirement | Minimum Version | Recommended | Purpose |
|-------------|----------------|-------------|----------|
| **Java JDK** | 8+ | 17+ | Core runtime environment |
| **IDE** | Any | IntelliJ IDEA / Eclipse / VS Code | Development environment |
| **Git** | 2.0+ | Latest | Version control |

### Installation & Setup

#### Option 1: Command Line Interface (CLI)

```bash
# Clone the repository
git clone https://github.com/devansh7-7/LibraNet.git
cd LibraNet

# Compile all Java files
javac *.java

# Run the demonstration
java LibraNetTest
```

#### Option 2: IDE Setup (IntelliJ IDEA)

1. **Open Project**: `File` → `Open` → Select `LibraNet` folder
2. **Project SDK**: Set to Java 8+ (`File` → `Project Structure` → `Project`)
3. **Run Configuration**: Right-click `LibraNetTest.java` → `Run 'LibraNetTest.main()'`

#### Option 3: IDE Setup (Eclipse)

1. **Import Project**: `File` → `Import` → `Existing Projects into Workspace`
2. **Select Directory**: Browse to `LibraNet` folder
3. **Build Project**: `Project` → `Build Project`
4. **Run**: Right-click `LibraNetTest.java` → `Run As` → `Java Application`

### Quick Verification

```bash
# Verify Java installation
java -version

# Expected output format:
# openjdk version "17.0.x" or higher
# OpenJDK Runtime Environment...
```

---

## 💡 Usage Examples

### Basic Operations

```java
// Create library items
Book book = new Book(101, "Atomic Habits", "James Clear", 320);
Audiobook audiobook = new Audiobook(102, "Deep Work", "Cal Newport", 180);
EMagazine magazine = new EMagazine(103, "National Geographic", "Various", 2025);

// Display item information
book.displayInfo();
audiobook.displayInfo();
magazine.displayInfo();

// Borrow items
book.borrow("7");           // Borrow for 7 days
audiobook.borrow("5");      // Borrow for 5 days
magazine.borrow("10");      // Borrow for 10 days

// Access specialized behaviors
System.out.println("Pages: " + book.getPageCount());
audiobook.play();           // Play audiobook
magazine.archiveIssue();    // Archive magazine issue

// Return items and check fines
book.returnItem();
System.out.println("Fine: ₹" + book.getFine());
```

---

## 🧪 Sample Output

```
📖 Book: Atomic Habits by James Clear | Pages: 320 | Available: true
🎧 Audiobook: Deep Work by Cal Newport | Duration: 180 mins | Available: true
📰 E-Magazine: National Geographic | Issue: #2025 | Available: true

Atomic Habits borrowed for 7 days.
Deep Work borrowed for 5 days.
National Geographic borrowed for 10 days.

Pages in book: 320
🔊 Playing audiobook: Deep Work [180 mins]
🗂️ Archiving issue #2025 of National Geographic

Item returned on time. No fine.
Fine for book: ₹0

Atomic Habits borrowed for 3 days.
```

---

## 🏛️ Architecture & Design Patterns

### Object-Oriented Principles

| Principle | Implementation | Benefit |
|-----------|----------------|---------|
| **🎯 Abstraction** | `LibraryItem` abstract class | Hides complex implementation details |
| **🔗 Inheritance** | `Book`, `Audiobook`, `EMagazine` extend `LibraryItem` | Code reuse and hierarchical organization |
| **🔄 Polymorphism** | Method overriding in `displayInfo()` | Dynamic method dispatch and flexibility |
| **📦 Encapsulation** | Private fields with controlled access | Data protection and controlled modification |

### Design Patterns Used

#### 1. **Template Method Pattern**
- **Class**: `LibraryItem` 
- **Implementation**: Common borrowing/returning logic with customizable display behavior
- **Benefit**: Consistent workflow with flexible customization points

#### 2. **Strategy Pattern**
- **Interface**: `Playable`
- **Implementation**: Different media playback strategies
- **Benefit**: Interchangeable algorithms for media handling

#### 3. **Factory Method Potential**
- **Current**: Direct instantiation in `LibraNetTest`
- **Future**: Easy addition of item factory for dynamic creation

### SOLID Principles Compliance

- ✅ **Single Responsibility**: Each class has one clear purpose
- ✅ **Open/Closed**: Easy to extend with new item types without modifying existing code
- ✅ **Liskov Substitution**: Subclasses can replace parent class seamlessly
- ✅ **Interface Segregation**: `Playable` interface is focused and minimal
- ✅ **Dependency Inversion**: Abstract base class reduces coupling between concrete classes

---

## 🔮 Future Enhancements

### Phase 1: Core Features
- [ ] **User Authentication** - Secure login system with role-based access
- [ ] **Advanced Search** - Filter by title, author, category, availability
- [ ] **Borrowing History** - Complete audit trail of user activities
- [ ] **Reservation System** - Queue management for popular items

### Phase 2: Data Persistence
- [ ] **Database Integration** - MySQL/PostgreSQL support with JPA/Hibernate
- [ ] **Data Export/Import** - CSV, JSON, XML format support
- [ ] **Backup & Recovery** - Automated data backup mechanisms
- [ ] **Cloud Storage** - AWS S3 or Google Cloud integration

### Phase 3: User Experience
- [ ] **Web Interface** - Spring Boot + React/Angular frontend
- [ ] **Mobile App** - Android/iOS applications
- [ ] **REST API** - RESTful services for third-party integrations
- [ ] **Real-time Notifications** - Email/SMS alerts for due dates

### Phase 4: Advanced Features
- [ ] **Analytics Dashboard** - Usage statistics and reporting
- [ ] **Recommendation Engine** - AI-powered content suggestions
- [ ] **Multi-language Support** - Internationalization (i18n)
- [ ] **Digital Content** - PDF reader integration for e-books

---

## 👨‍💻 Author

### **Devansh Singh**
*Computer Science Engineering Student*

- 🎓 **Institution**: KIIT University (2022–Present)
- 🌐 **GitHub**: [@devansh7-7](https://github.com/devansh7-7)
- 📧 **Email**: [Contact via GitHub](https://github.com/devansh7-7)
- 💼 **LinkedIn**: *Available on request*
- 🔗 **Portfolio**: *Coming Soon*

*Passionate about software engineering, object-oriented design, and building scalable applications. Currently exploring advanced Java concepts, Spring Framework, and modern software architecture patterns.*

---

## 📜 License

### Academic & Educational Use

```
MIT License Compatible - Academic Use

Copyright (c) 2024 Devansh Singh

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction for educational and academic purposes,
including without limitation the rights to use, copy, modify, merge, publish,
and distribute copies of the Software for non-commercial purposes.

For commercial use, please contact the author for licensing terms.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
```

**Usage Guidelines:**
- ✅ Educational projects and learning
- ✅ Academic assignments and research
- ✅ Portfolio demonstrations
- ❌ Commercial applications without permission
- ❌ Redistribution without attribution

---

## 🤝 Contributing

We welcome contributions from the community! Here's how you can help:

1. **🍴 Fork** the repository
2. **🌿 Create** a feature branch (`git checkout -b feature/AmazingFeature`)
3. **💾 Commit** your changes (`git commit -m 'Add some AmazingFeature'`)
4. **📤 Push** to the branch (`git push origin feature/AmazingFeature`)
5. **🔄 Open** a Pull Request

### Development Guidelines
- Follow existing code style and conventions
- Add comprehensive comments for complex logic
- Include unit tests for new features
- Update documentation as needed

---

## 📞 Support & Contact

- **🐛 Bug Reports**: [GitHub Issues](https://github.com/devansh7-7/LibraNet/issues)
- **💡 Feature Requests**: [GitHub Discussions](https://github.com/devansh7-7/LibraNet/discussions)
- **📚 Documentation**: This README and inline code comments
- **💬 Community**: Star the repository and follow for updates!

---

<div align="center">

**⭐ Star this repository if you found it helpful!**

*Built with ❤️ by [Devansh Singh](https://github.com/devansh7-7)*

[![GitHub stars](https://img.shields.io/github/stars/devansh7-7/LibraNet?style=social)](https://github.com/devansh7-7/LibraNet/stargazers)
[![GitHub forks](https://img.shields.io/github/forks/devansh7-7/LibraNet?style=social)](https://github.com/devansh7-7/LibraNet/network/members)
[![GitHub issues](https://img.shields.io/github/issues/devansh7-7/LibraNet)](https://github.com/devansh7-7/LibraNet/issues)

</div>
