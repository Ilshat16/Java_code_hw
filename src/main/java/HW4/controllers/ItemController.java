package HW4.controllers;

import HW4.exceptions.ItemNotFoundException;
import HW4.models.Item;
import HW4.services.ItemService;
import HW4.view.ItemView;

public class ItemController {
    private ItemService itemService;
    private ItemView itemView;

    public ItemController(ItemService itemService, ItemView itemView) {
        this.itemService = itemService;
        this.itemView = itemView;
    }

    public void createItem() {
        Item item = itemView.createItem();
        itemService.add(item);
    }

    public Item findByName() throws ItemNotFoundException {
        String name = itemView.getItemName();
        Item item = itemService.findByName(name);
        if(item == null)
            throw new ItemNotFoundException("Такого продукта нет в списке");
        else
            return item;
    }

}
