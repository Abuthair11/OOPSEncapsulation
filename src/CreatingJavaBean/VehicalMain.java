package CreatingJavaBean;

/**
 * @author abuthair on 03/10/23.
 * 2:09 pm
 * @project OOPS Encapsulation
 */
public class VehicalMain {

    public static void main(String[] args) {
        vehical vehical1 = new vehical();
        vehical1.setName("BMW");
        vehical1.setModel("X21");
        vehical1.setPrice(2111);
        vehical1.setMillage(34D);

        String ref = vehical1.getName();
        System.out.println(ref);
        System.out.println(vehical1.getModel());
        System.out.println(vehical1.getPrice());
        System.out.println(vehical1.getMillage());
    }
}
