package java_basic_course.day_21_04_2021.task1;

import lombok.Data;

@Data
public class PolicyService {

    private int driverAge;
    private int numberOfAccidence;
    private int driverExperience;
    private int x;

    private PolicyService() {

    }


    public static class Builder {

        private int driverAge;
        private int numberOfAccidence;
        private int driverExperience;
        private int x;

        public Builder withAge(int age) {
            this.driverAge = age;

            return this;
        }

        public Builder withNumOfAccidence(int numOfAcc) {
            this.numberOfAccidence = numOfAcc;

            return this;
        }

        public Builder withExperience(int experience) {
            this.driverExperience = experience;

            return this;
        }

        public Builder withX(int x) {
            this.x = x;

            return this;
        }
        public PolicyService build() {
            PolicyService policy = new PolicyService();
            policy.driverAge = this.driverAge;
            policy.numberOfAccidence = this.numberOfAccidence;
            policy.driverExperience = this.driverExperience;
            policy.x = this.x;

            return policy;
        }


    }

}
