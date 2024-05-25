package in.ushatech.api.core.review;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ReviewService {
    @GetMapping(value = "/review/{productId}", produces = "application/json")
    public Review getReview(@PathVariable int productId);
}
