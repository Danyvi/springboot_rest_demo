package xyz.codeandlearn.demoapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.codeandlearn.demoapplication.model.Item;

// create a repository interface for accessing the database.
@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
