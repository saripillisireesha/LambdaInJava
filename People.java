package collections;

public class People {

        String name;
        int age;
        String gender;
        int mobile;
   public People(String name, int age, String gender, int mobile){
            this.name=name;
            this.age=age;
            this.gender=gender;
            this.mobile=mobile;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String getGender() {
            return gender;
        }
        public void setGender(String gender) {
            this.gender = gender;
        }
        public int getMobile() {
            return mobile;
        }
        public void setMobile(int mobile) {
            this.mobile = mobile;
        }
        @Override
        public String toString() {
            return "People{name='" + name + "', age=" + age + ", gender='" + gender + "', mobile=" + mobile + "}";
        }
}

