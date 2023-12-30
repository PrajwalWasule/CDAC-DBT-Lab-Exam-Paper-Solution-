-- 1. WRITE A QUERY TO FIND THE NAME (FIRST_NAME, LAST_NAME) AND HIRE DATE OF THE 
-- EMPLOYEES WHO WAS HIRED AFTER 'Clara'.

SELECT FIRST_NAME, LAST_NAME FROM employees WHERE ABS(TIMESTAMPDIFF(YEAR,NOW(),HIRE_DATE)) > 
(SELECT ABS(TIMESTAMPDIFF(YEAR,NOW(),HIRE_DATE)) FROM employees WHERE FIRST_NAME='Clara');

--OR

SELECT FIRST_NAME, LAST_NAME FROM employees
WHERE HIRE_DATE > (SELECT HIRE_DATE FROM employees WHERE FIRST_NAME='Clara'); 

-- 2. WRITE A QUERY TO FIND THE EMPLOYEE ID, JOB TITLE, NUMBER OF DAYS BETWEEN ENDING DATE 
-- AND STARTING DATE FOR ALL JOBS IN DEPARTMENT 90 FROM JOB HISTORY. 

SELECT e.EMPLOYEE_ID, j.JOB_TITLE, TIMESTAMPDIFF(DAY,e.HIRE_DATE,NOW()) AS N_DAYS_OF_HIRING 
FROM employees e INNER JOIN jobs j ON e.JOB_ID = j.JOB_ID
INNER JOIN departments d ON d.DEPARTMENT_ID=e.DEPARTMENT_ID
WHERE d.DEPARTMENT_ID=90;

-- 3. WRITE A QUERY TO DISPLAY JOB TITLE, EMPLOYEE NAME, AND THE DIFFERENCE BETWEEN 
-- SALARY OF THE EMPLOYEE AND MINIMUM SALARY FOR THE JOB. 

SELECT JOB_TITLE, CONCAT(FIRST_NAME,' ',LAST_NAME) AS EMPLOYEE_NAME, 
SALARY - ( SELECT MIN(SALARY) FROM employees ) AS SAL_DIFF 
FROM employees;

-- 4. WRITE A QUERY TO DISPLAY DEPARTMENT NAME, NAME (FIRST_NAME, LAST_NAME), HIRE DATE, 
-- SALARY OF THE MANAGER FOR ALL MANAGERS WHOSE EXPERIENCE IS MORE THAN 15 YEARS 
 
-- 5. WRITE A STORE FUNCTION TO FIND THE TYPE OF CARD TO BE ALLOCATED TO THE EMPLOYEE 
-- BASED ON THE SALARY :-  
-- • Salary between 1000 - 10000  (Silver Card With 50000 Limit) 
-- • Salary between 10000 - 20000 (Gold Card With 150000 Limit) 
-- • Salary greater then 20000 (Platinum Card with 300000 Limit) 
 
-- 6.  WRITE A QUERY TO GET THE YEARS IN WHICH MORE THAN 10 EMPLOYEES JOINED. 
 
-- 7. WRITE A QUERY TO DISPLAY THE FIRST WORD FROM THOSE JOB TITLES WHICH CONTAINS MORE 
-- THAN ONE WORDS.  
 
-- 8. WRITE A QUERY TO DISPLAY THE FIRST EIGHT CHARACTERS OF THE EMPLOYEES' FIRST NAMES 
-- AND INDICATES THE AMOUNTS OF THEIR SALARIES WITH '$' SIGN. EACH '$' SIGN SIGNIFIES A 
-- THOUSAND DOLLARS. SORT THE DATA IN DESCENDING ORDER OF SALARY. 