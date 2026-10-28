package senai.com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import senai.com.demo.model.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
