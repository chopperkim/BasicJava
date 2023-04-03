package chapter08.confirm;

// DAO: Data Access Object => 데이터에 접근하는 객체
// => iBatis or myBatis => orm framework
public interface DataAccessObject {
	void select();
	void insert();
	void update();
	void delete();
}
