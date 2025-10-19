# University Management System Challenge

## Goal
Build a small program that models a university with different types of people (students and professors) using **inheritance** and **objects**.

---

## Requirements

### 1. Parent class: `Person`
**Fields:**
- `name` (String)  
- `age` (int)  
- `department` (String)  

**Methods:**
- `displayInfo()` → prints name, age, and department  
- `roleDescription()` → prints a generic message, e.g., "This person belongs to the university."

---

### 2. Subclasses that inherit from `Person`

#### a) `Student`
**Field:**  
- `course` (String)  

**Method:**  
- `study()` → prints something like `"Studying [course]"`  

**Override `roleDescription()`** to print `"I am a student."`

#### b) `Professor`
**Field:**  
- `employeeId` (String)  

**Method:**  
- `teach()` → prints something like `"Teaching in [department]"`  

**Override `roleDescription()`** to print `"I am a professor."`

---

### 3. Main class: `UniversityMain`

**Tasks:**
1. Create an array or list of `Person` objects (students and professors).  
2. Loop through each `Person` and:
   - Call `displayInfo()`  
   - Call `roleDescription()`  
   - If the person is a `Student`, call `study()`  
   - If the person is a `Professor`, call `teach()`
```

