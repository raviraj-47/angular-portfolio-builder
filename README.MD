# Angular Portfolio Builder

## Project Overview

Angular Portfolio Builder is a web application that allows users to create, preview, and customize their personal developer portfolios. Users can add skills, projects, and external links, and personalize the look with themes and color schemes. The app features:

- User-friendly portfolio creation form
- Portfolio preview with live data
- Ability to select and update themes and colors dynamically
- Persistent data storage via backend API
- Routing and navigation between users list, portfolio preview, and theme selector

## Features

- Add and edit portfolio details including skills, projects, LinkedIn and GitHub URLs
- View list of existing users and their portfolios
- Click on user names to view detailed portfolio preview
- Choose from multiple themes and color schemes
- Update portfolio themes any time
- Responsive and intuitive UI

## Technologies Used

- Angular 17 (Standalone components)
- RxJS for reactive programming
- TypeScript for type safety
- REST API backend (assumed)
- CSS3 for styling

## Getting Started

### Prerequisites

- Node.js and npm installed
- Angular CLI installed globally (`npm install -g @angular/cli`)
- Backend API running locally at `http://localhost:8080/api/portfolio`

### Installation

1. Clone the repository:  git clone <repository-url>

2. Install dependencies:  cd frontend
                          npm install

3. Run the Angular app:  ng serve

4. Open browser at `http://localhost:4200`

### Backend Setup and Running Instructions

1. Navigate to backend directory:  cd backend

2. Build the backend (optional, but recommended): mvn clean install

3. Start the backend server:  mvn spring-boot:run

4. The backend server will run on `http://localhost:8080`

### Verify Backend API

You can verify backend is running and reachable by testing with:  curl http://localhost:8080/api/portfolio

This should return all portfolios as JSON.

## Usage

- Start on the home page to create a new portfolio
- Navigate to the users list to view existing portfolios
- Click a user’s name to preview their portfolio
- Use the “Choose Theme” button to change portfolio styles and save updates

## Project Structure

- `portfolio-form/` — Portfolio creation and editing form
- `users-list/` — Displays the list of users with clickable links
- `portfolio-preview/` — Shows portfolio details for individual users
- `theme-selector/` — Theme and color customization interface
- `services/` — Portfolio service for API communications and portfolio state management

## Contributing

Contributions are welcome! Please fork the repository, create a feature branch, and submit a pull request for review.

## License

This project is licensed under the MIT License.

## Contact

Ravi Raj 
Email: ravi_2312res1015.iitp.ac.in 
GitHub: (https://github.com/raviraj-47)

For questions or feedback, please open an issue or contact the maintainer.

---



