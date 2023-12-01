package vn.edu.iuh.fit.wwwlabweek07.frontend;

import jakarta.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.edu.iuh.fit.wwwlabweek07.backend.models.Customer;
import vn.edu.iuh.fit.wwwlabweek07.backend.models.Product;
import vn.edu.iuh.fit.wwwlabweek07.backend.services.CustomerServices;
import vn.edu.iuh.fit.wwwlabweek07.backend.services.ProductServices;

@Controller
public class CustomerController {

  @Autowired
  private CustomerServices customerServices;
  @Autowired
  private ProductServices productServices;

  @GetMapping("/login")
  public String checkLogin( Model model, @RequestParam("email") String email, @RequestParam("password") String  password, HttpSession session){
    boolean isLogin = customerServices.checkCustomer(email, password);

    model.addAttribute("checkLogin", isLogin);
    if (isLogin) {
      Optional<Customer> customerLogin = customerServices.findUserByLogin(email, password);
      customerLogin.ifPresent(customer -> {
        session.setAttribute("customerLogin", customer);
      });
    }
    return isLogin ? "redirect:/dashboard" : "index";
  }

  @GetMapping("/dashboard")
  public String getPost(Model model, HttpSession session,@RequestParam("page") Optional<Integer> page, @RequestParam("size") Optional<Integer> size) {
    Customer customer = (Customer) session.getAttribute("customerLogin");
    if (customer == null) {
      return "index";
    }
    model.addAttribute("customerLogin", customer);
    int currentPage = page.orElse(1);
    int pageSize = size.orElse(10);
    List<Product> productPage = productServices.findAll();
//    Page<Product> productPage = productServices.findAll(currentPage, pageSize,"product_id","asc");
    model.addAttribute("products",productPage);
    return "dashboard";
  }
}
