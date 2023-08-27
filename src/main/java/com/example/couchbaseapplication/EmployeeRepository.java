package com.example.couchbaseapplication;


import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.repository.CrudRepository;

//public interface EmployeeRepository extends CouchbaseRepository<Employee, String> {
//}

public interface EmployeeRepository extends CrudRepository<Employee, String> {
	
}
