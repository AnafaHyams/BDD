package java_basic_course.day_21_04_2021.task1;

public class PolicyServiceProblem {

    public static void main(String[] args) {
        PolicyService policyService = new PolicyService.Builder()
                .withAge(30)
                .withExperience(1)
                .withNumOfAccidence(0)
                .withX(3)
                .build();

        System.out.println(policyService);

        PolicyService anotherPolicy = new PolicyService.Builder()
                .withAge(53)
                .withExperience(33)
                .withNumOfAccidence(2)
                .withX(8)
                .build();

        System.out.println(anotherPolicy);
    }

}
