package exercises;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Restaurant {

    public class Menu {
        private HashMap<MenuItem, Date> menuItems;
        private int daysUntilOld;

        public Menu(int daysUntilOld) {
            this.menuItems = new HashMap<>();
            this.daysUntilOld = daysUntilOld;
        }

        public HashMap<MenuItem, Date> getMenuItems() {
            return menuItems;
        }

        public Integer getDaysUntilOld() {
            return daysUntilOld;
        }

        public void addMenuItem(MenuItem menuItem) {
            Date dateAdded = new Date();
            menuItems.put(menuItem, dateAdded);
        }

        public void removeMenuItem(String itemName) {
            // loop through menuItems, when menuItem name matches input, remove item
        }

        public void setDaysUntilOld(int aDaysUntilOld) {
            daysUntilOld = aDaysUntilOld;
        }
    }

    public class MenuItem {
        private String name;
        private double price;
        private String description;
        private String category;
        // add collection of viable categories to validate inputs

        public MenuItem(String name, double price, String description, String category) {
            this.name = name;
            this.price = price;
            this.description = description;
            this.category = category;
        }

        public String getName() {
            return name;
        }

        public Double getPrice() {
            return price;
        }

        public String getDescription() {
            return description;
        }

        public String getCategory() {
            return category;
        }

        public void setName(String aName) {
            name = aName;
        }

        public void setPrice(double aPrice) {
            price = aPrice;
        }

        public void setDescription(String aDescription) {
            description = aDescription;
        }

        public void setCategory(String aCategory) {
            category = aCategory;
        }
    }
}
