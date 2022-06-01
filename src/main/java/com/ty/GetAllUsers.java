package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAllUsers {
	
	public static void main(String[] args) {

		EntityManagerFactory  entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		String sql="select u from User u where u.userId.email=?1 and u.password=?2";
		Query query=entityManager.createQuery(sql);
		query.setParameter(1, "naresh@gmail.com");
		query.setParameter(2, "9989452187");
		List<User> users=query.getResultList();
		for(User user:users) {
			System.out.println(user.getName());
			System.out.println(user.getGender());
			System.out.println(user.getAge());
			System.out.println(user.getUserId().getEmail());
			System.out.println(user.getUserId().getPhone());
			System.out.println("========================");
		}
		
	}

}
