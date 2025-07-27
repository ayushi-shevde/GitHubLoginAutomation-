# GitHubLoginAutomation-

Selenium POM framework for GitHub login/logout

This is a Selenium-based login and logout automation framework for the **Guru99 Banking Site**.

---

## 🔧 Tech Stack

- Java
- Selenium WebDriver
- Cucumber BDD
- Extent Reports
- Git

---

## 🚀 How to Run

1. Clone the repo - git clone https://github.com/ayushi-shevde/GitHubLoginAutomation-.git
2. Import as a Maven project in your IDE (Eclipse/IntelliJ)
3. You will find a project named Selenium Banking Project.
4. I have created an automaton script for a Login and a Logout
5. Run the test from `Runner.java` or using a Cucumber feature file

---

## Note
1. Username and password on the Guru99 demo site change every 20 days.
2. This framework automatically fetches the latest credentials directly from the webpage before logging in.
3. No manual update of credentials is needed.
4. So you always use the current valid credentials during test execution.

___

## 📁 Folder Structure

- `features/` – login .feature files
- `stepdefinitions/` – Step definitions
- `pages/` – Page Object Model classes
- `utilities/` – Utility classes (ConfigReader, Extent Reports, etc.)
- `logs/` – log4j
- `testoutput/` – Extent Reports
  
---

## 👩‍💻 Author

Ayushi Shevde
📧 shevde.ayushi@gmail.com
