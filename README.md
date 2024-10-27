# Spring Security App

## Topic

Authentication and Authorization in Web Development

## Objective

To gain practical experience with the concepts of authentication and authorization in web development, using OAuth2 for social login, and implementing access control using Spring Security.

## Short Theoretical Background

This project focuses on implementing user management with Spring Security, including registration and authorization. It covers secure page access, where only authenticated users can access specific areas, and integrates social login using OAuth2 for platforms such as Facebook and Google. Additionally, unit tests are implemented to validate the accuracy of the registration and authorization features.

## Steps of the Task

### 1. Building a User Management Application

#### User Registration and Authorization
- Implement basic functionality for **user registration** and **login** using Spring Security.
- Use **password hashing** and **user role management** for secure and role-based access.

#### Restricted Page Access
- Create several pages that are accessible only to authorized users.
- Ensure that certain pages remain publicly accessible.

#### Social Login with OAuth2
- Enable **OAuth2** login through social networks like **Facebook** and **Google**.
- Configure Spring Security to handle the OAuth2 login process and secure access.

#### Unit Testing
- Write **unit tests** to verify the functionality of user registration and authorization.
- Include tests for password hashing, role-based access, and successful and failed logins.

## Technologies Used

- **Java**: Programming language
- **Spring Boot**: Framework for building the application
- **Spring Security**: For managing authentication and authorization
- **OAuth2**: For implementing social login
- **JUnit**: For writing unit tests
- **Maven**: For project management and dependency handling

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/practical-work-6.git
   cd practical-work-6
   ```

2. Build the project using Maven:
   ```bash
   mvn clean install
   ```

3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

4. Access the application at `http://localhost:8080`.

## Usage

- **User Registration**: Navigate to `/register` to create a new user account.
- **User Login**: Use `/login` to access your account.
- **Authorized Pages**: Certain pages are restricted and require a login.
- **Social Login**: Use options to sign in via Facebook or Google.
- **Testing**: Run tests using Maven:
  ```bash
  mvn test
  ```

## Contributing

Contributions are welcome! Fork the repository and create a pull request for any enhancements or bug fixes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
