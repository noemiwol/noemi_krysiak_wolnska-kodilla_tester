package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.CodeCoverageApplication;
import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CodeCoverageApplication.class)
public class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;

    private static final String DESCRIPTION = "Test: Learn Hibernate Homework";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("What we have to do", DESCRIPTION);
        taskListRepository.save(taskList);
        String listName = taskList.getListName();
        //When
        List<TaskList> testingList = taskListRepository.findByListName(listName);
        //Then
        Assert.assertEquals(1,testingList.size());
        //CleanUp
        int cleanId = testingList.get(0).getId();
        taskListRepository.deleteById(cleanId);
    }

    @Test
    public void testTaskListRepositorySaveWithTasks() {
        //Given
        Task task = new Task("Test1", 1);
        Task task2 = new Task("Test2", 2);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(1), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(2), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList("New list", "ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        //When
        taskListRepository.save(taskList);
        int id = taskList.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        taskListRepository.deleteById(id);
    }
}
