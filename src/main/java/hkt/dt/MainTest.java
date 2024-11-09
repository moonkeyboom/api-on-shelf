package hkt.dt;

import com.itextpdf.commons.utils.JsonUtil;
import hkt.models.TestimonyForm;
import hkt.services.TestimonyJson;

import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        List<TestimonyForm> testimonyForms;

        TestimonyJson testimonyJson = new TestimonyJson("data","testimonyList.json");
        System.out.println(testimonyJson.read().get(0).getAiSummary());
    }
}
