package School_Management_System;
/**
 * the school can have many students and many teachers
 * Implement teachers and students using an array list
 * created by Richard 28/06/2021
 */

import java.util.List;

class School {
    private List<Teacher> teachers;
    private List<Student> students;
    public String getToltalMoneyEarned;
    private static int toltalMoneyEarned;
    private static int toltalMoneySpent;

    /**
     * new school object
     * @param teachers list of teachers in the school
     * @param students list of students in the school
     */
    public School(List<Teacher> teachers, List<Student> students){
        this.teachers = teachers;
        this.students = students;
        toltalMoneyEarned = 0;
        toltalMoneySpent = 0;
    }

    

    /**
     * @return List<Teacher> return the list of teachers in the school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * add the teachers to the school
     * @param teachers the teacher tobe added
     */
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * @return List<Student> return the list of students in the school
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * add students to the school
     * @param students the students to be added
     */
    public void addStudents(Student student) {
        students.add(student);
    }

    /**
     * @return int return the toltalMoneyEarned
     */
    public int getToltalMoneyEarned() {
        return toltalMoneyEarned;
    }

    /**
     * add the toltal money eaned by the school
     * @param toltalMoneyEarned the toltalMoney tobe added
     */
    public static void updateToltalMoneyEarned(int MoneyEarned) {
        toltalMoneyEarned += MoneyEarned;
    }

    /**
     * @return int return the toltalMoneySpent
     */
    public int getToltalMoneySpent() {
        return toltalMoneySpent;
    }

    /**
     * update the money spent by the school
     * @param toltalMoneySpent the toltalMoney to be spent
     */
    public static void updateToltalMoneySpent(int moneySpent) {
        /**
         * totalMoneyEarned = toltalMoneyEarned - MoneySpent
         */
       toltalMoneyEarned -= moneySpent;
    }

}
