public class Worker {
    int id;
    int salary;
    String firstname;
    String lastname;

    @Override
    public String toString() {
        String result = String.format("id:%d, sl:%d, fn:%s, ln:%s", id, salary, firstname, lastname);
        return result;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        Worker t = (Worker) o;
        return id == t.id && firstname == t.firstname;
    }
}
