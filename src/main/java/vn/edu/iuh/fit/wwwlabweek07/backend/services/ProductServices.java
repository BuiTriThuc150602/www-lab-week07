package vn.edu.iuh.fit.wwwlabweek07.backend.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.wwwlabweek07.backend.models.Product;
import vn.edu.iuh.fit.wwwlabweek07.backend.repositories.ProductRepository;

@Service
public class ProductServices {
  @Autowired
  private ProductRepository productRepository;

//  public Page<Product> findAll(int page, int size, String  sortBy, String sortDirection){
//    Sort sort = Sort.by(Sort.Direction.fromString(sortDirection),sortBy);
//    Pageable pageable = PageRequest.of(page,size,sort);
//    return productRepository.findAll();
//  }

  public List<Product> findAll(){
    return productRepository.findAll();
  }

}
