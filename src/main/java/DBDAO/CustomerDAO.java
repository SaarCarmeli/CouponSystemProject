package DBDAO;

import Beans.Coupon;
import Beans.Customer;
import Exceptions.EntityCrudException;
import java.util.List;

public interface CustomerDAO {
    Integer createCustomer(final Customer customer) throws EntityCrudException;
    Customer readCustomer(final Integer customerId) throws EntityCrudException;
    List<Customer> readAllCustomers() throws EntityCrudException;
    void updateCustomer(final Customer customer) throws EntityCrudException;
    void deleteCustomer(final Integer customerId) throws EntityCrudException;
    List<Coupon> readCouponsByCustomerId(final Integer customerId) throws EntityCrudException;
    boolean isCustomerExist(final String email) throws EntityCrudException;
}