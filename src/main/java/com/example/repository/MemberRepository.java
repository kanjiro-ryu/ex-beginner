package com.example.repository;

import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.domain.Member;

@Repository

public class MemberRepository {

	@Autowired
	private NamedParameterJdbcTemplate template;

	private static final RowMapper<Member> MEMBER_ROW_MAPPER =
	
    (rs , i ) -> {
    	Member member = new Member();
    	member.setId(rs.getInt("id"));
    	member.setName(rs.getString("name"));
    	member.setAge(rs.getInt("age"));
    	member.setDepId(rs.getInt("dep_id"));
    	
    	return member;
    };

	public List<Member> findBy() {
		String sql = "SELECT name FROM members WHERE name LIKE '%ロー' ";
		
		List<Member> memberList = template.query(sql, MEMBER_ROW_MAPPER);
		
		return memberList;
  		
	}

}
