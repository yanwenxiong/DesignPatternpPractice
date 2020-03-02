package design.decorator.invoice;

/**
 * @author yanwenxiong
 * @since 2020/3/2
 */
public class AbstractDecorator extends Invoice {
    private Invoice invoice;

    public AbstractDecorator(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public void print() {
        if (invoice == null) {
            return;
        }
        invoice.print();
    }
}
