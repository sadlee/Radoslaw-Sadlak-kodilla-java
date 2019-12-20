package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.dao.TaskDao;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    @Autowired
    private TaskDao taskDao;

    private static final String LISTNAME = "To Do";
    private static final String DESCRIPTION_1 = "1st";
    private static final String DESCRIPTION_2 = "2nd";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList1 = new TaskList(LISTNAME, DESCRIPTION_1);
        TaskList taskList2 = new TaskList(LISTNAME, DESCRIPTION_2);

        //When
        taskListDao.save(taskList1);
        taskListDao.save(taskList2);

        //Then
        List<TaskList> readTaskList = taskListDao.findByListName(LISTNAME);

        Assert.assertEquals(2, readTaskList.size());
        Assert.assertEquals(LISTNAME, readTaskList.get(0).getListName());
        Assert.assertEquals(LISTNAME, readTaskList.get(1).getListName());

        //CleanUp
        taskListDao.delete(taskList1);
        taskListDao.delete(taskList2);
    }
}