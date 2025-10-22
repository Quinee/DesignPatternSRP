# Design Pattern SRP – Single Responsibility Principle

## 1. Project Overview

This project demonstrates the **Single Responsibility Principle (SRP)** from SOLID design principles in Java. The implementation showcases how to structure a Selenium-based test framework where each class is responsible for only one functionality.

* **Primary Language:** Java
* **Build Tool:** Maven
* **Purpose:** To provide a clean, maintainable automation framework using SRP.


---

## 2. Quick Start

### Steps to Run Locally

1. **Prerequisites:**

    * Java 8 or later
    * Maven 3.6+
    * IDE (IntelliJ IDEA / Eclipse)

2. **Clone the Project:**

   ```bash
   git clone <repo-url>
   cd DesignPatternSRP/DesignPatternSRP
   ```

3. **Build the Project:**

   ```bash
   mvn clean install
   ```

4. **Run Tests:**

   ```bash
   mvn test
   ```

---

## 3. Project Structure

```
DesignPatternSRP/
├── pom.xml                  # Maven configuration file
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── pageObjects/         # Page Object classes
│   │       ├── pageComponents/      # Page component implementations
│   │       └── abstractComponents/  # Base abstract classes
│   └── test/java/                   # Test classes
├── target/                         # Compiled output and reports
└── .github/workflows/test1.yml      # CI workflow (GitHub Actions)
```

---

## 4. Key Modules

### `abstractComponents`

Contains reusable abstract classes defining common methods and WebDriver interactions shared across page components.

### `pageComponents`

Contains classes such as `RoundTrip`, `MultiTrip`, and `FooterNav`, each handling specific functionalities independently — following SRP.

### `pageObjects`

Encapsulates entire pages like `TravelHomePage`, where page-level actions are composed of page component interactions.

---

## 5. Build & Test

### Build Command

```bash
mvn clean compile
```

### Run Tests

```bash
mvn test
```

Test classes are compiled under `target/test-classes` and executed using the standard Maven Surefire plugin.

---

## 6. GitHub Actions CI

TODO: The `.github/workflows/test1.yml` workflow automates testing when changes are pushed to the repository. It can be extended to include build, linting, and deployment stages.

---

## 7. Example Concepts Demonstrated

* **Single Responsibility Principle (SRP):** Each class has one reason to change.
* **Page Object Model (POM):** Clean test design by separating UI logic from test logic.
* **Component Reuse:** Abstract components used across multiple page objects.

---

## 8. How to Extend

1. Add new page components inside `pageComponents/`.
2. Update or create new page objects using these components.
3. Add new tests under `src/test/java/`.

---

## 9. Troubleshooting

| Issue             | Possible Cause                 | Fix                                                             |
| ----------------- | ------------------------------ | --------------------------------------------------------------- |
| Maven build fails | Missing dependencies           | Run `mvn clean install -U`                                      |
| Tests not found   | Incorrect test annotations     | Ensure `@Test` annotations are from `org.testng` or `org.junit` |
| WebDriver errors  | Browser drivers not configured | Add driver path in system properties or use WebDriverManager    |

---

## 10. Contributing

* Fork the repository.
* Create a new branch (`feature/new-component`).
* Commit your changes and raise a Pull Request.

---

## 11. License

This project is open-source under the MIT License.

---

## 12. Acknowledgements

* Inspired by **SOLID Design Principles**.
* Uses **Maven**, **Selenium**, and **TestNG/JUnit**.
* Demonstrates modular test design for maintainable automation frameworks.

