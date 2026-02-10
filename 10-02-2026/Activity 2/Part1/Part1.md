# ACTIVITY 2 – ADVANCED PROBLEM SOLVING SHEET  
## Part 1 – Scenario Based Analysis  

---

### 1. Real-time Chat Message Storage

**Chosen Data Structure:** ArrayList  

**Reason:**  
- Messages are mostly appended at the end.  
- Fast random access by index is supported.  

**Time Complexity:**  
- Add at end → O(1) (Amortized)  
- Access by index → O(1)  

---

### 2. Music Playlist (Frequent Reordering)

**Chosen Data Structure:** LinkedList  

**Reason:**  
- Frequent insertions and deletions in the middle.  
- No shifting of elements required.  

**Time Complexity:**  
- Insert/Delete → O(1) (if reference available)  
- Search → O(n)  

---

### 3. Student Database (Frequent Searching by Index)

**Chosen Data Structure:** ArrayList  

**Reason:**  
- Fast random access required.  

**Time Complexity:**  
- Get(index) → O(1)  

---

### 4. Browser Back and Forward Navigation

**Chosen Data Structure:** LinkedList  

**Reason:**  
- Sequential navigation structure.  
- Frequent additions and removals.  

**Time Complexity:**  
- Insert/Delete → O(1)  
- Traversal → O(n)  

---

### 5. Online Exam System (Sequential Answer Storage)

**Chosen Data Structure:** ArrayList  

**Reason:**  
- Answers stored sequentially.  
- Index-based access required.  

**Time Complexity:**  
- Add → O(1) (Amortized)  
- Access → O(1)  
