package com.example.myapplication4;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface StudentDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertStudent(Student student);
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertorReplaceStudent(Student student);
    @Update(onConflict = OnConflictStrategy.REPLACE)
    void updateStudent(Student student);
    @Query("DELETE FROM Student")
    void deleteAll();
    @Query("SELECT * FROM Student")
    public List<Student> findAllStudent();
}
