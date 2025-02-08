package org.example.unicodejparest.repository;


import org.example.unicodejparest.model.Unicode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnicodeRepository extends JpaRepository<Unicode, Integer> {
}
