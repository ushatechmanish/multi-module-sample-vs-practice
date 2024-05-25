package in.ushatech.api.core.recommendation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface RecommendationService {

    @GetMapping(value = "/review/{productId}", produces = "application/json")
    public Recommendation getRecommendation(@PathVariable int productId);

}
