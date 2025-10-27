SOFTWARE DEVELOPMENT LIFE CYCLE (SDLC)

---

## OBJECTIVES

When studying SDLC, you should understand:

1. What SDLC is
2. Why we need it
3. Its phases (the life journey of software)
4. Key documents:

   * BRS vs SRS
   * FRS vs NFRS
5. The different SDLC models (Waterfall, V-Model, Spiral, Agile)

---

## WHAT IS SDLC?

### Simple Meaning:

SDLC = “Software’s Life Story” — from idea to maintenance.

Just like humans go through life stages (birth → growth → maturity → old age), software also passes through phases: planning, design, building, testing, deployment, and maintenance.

### Technical Definition:

SDLC is a systematic process used to plan, design, develop, test, and deliver high-quality software that meets customer needs.

### Goals:

* Build software that works correctly
* Deliver on time and within budget
* Make customers happy
* Maintain quality and stability

### Analogy:

Think of SDLC like building a house:

* Plan what to build (planning)
* Draw the blueprint (design)
* Build the structure (coding)
* Inspect everything (testing)
* Move in (deployment)
* Fix leaks or upgrade later (maintenance)

---

## WHY SDLC?

Without SDLC, software projects become messy — over budget, missed deadlines, or total failures.

### Benefits:

| Benefit                       | In Simple Words                      |
| ----------------------------- | ------------------------------------ |
| Project planning & scheduling | Know what to do, when, and how       |
| Framework & standard          | Everyone follows the same rules      |
| Tracking & control            | Easy to monitor progress             |
| Visibility                    | Everyone can see what’s happening    |
| Faster development            | Because you plan before coding       |
| Less risk                     | Avoid surprises like cost overruns   |
| Predictable delivery          | Can tell when each stage will finish |

Summary: SDLC is like a roadmap for software — reduces chaos and increases success.

---

## PHASES OF SDLC

### 1. Planning / Ideation Phase

This is the thinking stage.

Questions to ask before building:

* Is it possible?
* Is it worth the cost?
* Is it legal?
* Is it technically doable?

#### Feasibility Types:

| Type        | Question it asks                      |
| ----------- | ------------------------------------- |
| Economic    | Can we afford it?                     |
| Legal       | Is it allowed under laws/regulations? |
| Operational | Can the team and client operate it?   |
| Technical   | Do we have the right tools and tech?  |
| Schedule    | Can we finish on time?                |

Output: Project plan, cost estimate, schedule, and resource plan.

---

### 2. Requirement Analysis Phase

Figure out what exactly to build.

Steps:

* Talk with stakeholders (clients, managers, users)
* Understand customer needs
* Document everything clearly

Output: **SRS (Software Requirements Specification)** — defines *what the system should do*, not *how it should do it*.

---

### BRS vs SRS

| BRS (Business Requirement Spec) | SRS (Software Requirement Spec)   |
| ------------------------------- | --------------------------------- |
| Written by Business Analyst     | Written by System Architect       |
| Based on client’s vision        | Technical translation of BRS      |
| High-level description          | Detailed technical and functional |
| Focuses on *what* client wants  | Focuses on *how* to implement     |
| Simple, business language       | Technical language                |

Example:

* BRS: “User should be able to book a taxi from the app.”
* SRS: “System must store user booking details in the database and confirm via SMS.”

---

### FRS vs NFRS

| Type                              | Meaning              | Example                                             |
| --------------------------------- | -------------------- | --------------------------------------------------- |
| FRS (Functional Requirement)      | What the system does | “When user clicks ‘Pay’, system processes payment.” |
| NFRS (Non-Functional Requirement) | How well it works    | “Payment should process in less than 3 seconds.”    |

FRS = Functionality, NFRS = Quality

---

### 3. Design Phase

Blueprint stage: decide *how* the system will work.

Decisions:

* Technology stack (React, Node.js, Python, etc.)
* Database structure
* UI layout and workflow
* Risk handling, performance, scalability

Levels of design:

**High-Level Design (HLD)**

* System overview
* Modules and interactions
* Tech stack
* Database architecture

**Low-Level Design (LLD)**

* Detailed design of each module
* Functions, logic, inputs/outputs, error handling
* Pseudocode and database details

Example:

* HLD: User Module and Admin Module
* LLD: `login()`, `signup()`, `bookRide()` functions

---

### 4. Coding / Implementation Phase

Developers build the system.

Steps:

1. Divide work into modules
2. Code each module using chosen language
3. Follow coding standards
4. Use compiler, debugger, version control (Git)
5. Unit test each part

Example: Functions like `registerUser()`, `bookRide()` tested individually.

---

### 5. Testing Phase

QA team checks for bugs and requirement compliance.

Testing includes:

* Functional Testing
* Performance Testing
* Security Testing
* Usability Testing

Process: QA → Developer fixes → QA retests → Repeat until stable

Example: Verify sign-up, payment, app stability on poor internet

---

### 6. Deployment Phase

Software goes live.

Example: Uber-like app is published on Play Store and App Store.

---

### 7. Maintenance Phase

Ongoing support after deployment.

Activities:

| Activity    | Meaning                            |
| ----------- | ---------------------------------- |
| Bug Fixing  | Fix reported issues                |
| Upgrade     | Move to new tech/version           |
| Enhancement | Add new features based on feedback |

Example: Add dark mode on user request.

---

## SDLC MODELS

Different projects use different SDLC styles.

---

### 1. Waterfall Model

Linear and sequential — finish one step before next.

Advantages:

* Simple and easy to manage
* Well-documented stages
* Works for small, clear projects

Disadvantages:

* No working software until end
* Hard to handle changing requirements
* Risky for long-term projects

---

### 2. V-Model

V-shaped model:

* Left side = development (Verification)
* Right side = testing (Validation)

Advantages:

* Early bug detection
* Clear testing plan
* Easy progress tracking

Disadvantages:

* Inflexible
* No early prototype
* Hard to adapt to change

Best for safety-critical systems.

---

### 3. Spiral Model

Combination of Waterfall + Prototyping + Risk Analysis. Repeated cycles (spirals).

Advantages:

* Early risk detection
* User feedback after each cycle
* Suitable for big, risky projects

Disadvantages:

* Complex
* Costly for small projects
* Requires skilled risk analysts

Best for large, evolving projects.

---

### 4. Agile Model

Focuses on speed, collaboration, and flexibility. Work in short cycles (sprints) delivering small working software versions.

Agile Values:

1. Individuals & communication over processes
2. Working software over documentation
3. Customer collaboration over contracts
4. Responding to change over following a plan

Advantages:

* Rapid delivery
* Flexible for changes
* Continuous feedback
* Teamwork-oriented

Disadvantages:

* Needs skilled team
* Heavy customer involvement
* Minimal documentation can cause future confusion

Best for dynamic products and fast-changing environments.

---

## SUMMARY TABLE

| Phase       | Main Goal            | Output          |
| ----------- | -------------------- | --------------- |
| Planning    | Study feasibility    | Project plan    |
| Requirement | Define what to build | SRS document    |
| Design      | Create blueprint     | HLD + LLD       |
| Coding      | Build the system     | Source code     |
| Testing     | Ensure quality       | Tested software |
| Deployment  | Release to users     | Live software   |
| Maintenance | Improve & fix        | Updated system  |

---

## MEMORY TRICK 

Imagine building your dream app:

1. Plan – Brainstorm and check feasibility
2. Requirements – Ask users what they want
3. Design – Draw how it will look and work
4. Code – Build it
5. Test – Check for errors
6. Deploy – Release to users
7. Maintain – Fix and upgrade continuously

SDLC is a continuous cycle of improvement.


---

# Project Management with Jira

---

## Objectives

* Understand what Jira is
* Create and manage projects in Jira
* Learn about Epics, Stories, Bugs, and Tasks
* Understand Jira workflow

---

## Recap on Agile/Scrum

* Agile is an approach to software development where requirements and solutions evolve through the collaborative effort of self-organizing, cross-functional teams and their customers/end users.
* Development and testing activities are concurrent, unlike the Waterfall model.

---

## What is Jira

* Atlassian Jira is an issue and project tracking tool.
* Allows for planning, tracking, releasing, and reporting.
* Lets you prioritize, assign, track, report, and audit issues, from software bugs and helpdesk tickets to project tasks and change requests.
* Improves productivity by reducing time wasted on tracking issues and coordination.
* Improves quality by ensuring all tasks are recorded with full details and followed until completion.

---

## Scrum Roles

**Scrum Master**

* Facilitates the agile development team
* Enables close cooperation across all roles and functions

**Product Owner**

* Defines the product features
* Decides release date and content
* Prioritizes features according to market value
* Adjusts features and priority each iteration as needed
* Accepts or rejects work results

**Scrum Team**

* Developers and QA

---

## Create Jira Account

* QA team reviews the requirement document to identify testable items
* QA team interacts with stakeholders (Client, Business Analyst, Technical Leads, System Architects) to understand requirements
* Requirements can be:

  * Functional: defining what the software must do
  * Non-functional: defining system performance, security, availability

---

## Jira Project

* A Jira project is a grouping of work items (called "issues") held in common
* Projects can contain different types of issues with shared keys
* Each project has its own permissions system and versioning (v1, v2, etc.)
* Projects may include components to organize work

---

## Jira Workflow

* A Jira workflow is a set of statuses and transitions that an issue goes through during its lifecycle
* The workflow typically includes five main stages once an issue is created

---

## Backlog

* A backlog is a list of features, often described as user stories from a user's perspective
* In Scrum, the backlog must be prioritized so that high-priority items are ready for the next sprint

---

## Epic

* A large body of work that can be broken down into several smaller stories (issues in Jira)
* Epics often span multiple teams and projects, and multiple boards
* Usually delivered over multiple sprints
* General use case that is a collection of user stories

---

## Stories

* A Story or user story is a software requirement expressed in a few short, non-technical sentences
* Outlines the desired outcome
* Scope should be addressed within a single sprint

---

## Task

* Represents a technical activity (e.g., design a diagram, code a functionality, test a device, prepare a dataset)
* Contains a detailed description of an individual work item
* Not directly related to a user story
* Can be shared, assigned, related to other tasks, or blocked by/blocks other tasks
* Can be created by anyone

---

## Sub-Task

* Like a Task, but typically part of a Story
* Breaks up Stories into digestible workloads
* Created from a Story by anyone

---

## Epic vs Stories vs Task

* **Epic**: User Authentication
* **User Stories**:

  * User login screen
  * Logout screen
  * Forgot password
* **Tasks**:

  * Setup repository
  * Setup CI/CD pipeline

---

## Work Item Attributes

* Assignee
* Attachment
* Comment
* Component
* Description
* Epic Link
* Fix Version
* Issue Type
* Labels (keywords to classify issues)
* Priority
* Sprint

---


##LAB EXERCISE 

# Jira Project Management Lab Guide

---

At the end of this exercise, you will be able to:

* Create a Jira account
* Create a new project
* Create a sprint
* Generate reports

**Requirement:**

* Prepare project summary and description for user stories

---

## About Jira

* Jira is a powerful tool optimized for Agile project management.
* It allows planning, tracking, releasing, and reporting.
* Jira lets you prioritize, assign, track, report, and audit issues, including bugs, helpdesk tickets, project tasks, and change requests.
* Improves productivity by reducing time spent tracking issues and coordinating tasks.
* Improves quality by ensuring all tasks are recorded with full details and followed until completion.

---

## Jira Workflows

* Administrators can customize steps and resolutions of workflows.
* Provides high-level control over how and when workflows transition between stages.

---

## Steps to Create a Jira Account

1. Go to [Jira signup page](https://www.atlassian.com/try/cloud/signup?bundle=jira-software&edition=free)
2. Provide your preferred site name and application title.
3. Add users to your project: as a project admin, you can add individuals or groups to project-specific roles.

---

## Steps to Create a Jira Project

### Step 1: Choose a Scrum Template

* Scrum board is used by teams to plan work in detail before starting a project.
* Includes creating sprints and assigning story points to plan which stories go into each sprint.
* Scrum focuses on delivering business value quickly with time-boxed iterations.
* Kanban is a visual system for managing development work with flexible iteration durations.

---

### Step 2: Create a New Project

* A Jira project is a collection of issues.
* Can be used to coordinate product development, track a project, manage a helpdesk, etc.

---

### Step 3: Scrum Home Page

* After creating a project, you will see:

  * Backlog
  * Active Sprint
  * Version releases for each sprint
* Roadmaps allow team-level planning of large work items (Epics) months in advance.

---

### Step 4: Create a Sprint

1. Go to the backlog of your Scrum project.
2. Click **Create sprint** at the top of the backlog.

---

### Step 5: Create a User Story

1. Select **Create new issue**
2. Choose **Story** as the issue type
3. Use the **Summary** field to describe the user story

---

### Step 6: Select Issue Type

* Choose the issue type depending on the project, e.g., Development or Testing

---

### Step 7: User Story Summary and Description

* **Summary:** Informal explanation of a software feature from the end user perspective
* Purpose: Articulate how the feature provides value to the customer

---

### Step 8: Assign User Story to Team Member

* Click the **Assignee** dropdown at the top-right of the story
* Select team members to assign

---

### Step 9: User Story in Backlog

* A backlog is a prioritized list of tasks supporting a larger strategic plan
* Contains items agreed upon to be worked on next

---

### Step 10: View Story Details

* View details like start date, due date, and child issues
* Add story points for estimation

---

### Step 11: Create a Sub-Task for Story

* Attach documents or programs to the project manager
* Create a sub-task by clicking **Create Subtask**, fill in details, and save

---

### Step 12: Start Sprint

* Sprint is a fixed period in the development cycle for completing work from the backlog
* Add issues to the sprint and start it by clicking **Create Sprint**

---

### Step 13: Set Sprint Duration

* Scrum rule: Sprint should never exceed one month

---

### Step 14: Monitor Team Progress

* Track progress during the sprint using the **Sprint Report**

---

### Step 15: Close the Sprint

* Navigate to **Active sprints** on your Scrum board
* Click **Complete Sprint**
* Completed issues move out of Active Sprints

---

### Step 16: Generate Burnup Chart Report

* A visual representation of a team’s work process
* Shows project scope and completed work
* Helps track progress towards sprint completion

---

