/* 
Глибоке клонування картки
*/

public class Solution implements Cloneable {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Solution clone = null;
        try {
            clone = (Solution) solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }


    }



    protected Map<String, User> users = new LinkedHashMap();

    public static class User implements Cloneable {
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o.getClass()==this.getClass()||o==null)) return false;

            User u = (User) o;

            if(u.age!=age) return false;
            if (!Objects.equals(u.name,name)) return false;

            return true;
        }

        @Override
        public int hashCode() {

            int res = 31*this.age;
            return res;
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Solution cl = (Solution) super.clone();   // создаем клон

        cl.users = new HashMap<>();      // создаем мапу и заполняем ее клонами USERS

        for (Map.Entry<String, User> entry : this.users.entrySet()) {
            cl.users.put(entry.getKey(), (User) entry.getValue().clone());
        }

        return cl;
    }

}