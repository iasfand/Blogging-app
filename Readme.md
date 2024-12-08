Blogging App

This is a full-stack blogging application with a front end built in Angular, a backend powered by Java Spring Boot, and MongoDB as the database.

Features

User Authentication (Signup, Login, Logout)

Create, Edit, and Delete Blog Posts

View Blog Posts by Users

Comment on Blog Posts

Like/Dislike Blog Posts

Responsive UI

Tech Stack

Frontend

Framework: Angular

Styling: CSS/SCSS, Bootstrap

Backend

Framework: Java Spring Boot

Database: MongoDB

Other Tools: Spring Security, REST API

Prerequisites

To run this application, ensure you have the following installed:

Node.js and npm

Angular CLI

Java Development Kit (JDK) 11 or above

Maven

MongoDB

Installation

Frontend Setup

Clone the repository:

git clone https://github.com/yourusername/blogging-app-frontend.git

Navigate to the project directory:

cd blogging-app-frontend

Install dependencies:

npm install

Run the Angular development server:

ng serve

The frontend will be accessible at http://localhost:4200.

Backend Setup

Clone the repository:

git clone https://github.com/yourusername/blogging-app-backend.git

Navigate to the project directory:

cd blogging-app-backend

Configure the MongoDB connection in application.properties:

spring.data.mongodb.uri=mongodb://localhost:27017/blogging-app

Build the project using Maven:

mvn clean install

Run the Spring Boot application:

java -jar target/blogging-app-backend-0.0.1-SNAPSHOT.jar

The backend will be accessible at http://localhost:8080.

API Endpoints

Authentication

POST /api/auth/register - Register a new user

POST /api/auth/login - Login and get a JWT token

Blog Posts

GET /api/posts - Get all blog posts

POST /api/posts - Create a new blog post (requires authentication)

PUT /api/posts/{id} - Update a blog post (requires authentication)

DELETE /api/posts/{id} - Delete a blog post (requires authentication)

Comments

POST /api/posts/{id}/comments - Add a comment to a blog post

GET /api/posts/{id}/comments - Get all comments for a blog post

Likes

POST /api/posts/{id}/like - Like or dislike a blog post

Contributing

Contributions are welcome! To contribute:

Fork the repository.

Create a new branch:

git checkout -b feature-name

Make your changes and commit them:

git commit -m "Add some feature"

Push to the branch:

git push origin feature-name

Create a pull request.

License

This project is licensed under the MIT License. See the LICENSE file for details.

Acknowledgements

Angular Documentation

Spring Boot Documentation

MongoDB Documentation

Contact

For any inquiries or support, please reach out to your.email@example.com.