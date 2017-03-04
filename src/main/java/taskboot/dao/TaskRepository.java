package taskboot.dao;

import org.springframework.data.repository.CrudRepository;

import taskboot.model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer>{

}

