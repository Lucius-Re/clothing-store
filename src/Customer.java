public class Customer {
    private int customerId;
    private String name;
    private String preferredSize;
    private int loyaltyPoints;

    // Parameterized constructor
    public Customer(int customerId, String name, String preferredSize, int loyaltyPoints) {
        this.customerId = customerId;
        this.name = name;
        this.preferredSize = preferredSize;
        this.loyaltyPoints = loyaltyPoints;
    }

    // Default constructor
    public Customer() {
        this.customerId = 0;
        this.name = "Guest";
        this.preferredSize = "M";
        this.loyaltyPoints = 0;
    }

    // Getters
    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getPreferredSize() {
        return preferredSize;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    // Setters
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPreferredSize(String preferredSize) {
        this.preferredSize = preferredSize;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    // Additional methods
    public void addPoints(int points) {
        loyaltyPoints += points;
    }

    public boolean isVIP() {
        return loyaltyPoints >= 100;
    }

    // toString
    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", preferredSize='" + preferredSize + '\'' +
                ", loyaltyPoints=" + loyaltyPoints +
                '}';
    }
}
