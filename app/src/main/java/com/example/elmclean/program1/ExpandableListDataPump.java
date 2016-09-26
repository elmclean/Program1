package com.example.elmclean.program1;

/**
 * Created by elmclean on 9/26/2016.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> emphasize = new ArrayList<String>();
        emphasize.add("The knowledge of the core principles of computer science");
        emphasize.add("The skills necessary to use computers to solve real-world problems");
        emphasize.add("Experience in implementing solutions with modern computing tools");
        emphasize.add("The communication skills necessary to work effectively in a team");
        emphasize.add("Foster a high level of faculty/student interaction and mentoring");

        List<String> expectations = new ArrayList<String>();
        expectations.add("Solve problems by using skills in math, computer science, and technology");
        expectations.add("Design, implement, document and maintain computer systems");
        expectations.add("Communicate effectively both orally and in writing");
        expectations.add("Understand professional, ethical, legal, security and social issues and responsibilities");
        expectations.add("Apply their knowledge and skills as they start their professional careers");
        expectations.add("Work well both independently and collaboratively with diverse groups");
        expectations.add("Generate new and creative ideas");

        List<String> completion = new ArrayList<String>();
        completion.add("Graduates shall demonstrate a thorough grounding in the fundamental principles and practices of computing and information systems, and those principles that underpin them");
        completion.add("Graduates shall demonstrate an understanding of the contexts in which computing is applied");
        completion.add("Graduates shall find employment in the computing profession and/or continue advanced studies in computer science or information systems");

        expandableListDetail.put("Department Emphasis", emphasize);
        expandableListDetail.put("Degree Expectations", expectations);
        expandableListDetail.put("Degree Completion", completion);
        return expandableListDetail;
    }
}
