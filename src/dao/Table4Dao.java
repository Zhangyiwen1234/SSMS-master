package dao;

import model.PageBean;

import java.util.Date;
import java.util.List;

public interface Table4Dao {
    List FindOne(String duty);

    int Find(String name, String duty);

}
