package hello.product_manage;

import hello.product_manage.domain.Item;
import hello.product_manage.domain.ItemRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestDataInit {
    private final ItemRepository itemRepository;

    @PostConstruct
    public void init() {
        itemRepository.save(new Item("아이폰 16 Pro", 1400000, 100));
        itemRepository.save(new Item("갤럭시 S25 Ultra", 1250000, 100));
    }
}
