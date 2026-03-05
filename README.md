This project was initially used for an Advanced Java Programming course.

# Multi-threaded Spring Hotel Application 

## Overview
This project is a multithreaded hotel scheduling application built with a Java Spring Boot backend and an Angular frontend. 

Originally a standard scheduling application, it was refactored to support global operations. The application features concurrent multithreading for internationalization, cross-time-zone synchronization, and multi-currency pricing displays. 

The project was ultimately containerized using Docker and configured for cloud deployment on Microsoft Azure for my IT College.

## Technologies & Environment
* **Frontend:** Angular, TypeScript, HTML, CSS
* **Backend:** Java, Spring Boot, Spring Web
* **Concurrency:** Java Multithreading (`java.lang.Thread`)
* **DevOps & Cloud:** Docker, Microsoft Azure

## Key Features & Technical Highlights

* **Concurrent Localization:** Implements Java multithreading to concurrently process and serve localized resource bundles. The application generates and displays UI elements in multiple languages (English and French) simultaneously without blocking the main execution thread.
* **Global Time Zone Synchronization:** Features a backend conversion utility that translates presentation schedules across varying global time zones (Eastern Time, Mountain Time, and Coordinated Universal Time) for international users.
* **Multi-Currency UI Display:** Adapts the Angular frontend to process and display reservation pricing across different fiat currencies (USD, CAD, EUR). **just for currency display, not total conversion**
* **Docker Containerization:** Utilizes a custom `Dockerfile` to package the entire Spring Boot application, Angular client, and underlying environment dependencies into a single, portable, and reproducible Docker image.
* **Cloud Deployment:** Designed and configured for scalable deployment to Microsoft Azure cloud services using the generated Docker container.

## Repository Structure
* `/frontend`: Contains the Angular SPA client.
* `/backend`: Contains the Spring Boot REST API and Java concurrency logic.
* `Dockerfile`: The declarative configuration file used to assemble the application image.

## How to Run Locally

1. Clone the repository:
   ```bash
   git clone https://github.com/rycorson/multithreaded-spring-hotel-application.git
2. Start the Spring Boot Backend:
   Open your first terminal window:
   ```bash
    # Navigate to the backend directory
    cd backend
    
    # Run the Spring Boot application (Mac/Linux)
    ./mvnw spring-boot:run
    
    # OR run the Spring Boot application (Windows)
    mvnw.cmd spring-boot:run
   ```
   The REST API will launch on htt[://localhost:8080
3. Start the Angular Front-end:
   ```bash
   # Navigate to the frontend directory
    cd frontend
    
    # Install Node dependencies
    npm install
    
    # Start the Angular development server
    ng serve
   ```
   The front-end application will launch on http://localhost:4200

   ## Author
   Ryan Corson
   * Github: @rycorson
   * LinkedIn: https://www.linkedin.com/in/ryan-corson/
