package design.decorator.invoice;

/**
 * @author yanwenxiong
 * @since 2020/3/2
 */
public class FooterDecorator extends AbstractDecorator {
    @Override
    public void print() {
        super.print();
        System.out.println("print the footer of the invoice");
    }

    public FooterDecorator(Invoice invoice) {
        super(invoice);
    }
}
