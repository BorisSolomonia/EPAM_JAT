public class Customer {
    String name;
    Integer id;

    public Customer(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }
    private final String nameProfile = this.name;

    private class CustomerProfileWeb{
        Integer hashForName;
        private void custNameToHash(){
            hashForName = nameProfile.hashCode();
        }
    }


}
