package org.learning.collection;

public class Student implements Comparable<Student> {

  private String name;
  private Integer id;

  public Student(String name, Integer id) {
    this.name = name;
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", id=" + id +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Student student = (Student) o;

    if (getName() != null ? !getName().equals(student.getName()) : student.getName() != null) {
      return false;
    }
    return getId() != null ? getId().equals(student.getId()) : student.getId() == null;
  }

  @Override
  public int hashCode() {
    int result = getName() != null ? getName().hashCode() : 0;
    result = 31 * result + (getId() != null ? getId().hashCode() : 0);
    return result;
  }

  @Override
  public int compareTo(Student o) {
    return this.getName().compareTo(o.getName());
  }
}
