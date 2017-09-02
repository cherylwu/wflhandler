package com.cherylwu.util;

import org.junit.Assert;

import static org.junit.Assert.*;

public class FileUtilTest {
    @org.junit.Test
    public void compareFiles() throws Exception {
        String source = System.getProperty("user.home") + "/Downloads/source.txt";
        String target = System.getProperty("user.home") + "/Downloads/target.txt";

        Assert.assertTrue(FileUtil.compareFiles(source, target));
    }

}