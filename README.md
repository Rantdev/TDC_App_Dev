agile-project-management/
│
├── server/                              # Backend application
│   ├── config/                          # Configuration files
│   │   ├── db.js                       # Database connection
│   │   └── env.js                      # Environment validation
│   │
│   ├── controllers/                     # Business logic
│   │   ├── authController.js           # Authentication (login, register, JWT, Google)
│   │   ├── projectController.js        # Project CRUD operations
│   │   ├── storyController.js          # Story management
│   │   ├── taskController.js           # Task management
│   │   ├── teamController.js           # Team member management
│   │   ├── chatController.js           # Real-time chat
│   │   ├── performanceController.js    # Analytics & reports
│   │   ├── profileController.js        # User profile management
│   │   ├── emailController.js          # Email notifications
│   │   └── otpController.js            # OTP verification
│   │
│   ├── middleware/                      # Express middleware
│   │   ├── auth.js                     # JWT verification
│   │   ├── errorHandler.js             # Global error handling
│   │   └── validation.js               # Input validation
│   │
│   ├── models/                          # Database models
│   │   └── initDB.js                   # Database schema initialization
│   │
│   ├── routes/                          # API routes
│   │   ├── authRoutes.js               # Authentication endpoints
│   │   ├── projectRoutes.js            # Project endpoints
│   │   ├── storyRoutes.js              # Story endpoints
│   │   ├── taskRoutes.js               # Task endpoints
│   │   ├── teamRoutes.js               # Team endpoints
│   │   ├── chatRoutes.js               # Chat endpoints
│   │   ├── performanceRoutes.js        # Analytics endpoints
│   │   ├── profileRoutes.js            # Profile endpoints
│   │   └── otpRoutes.js                # OTP endpoints
│   │
│   ├── jobs/                            # Scheduled jobs
│   │   └── reminderJob.js              # Daily overdue task reminder
│   │
│   ├── .env                             # Environment variables (not pushed)
│   ├── .env.example                     # Example environment variables
│   ├── package.json                     # Dependencies
│   ├── package-lock.json                # Lock file
│   ├── app.js                           # Express app configuration
│   └── server.js                        # Server entry point
│
├── client/                              # Frontend application
│   ├── public/                          # Static files
│   │   └── vite.svg                    # Vite logo
│   │
│   ├── src/                             # Source code
│   │   ├── assets/                     # Images, fonts, etc.
│   │   │   └── logo.svg
│   │   │
│   │   ├── components/                 # Reusable components
│   │   │   ├── Layout/                # Layout components
│   │   │   │   ├── Sidebar.jsx        # Navigation sidebar
│   │   │   │   ├── Navbar.jsx         # Top navigation bar
│   │   │   │   └── ProtectedRoute.jsx # Route guard
│   │   │   │
│   │   │   ├── Projects/               # Project components
│   │   │   │   ├── ProjectCard.jsx    # Project card display
│   │   │   │   └── ProjectModal.jsx   # Create/Edit modal
│   │   │   │
│   │   │   ├── Stories/                # Story components
│   │   │   │   ├── StoryCard.jsx      # Story card display
│   │   │   │   └── StoryModal.jsx     # Create/Edit modal
│   │   │   │
│   │   │   ├── Tasks/                  # Task components
│   │   │   │   ├── TaskCard.jsx       # Task card display
│   │   │   │   ├── TaskBoard.jsx      # Kanban board
│   │   │   │   └── TaskModal.jsx      # Create/Edit modal
│   │   │   │
│   │   │   ├── Chat/                   # Chat components
│   │   │   │   ├── ChatBox.jsx        # Real-time chat box
│   │   │   │   └── ChatMessage.jsx    # Individual message
│   │   │   │
│   │   │   ├── Performance/            # Performance components
│   │   │   │   ├── StatsCard.jsx      # Statistics card
│   │   │   │   ├── TaskChart.jsx      # Chart component
│   │   │   │   └── Leaderboard.jsx    # Top performers
│   │   │   │
│   │   │   └── Common/                 # Common components
│   │   │       ├── LoadingSpinner.jsx # Loading indicator
│   │   │       ├── ConfirmDialog.jsx  # Confirmation modal
│   │   │       └── Toast.jsx          # Notification toast
│   │   │
│   │   ├── pages/                       # Page components
│   │   │   ├── Login.jsx               # Login page
│   │   │   ├── Register.jsx            # Registration page
│   │   │   ├── OTPVerification.jsx     # OTP verification page
│   │   │   ├── Dashboard.jsx           # User dashboard
│   │   │   ├── Projects.jsx            # Projects listing
│   │   │   ├── ProjectDetails.jsx      # Single project view
│   │   │   ├── StoryTasks.jsx          # Story tasks view
│   │   │   ├── MyTasks.jsx             # User's assigned tasks
│   │   │   ├── Team.jsx                # Team management
│   │   │   ├── Performance.jsx         # Analytics dashboard
│   │   │   ├── Profile.jsx             # User profile
│   │   │   └── RoleSetup.jsx           # Initial role setup
│   │   │
│   │   ├── context/                     # React context
│   │   │   └── AuthContext.jsx         # Authentication state
│   │   │
│   │   ├── hooks/                       # Custom hooks
│   │   │   ├── useAuth.js              # Auth hook
│   │   │   ├── useToast.js             # Toast notification hook
│   │   │   └── useLocalStorage.js      # Local storage hook
│   │   │
│   │   ├── services/                   # API services
│   │   │   └── api.js                 # Axios configuration
│   │   │
│   │   ├── utils/                      # Utility functions
│   │   │   ├── constants.js           # App constants
│   │   │   ├── helpers.js             # Helper functions
│   │   │   └── validators.js          # Form validation
│   │   │
│   │   ├── styles/                     # Styles
│   │   │   └── global.css             # Global styles
│   │   │
│   │   ├── App.jsx                     # Main app component
│   │   ├── main.jsx                    # Entry point
│   │   └── index.css                   # Tailwind CSS
│   │
│   ├── .env                             # Environment variables (not pushed)
│   ├── .env.example                     # Example environment variables
│   ├── index.html                       # HTML template
│   ├── package.json                     # Dependencies
│   ├── package-lock.json                # Lock file
│   ├── tailwind.config.js              # Tailwind configuration
│   ├── postcss.config.js               # PostCSS configuration
│   └── vite.config.js                  # Vite configuration
│
├── database/                            # SQLite database
│   └── agile.db                        # Database file (not pushed)
│
├── docs/                                # Documentation
│   ├── api-docs.md                     # API documentation
│   ├── architecture.md                 # Architecture documentation
│   └── schema.md                       # Database schema documentation
│
├── .gitignore                           # Git ignore file
├── README.md                            # Project documentation
├── LICENSE                              # MIT License
└── package.json                         # Root package.json (optional)
