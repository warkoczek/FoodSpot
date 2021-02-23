package pl.warkoczewski.foodspot.model.entity.restaurant;

import pl.warkoczewski.foodspot.model.entity.BaseEntity;
import pl.warkoczewski.foodspot.model.enums.TABLE_NAME;

import javax.persistence.Entity;

@Entity
public class Table extends BaseEntity {
    private TABLE_NAME table_name;
    private boolean isAvailable;

    public Table() {
    }
    public Table(TABLE_NAME table_name, boolean isAvailable){
        this.table_name = table_name;
        this.isAvailable = isAvailable;
    }

    public TABLE_NAME getTable_name() {
        return table_name;
    }

    public void setTable_name(TABLE_NAME table_name) {
        this.table_name = table_name;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
