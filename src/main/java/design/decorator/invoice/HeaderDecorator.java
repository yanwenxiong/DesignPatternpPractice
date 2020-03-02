package design.decorator.invoice;

/**
 * @author yanwenxiong
 * @since 2020/3/2
 */
public class HeaderDecorator extends AbstractDecorator {
    public HeaderDecorator(Invoice invoice) {
        super(invoice);
    }

    @Override
    public void print() {
        System.out.println("print the header of the invoice");
        super.print();
    }
}
