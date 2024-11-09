package hkt.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import hkt.models.TestimonyForm;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestimonyJson implements Datasource<List<TestimonyForm>>{
    private String directoryName;
    private String fileName;

    public TestimonyJson(String directoryName, String fileName) {
        this.directoryName = directoryName;
        this.fileName = fileName;
        checkFileIsExisted();
    }

    private void checkFileIsExisted() {
        File file = new File(directoryName);
        if (!file.exists()) {
            file.mkdirs();
        }
        String filePath = directoryName + File.separator + fileName;
        file = new File(filePath);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public List<TestimonyForm> read() {

        try {
            String jsonString = new String(Files.readAllBytes(Paths.get(directoryName + File.separator + fileName)));
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.registerModule(new JavaTimeModule());

            // 1. Deserialize into a Map<String, Object>
            TypeReference<HashMap<String, Object>> typeRef = new TypeReference<>() {};
            HashMap<String, Object> dataMap = objectMapper.readValue(jsonString, typeRef);

            // 2. Extract the "requests" object and convert it to a Map<String, Request>
            HashMap<String, TestimonyForm> testimonyList = objectMapper.convertValue(dataMap.get("testimonyList"), new TypeReference<>() {});

            // 3. Create a RequestList and populate it
            List<TestimonyForm> requestList = new ArrayList<>();

            for (TestimonyForm testimonyForm : testimonyList.values()) {
                requestList.add(testimonyForm);
            }
            return requestList;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void write(List<TestimonyForm> data) {
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            String result = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(data);  // Serialize the HashMap
            Files.write(Paths.get(directoryName + File.separator + fileName), result.getBytes(), StandardOpenOption.CREATE);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
