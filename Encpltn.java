class Encpltn {
    String setName;

    public static void main(String args[]) {
        Encpltn encp = new Encpltn();
        encp.setName("Shiro");
        System.out.println(encp.getName());
    }

    // Getter method for setName
    public String getName() {
        return setName;
    }

    // Setter method for setName
    public void setName(String newName) {
        setName = newName;
    }
}
/*
O/P:
Shiro
*/