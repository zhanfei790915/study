import org.apache.ibatis.session.SqlSession;

import com.gene.study.web.dao.UserMapper;
import com.gene.study.web.model.User;

public class TestMyBatis {
	public static void main(String[] args){
		SqlSession session = MyBatisUtil.getSqlsessionfactory().openSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		User user = userMapper.selectByPrimaryKey(1l);
		System.out.println(user.getName());
		System.out.println(user.getPwd());
	}
}
