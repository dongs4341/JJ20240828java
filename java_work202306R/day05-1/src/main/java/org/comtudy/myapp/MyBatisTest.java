package org.comtudy.myapp;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.example.Blog;

public class MyBatisTest {

	public static void main(String[] args) {
		// 연결 하고자 하는 DB의 드라이버와 mybatis 라이브러리 가 모두 준비 되어야 합니다.
		// app에서 실행 하기 위해서 라이브러리를 빌드패스로 추가
		
		String resource = "org/mybatis/example/mybatis-config.xml"; // MyBatis 설정 파일 경로
        try (Reader reader = Resources.getResourceAsReader(resource)) {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            try (SqlSession session = sqlSessionFactory.openSession()) {
            	  Blog blog = session.selectOne("BlogMapper.selectBlog", 1);
            	  System.out.println(blog);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
