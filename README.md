# Issues Screen

## Components

- **AllIssueScreen Composable:**
  - The primary composable function responsible for building the UI of the Issues Screen.
  - The UI is organized within a `Column` layout.

- **RepoAppBar:**
  - A custom app bar that appears at the top of the screen, displaying the title "Issues".

- **LazyColumn:**
  - A vertically scrolling list that efficiently displays the issues.
  - List items are spaced by 8dp, with padding managed through a dimension resource.

- **SingleIssueDesign:**
  - A composable function representing the UI for an individual issue in the list.
  - It is used within the `LazyColumn` to render each issue in `issueList`.

- **issueList:**
  - A predefined list containing issue data, which is rendered in the `LazyColumn`.


https://github.com/user-attachments/assets/302675d9-a6b0-4bb3-a8f7-30097941d57e

# Details Screen

### Components

- **Back Button:**
  - Located at the top left, it allows users to navigate back to the previous screen.

- **Title Bar (`Details`):**
  - Displays the title of the screen, which in this case is "Details." It provides context to the user about what the screen is focused on.

- **Image Display:**
  - A prominent image at the top center, which could represent the logo or an important visual associated with the item being detailed (e.g., a language or project logo).

- **Title Text (`language`):**
  - Below the image, the name or title of the item being detailed is displayed prominently.

- **Statistics Row:**
  - A row of statistics that likely represent various attributes or metrics related to the item:
    - **Star Count (1525)**: Indicates the number of "stars" or favorites this item has received.
    - **Language (`Python`)**: Displays the programming language or category the item belongs to.
    - **Fork Count (347)**: Represents the number of times this item has been forked or copied for further use or modification.

- **Description Section:**
  - A text area providing a detailed description of the item. This is where users can find additional context or information about the screen.

- **Action Button (`Show Issues`):**
  - A prominently displayed button at the bottom of the screen. When clicked, it likely takes the user to the Issues Screen or another related view.
  - The button is styled in a bright blue color, making it stand out as the primary action on the screen.


![image](https://github.com/user-attachments/assets/c0ed94ee-3b17-46e7-9473-fce35ab52232)

# Error Screen 
## Features

- Displays an error image and a message indicating something went wrong.
- Shows the specific error message based on the provided error code.
- Includes a retry button that triggers a retry action.

![image](https://github.com/user-attachments/assets/2c114caa-96b9-4a5f-9280-fe4c4e8b86e4)


