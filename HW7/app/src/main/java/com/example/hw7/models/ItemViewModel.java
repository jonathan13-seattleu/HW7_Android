package com.example.hw7.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class ItemViewModel {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<ItemModel> ITEMS = new ArrayList<ItemModel>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, ItemModel> ITEM_MAP = new HashMap<String, ItemModel>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        addItem(new ItemModel("Headband", "Absorbs sweat", 0, 0, 3, ItemLocationEnum.Head, AttributeEnum.Defense,"rsz_headband"));
        addItem(new ItemModel("Performance Socks", "Snug and airy", 0, 0, 4, ItemLocationEnum.Feet, AttributeEnum.Defense,"rsz_performance_socks"));
        addItem(new ItemModel("Air Jordans", "Because Michael Jordan", 0, 0, 5, ItemLocationEnum.Feet, AttributeEnum.Speed,"rsz_air_jordan"));
    }

    private static void addItem(ItemModel item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class ItemModel {
        public final int Range;
        public final int Damage;
        public final int Value;
        public final String Name;
        public final String Description;
        public final String id = UUID.randomUUID().toString();
        public final String Guid = id;
        public final String ImageURI;
        public final ItemLocationEnum Location;
        public final AttributeEnum Attribute;


        public ItemModel(String name, String description, int range, int damage,
                         int value, ItemLocationEnum location, AttributeEnum attribute, String imageURI) {
            this.Name = name;
            this.Description = description;
            this.Range = range;
            this.Damage = damage;
            this.Value = value;
            this.Location = location;
            this.Attribute = attribute;
            this.ImageURI = imageURI;
        }

        @Override
        public String toString() {
            return Name;
        }
    }
}
