package vn.edu.iuh.fit.wwwlabweek07.frontend;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.edu.iuh.fit.wwwlabweek07.backend.models.Product;
import vn.edu.iuh.fit.wwwlabweek07.backend.services.ProductServices;

@Controller
public class ProductController {
  @Autowired
  private ProductServices productServices;

//  @GetMapping("/products")
//  public String getAllProducts(Model model,@RequestParam("page") Optional<Integer> page, @RequestParam("size") Optional<Integer> size){
//    int currentPage = page.orElse(1);
//    int pageSize = size.orElse(10);
//    Page<Product> productPage = productServices.findAll(currentPage, pageSize,"product_id","asc");
//    model.addAttribute("products",productPage.getContent());
//    return "/admin/product/listProduct";
//  }



}
