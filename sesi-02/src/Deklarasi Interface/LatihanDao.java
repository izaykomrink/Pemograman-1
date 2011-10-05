public interface LatihanDao{
	void save(Latihan l);
	void delete(Latihan l);
	Latihan getById(Long id);
}