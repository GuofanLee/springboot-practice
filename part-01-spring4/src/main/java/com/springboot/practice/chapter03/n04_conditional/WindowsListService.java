package com.springboot.practice.chapter03.n04_conditional;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2019-10-15 16:29
 */
public class WindowsListService implements ListService {

    @Override
    public String showListCmd() {
        return "dir";
    }

}
