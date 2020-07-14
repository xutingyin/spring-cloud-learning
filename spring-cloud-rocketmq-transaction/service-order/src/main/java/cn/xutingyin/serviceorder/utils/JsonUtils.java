package cn.xutingyin.serviceorder.utils;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @description: json工具类
 * @author: xuty
 * @date: 2020/7/14 14:32
 */

public class JsonUtils {

    private static final ObjectMapper objectMappper = new ObjectMapper();

    /**
     * json字符串转JsonNode对象的方法
     */
    public static JsonNode str2JsonNode(String str) {
        try {
            return objectMappper.readTree(str);
        } catch (IOException e) {
            return null;
        }
    }
}