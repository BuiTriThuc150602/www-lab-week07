package vn.edu.iuh.fit.wwwlabweek07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.wwwlabweek07.backend.models.ProductImage;
import vn.edu.iuh.fit.wwwlabweek07.backend.models.ProductPrice;
import vn.edu.iuh.fit.wwwlabweek07.backend.repositories.ProductImageRepository;
import vn.edu.iuh.fit.wwwlabweek07.backend.repositories.ProductPriceRepository;
import vn.edu.iuh.fit.wwwlabweek07.backend.repositories.ProductRepository;

@SpringBootApplication
public class WwwLabWeek07Application {

  public static void main(String[] args) {
    SpringApplication.run(WwwLabWeek07Application.class, args);
  }
  @Autowired
  private ProductRepository productRepository;
  @Autowired
  private ProductImageRepository productImageRepository;
  @Autowired
  private ProductPriceRepository productPriceRepository;

  CommandLineRunner initData(){
    return args -> {


    };

  }

}
