//package nija.webshop.repository;
//
//import nija.webshop.model.Item;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.support.rowset.SqlRowSet;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Repository
//public class ItemRepository {
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//    private SqlRowSet sqlRowSet;
//
//    public Item oneItem(int itemId){
//        Item item = new Item();
//        String sql = "SELECT * FROM items where item_id =" + itemId;
//        sqlRowSet = jdbcTemplate.queryForRowSet(sql);
//        System.out.println(sql);
//        System.out.println(sqlRowSet);
//
//
//        while (sqlRowSet.next()){
//            item = new Item(sqlRowSet.getInt("item_id"), sqlRowSet.getString("item_description"), sqlRowSet.getString("image_directory"), sqlRowSet.getInt("price"));
//        }
//        return item;
//    }
//
//    public List<Item> allItems(){
//        List<Item> items = null;
//        Item item;
//        String sql = "SELECT * FROM ITEM";
//        sqlRowSet : jdbcTemplate.queryForRowSet(sql);
//
//        while (sqlRowSet.next()){
//            item = new Item(sqlRowSet.getInt("item_id"), sqlRowSet.getString("item_description"), sqlRowSet.getString("image_directory"), sqlRowSet.getInt("price"));
//            items.add(item);
//        }
//        return items;
//    }
//}