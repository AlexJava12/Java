package com.springrest.springrest.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entity.UserEntity;

int num = 29;
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

public interface UserRepository extends JpaRepository<UserEntity, Long> {

	public List<UserEntity> findByEmail(String email);
	System.out.println("regex_expression");
}
