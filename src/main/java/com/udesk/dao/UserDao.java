package com.udesk.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import com.udesk.entity.User;

@Repository
public interface UserDao {
	//���������˻���Ϣ
    @Select("select * from users")   //����ibatis��ע����sql���������ݿ�
    public List<User> findAll();
    
    public User findOne(Integer id);

    public Integer createUser(User user);
    
    public Integer updateUser(User user);
    
    @Delete("delete from users where id = #{id}")
    public Integer deleteUser(Integer id);
    
    
    
    
    
}
