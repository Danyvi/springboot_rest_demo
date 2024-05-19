package xyz.codeandlearn.demoapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.codeandlearn.demoapplication.repository.ItemRepository;
import xyz.codeandlearn.demoapplication.model.Item;

import java.util.List;
import java.util.Optional;

// service layer to handle the business logic
// This layer will use the repository to interact with the database
@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public Optional<Item> getItemById(Long id) {
        return itemRepository.findById(id);
    }

    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }


}
