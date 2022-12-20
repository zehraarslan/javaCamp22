package kodlama.io.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACar.entities.concretes.Brand;

//Repository veri tabanını işleri yapılacak sınıflara verilen isimlerdir.
//Dao olarakta adalndırılabilir.

public interface BrandRepository extends JpaRepository<Brand, Integer> {
	
}
