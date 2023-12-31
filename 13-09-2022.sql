-- Q1. IMPORT THE TEST.SQL FILE AND SOLVE THE FOLLOWING QUERIES –                                                       
--         [25 MARKS] 
 
-- 1. DISPLAY STUDENT NO. AND TOTAL MARKS OF EACH STUDENT HAVING TOTAL MARKS GREATER 
-- THAN 160. 
 
 SELECT s.Student_No, SUM(m.Mark) AS Total_marks
 FROM Students s INNER JOIN marks m
 ON s.Student_No = m.Student_No 
 GROUP BY s.Student_No
 HAVING SUM(m.Mark)>160;

-- 2. DISPLAY STUDENT NAME (FORENAME + SURNAME), MODULE NAME, AND MARK OF STUDENTS 
-- HAVING MARK GREATER THAN THE MARK OF EMILE ZOLA IN THE DATABASES MODULE USING 
-- JOINS. 


-- 3. CREATE A FOREIGN KEY CONSTRAINT ON THE ‘STUDENT_NO’ COLUMN OF THE MARKS TABLE 
-- ASSUMING ‘STUDENT_NO’ IS THE PRIMARY KEY OF THE STUDENT TABLE. 
 
 ALTER TABLE marks ADD FOREIGN KEY (Student_No) REFERENCES students(Student_No);

-- 4. 
-- WRITE A FUNCTION TO TAKE THE INPUT AS MARK AND RETURN THE GRADE. 
-- GRADE IS A IF MARK IS 80 AND ABOVE 
-- ELSE GRADE IS B IF MARK IS IN RANGE 65 TO 80 
-- ELSE GRADE IS C IF MARK IS IN RANGE 50 TO 64 
-- OTHERWISE, FAIL IF MARK < 50. 

-- go to MarkToGrade.sql

-- 5. WRITE A STORED PROCEDURE TO DISPLAY ALL THE TABLES WHOSE NAME STARTS WITH M. 

-- go to StartWithM.sql
 
-- Q2. IMPORT THE EMP.CSV FILE AND SOLVE THE FOLLOWING QUERIES USING MONGODB –                        
--         [15 MARKS] 

-- go to 13-09-2022-table.mongodb

-- 1. DISPLAY EMPLOYEE NAME WHOSE SALARY(SAL) GREATER THAN 2000. 

db.EMP.find({SAL: {$gt:2000}});
 
-- 2. INSERT A RECORD IN THE EMP COLLECTION. (ASSUME EMPLOYEE DETAILS)  

db.EMP.insertOne({ EMP_ID: 7, EMP_NAME: "Rakesh Roshan", SAL: 6800.0, DEPT_ID: 105 })

-- 3. DELETE THE RECORD OF THE EMPLOYEE WHOSE NAME IS FORD.

db.EMP.deleteOne({ EMP_NAME: 'Michael Ford'});