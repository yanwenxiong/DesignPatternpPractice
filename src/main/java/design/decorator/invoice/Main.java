package design.decorator.invoice;

/**
 * @author yanwenxiong
 * @since 2020/3/2
 */
public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        System.out.println("---------------------");

        invoice.print();
        System.out.println("---------------------");

        HeaderDecorator complete = new HeaderDecorator(new FooterDecorator(invoice));
        complete.print();
        System.out.println("---------------------");

        HeaderDecorator headAndFoot = new HeaderDecorator(new FooterDecorator(null));
        headAndFoot.print();
        System.out.println("---------------------");
    }
}
