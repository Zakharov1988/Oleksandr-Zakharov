package files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.stream.Collectors;

public class filesEx {
    public static void main(String[] args) throws IOException {
       /* File file = new File("dir/file.txt");

        Files.readAllLines(file.toPath());

        List<String> lines = new ArrayList<>();
        Files.write(file.toPath(),lines, StandardOpenOption.APPEND, StandardOpenOption.DELETE_ON_CLOSE);

        */
//        file.deleteOnExit();
//
//        Reader reader = new FileReader(file);
//        BufferedReader bufferedReader = new BufferedReader(reader);
//        bufferedReader.readLine();
//
//        Writer writer = new FileWriter(file);
//        writer.write('f');
//
//        BufferedWriter bufferedWriter = new BufferedWriter(writer);
//        bufferedWriter.write("");

        File usersFile = new File("files/users.csv");
        List<String> lines = Files.readAllLines(usersFile.toPath());

        List<String> headers = Arrays.stream(lines.get(0).split(",")).toList();
        List<Map<String, String>> users = new ArrayList<>();
        for (int i=1; i<lines.size(); i++){
            Map<String, String> user = new HashMap<>();
            List<String> line = Arrays.stream(lines.get(i).split(",")).toList();

            for (int j=0; j<line.size(); j++) {
                user.put(headers.get(j), line.get(j));
            }
            users.add(user);
            }
        System.out.println(users);

        }
    }
