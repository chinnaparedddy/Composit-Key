package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUserSave {

	public static void main(String[] args) {

		EntityManagerFactory  entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		User user=new User();
		user.setName("Naresh");
		user.setAge(22);
		user.setGender("m");
		user.setPassword("9788526");
		UserId userId=new UserId();
		userId.setEmail("Naresh@gmail.com");
		userId.setPhone(99894519l);
		user.setUserId(userId);
		
		User user1=new User();
		user1.setName("Naresh");
		user1.setAge(22);
		user1.setGender("m");
		user1.setPassword("9788526");
		UserId userId1=new UserId();
		userId1.setEmail("Naresh@gmail.com");
		userId1.setPhone(99894519l);
		user1.setUserId(userId1);
		
		User user2=new User();
		user2.setName("suresh");
		user2.setAge(22);
		user2.setGender("m");
		user2.setPassword("9788526");
		UserId userId2=new UserId();
		userId2.setEmail("Naresh@gmail.com");
		userId2.setPhone(99894519l);
		user2.setUserId(userId2);
		
		entityTransaction.begin();
		entityManager.persist(user);
		entityManager.persist(user1);
		entityManager.persist(user2);
		entityTransaction.commit();
		
	}

}
