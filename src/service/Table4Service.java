package service;

import model.PageBean;
import model.Score;

import java.util.List;

public interface Table4Service {
    List FindOne(String duty);

    int Find(String name, String duty);
}
