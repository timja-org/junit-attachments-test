package com.github;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void attachment() throws IOException {
        Path file = Paths.get("hello.txt");
        List<String> linesInMemory = Collections.singletonList("HEY HEY");
        Files.write(file, linesInMemory, StandardCharsets.UTF_8);

        throw new NullPointerException("test error");
    }

    @Test
    public void attachment2() throws IOException {
        Path file = Paths.get("hello.txt");
        List<String> linesInMemory = Collections.singletonList("HEY HEY");
        Files.write(file, linesInMemory, StandardCharsets.UTF_8);

        System.out.println("[[ATTACHMENT|" + file.toAbsolutePath()  + "]]");

        assertThat(true, is(false));
    }

    @Test
    public void attachment3() throws IOException {
        Path file = Paths.get("hello.txt");
        List<String> linesInMemory = Collections.singletonList("HEY HEY");
        Files.write(file, linesInMemory, StandardCharsets.UTF_8);

        System.out.println("[[ATTACHMENT|" + file.toAbsolutePath()  + "]]");

        assertThat(true, is(true));
    }

    @Test
    public void attachment4() throws IOException {
        Path file = Paths.get("hello.txt");
        List<String> linesInMemory = Collections.singletonList("HEY HEY");
        Files.write(file, linesInMemory, StandardCharsets.UTF_8);

        System.out.println("[[ATTACHMENT|" + file.toAbsolutePath()  + "]]");

        assertThat(true, is(true));
    }

    @Test
    public void attachment5() throws IOException {
        Path file = Paths.get("hello.txt");
        List<String> linesInMemory = Collections.singletonList("HEY HEY");
        Files.write(file, linesInMemory, StandardCharsets.UTF_8);

        System.out.println("[[ATTACHMENT|" + file.toAbsolutePath()  + "]]");

        assertThat(true, is(true));
    }

    @Test
    public void attachment6() throws IOException {
        Path file = Paths.get("hello.txt");
        List<String> linesInMemory = Collections.singletonList("HEY HEY");
        Files.write(file, linesInMemory, StandardCharsets.UTF_8);

        System.out.println("[[ATTACHMENT|" + file.toAbsolutePath()  + "]]");

        assertThat(true, is(true));
    }
}
