# Real-Time Chat Application

## Overview
This is a real-time chat application built using **Spring Boot, WebSockets, STOMP, SockJS, and Thymeleaf**. It enables users to communicate with each other in real-time by sending and receiving messages through a WebSocket connection.

## Features
- Real-time messaging using WebSockets
- Multiple users can chat simultaneously
- Uses STOMP protocol for handling messages
- SockJS support for browsers that do not support WebSockets
- UI built with Thymeleaf, HTML, CSS, and Bootstrap

## Technologies Used
- **Backend:** Spring Boot, WebSockets, STOMP
- **Frontend:** Thymeleaf, HTML, CSS, JavaScript, Bootstrap
- **Libraries:** SockJS, STOMP.js

## Setup Instructions
### Prerequisites
- Java 17+
- Maven
- IDE (IntelliJ IDEA, VS Code, Eclipse, etc.)

### Steps to Run the Application
1. **Clone the repository:**
   ```bash
   git clone https://github.com/yourusername/realtime-chat.git
   cd realtime-chat
   ```
2. **Build and run the application:**
   ```bash
   mvn spring-boot:run
   ```
3. **Open the application in a browser:**
   - Go to `http://localhost:8080/chat`
   - Open the same URL in different browser windows to test real-time communication

## Project Structure
```
├── src/main/java/com/chat/app
│   ├── config/WebSocketConfig.java  # Configures WebSocket and STOMP
│   ├── controller/ChatController.java  # Handles chat messages
│   ├── model/ChatMessage.java  # Message data model
│   ├── AppApplication.java  # Main Spring Boot application
│
├── src/main/resources/templates/chat.html  # Frontend UI (Thymeleaf)
├── src/main/resources/static  # Static resources (CSS, JS)
├── pom.xml  # Dependencies and project setup
```

## API Endpoints
| Endpoint | Method | Description |
|----------|--------|-------------|
| `/chat` | GET | Loads the chat UI |
| `/app/sendMessage` | WebSocket | Sends a message to the chat |
| `/topic/message` | WebSocket | Broadcasts messages to all connected clients |

## Output Screenshot
![image](https://github.com/user-attachments/assets/5a3e0c90-12b9-46dd-8387-ffe789b15e7c)

## Output Video


https://github.com/user-attachments/assets/0ae5492a-7e4d-4f95-ad0e-0fdb3a496b9c



## Future Enhancements
- User authentication & authorization
- Persistent message storage using a database
- Typing indicators and online user status
- Private messaging feature

## License
This project is open-source and available under the **MIT License**.

---
### Developed by Gaurav Thombare 🚀

