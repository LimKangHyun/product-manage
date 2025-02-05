package hello.product_manage;

import hello.product_manage.domain.item.Item;
import hello.product_manage.domain.item.ItemRepository;
import hello.product_manage.domain.member.Member;
import hello.product_manage.domain.member.MemberRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestDataInit {
    private final ItemRepository itemRepository;
    private final MemberRepository memberRepository;

    @PostConstruct
    public void init() {
        itemRepository.save(new Item("아이폰 16 Pro", 1400000, 100));
        itemRepository.save(new Item("갤럭시 S25 Ultra", 1250000, 100));

        Member member = new Member();
        member.setLoginId("test");
        member.setPassword("test!");
        member.setName("테스트용");
        memberRepository.save(member);
    }
}
