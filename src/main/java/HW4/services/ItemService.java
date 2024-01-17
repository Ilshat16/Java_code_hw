package HW4.services;

import HW4.models.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemService {
    List<Item> items;

    public ItemService() {
        items = new ArrayList<>();
    }

    public void add(Item item) {
        items.add(item);
    }

    public Item findByName(String name) {
        for(Item item : items) {
            if (item.getName().equals(name))
                return item;
        }
        return null;
    }
}
