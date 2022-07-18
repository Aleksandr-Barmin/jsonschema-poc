package dev.abarmin.poc.jsonschema;

import dev.abarmin.poc.jsonschema.model.schema.Applicant;

public class TestApplication {
    public static void main(String[] args) {
        final Applicant applicant = new Applicant();
        applicant.setApplicantId("test");

        System.out.println(applicant);
    }
}
