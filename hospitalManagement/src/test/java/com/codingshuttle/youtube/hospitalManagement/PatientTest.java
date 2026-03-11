package com.codingshuttle.youtube.hospitalManagement;

import com.codingshuttle.youtube.hospitalManagement.entity.Patient;
import com.codingshuttle.youtube.hospitalManagement.repository.PatientRepository;
import com.codingshuttle.youtube.hospitalManagement.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

@SpringBootTest
public class PatientTest {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatientService patientService;

    @Test
    public void testPatientRepository() {
        List<Patient> patientList = patientRepository.findAll();
        System.out.println(patientList);

        Patient p1 = new Patient();
        //patientRepository.save(p1);

    }

    @Test
    public void testTransactionsMethod() {
        //       Patient patient = patientService.getPatientById(1L);


//            Patient patient;
//        patient = patientRepository.findByName("Neha Sharma");
        //List <Patient> patient = patientRepository.findByBirthDateOrEmail(LocalDate.of(1973,06,05),"pooja.malhotra@gmail.com");


//        List<Patient> patientList =  patientRepository.findByBirthDateBetween(LocalDate.of(1979, 06, 05) ,LocalDate.of(1991,, 18));
//        System.out.println(patientList);

//        List<Patient> patientList = patientRepository.findByNameContainingOrderByIdDesc("Su");
//
//        for(Patient patient: patientList) {
//            System.out.println(patient);
//        }

//        List<Patient> patientList = patientRepository.findByBloodGroup(BloodGroupType.O_NEGATIVE);

//        List<Patient> patientList = patientRepository.findByBornAfterDate(LocalDate.of(2001,06,22));
//        for(Patient patient: patientList) {
//            System.out.println(patient);
//        }

//        List<Object[]> bloodGroupList = patientRepository.countEachBloodGroupType();
//        for(Object[] objects : bloodGroupList){
//            System.out.println(objects[0] + " : " + objects[1]);
//        }

//        int rowsUpdated = patientRepository.updateNameWithId("Rihan Qureshi", 154L);
//        System.out.println(rowsUpdated);

//        List<Patient> patientList = patientRepository.findAllPatient();
//        for(Patient patient : patientList){
//            System.out.println(patient);
//      }

//        List<BloodGroupCountResponseEntity> bloodGroupList = patientRepository.countEachBloodGroupType();
//        for(BloodGroupCountResponseEntity bloodGroupCountResponse: bloodGroupList){
//            System.out.println(bloodGroupCountResponse);
//        }

        Page<Patient> patientList = patientRepository.findAllPatient(PageRequest.of(0,2));
        for(Patient patient : patientList){
            System.out.println(patient);
        }


    }
}

