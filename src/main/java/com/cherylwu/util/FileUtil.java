package com.cherylwu.util;

import com.google.common.base.Joiner;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Objects;

public class FileUtil {

    /**
     * @param source 源文件地址
     * @param target 目标文件地址
     * @return 两个文件是否内容一致
     */
    public static boolean compareFiles(String source, String target) {
        // TODO
        // 0. filter some specific format

        // 1. get source file content
        String sourceContent = getFileContent(source);
        // 2. get target file content
        String targetContent = getFileContent(target);


        return Objects.equals(sourceContent, targetContent);
    }

    /**
     * @param path file path
     * @return file content
     */
    private static String getFileContent(String path) {

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

            String content = "";
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                content += StringUtils.trimToEmpty(line);
            }
            bufferedReader.close();
            System.out.println(content);
            return content;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
