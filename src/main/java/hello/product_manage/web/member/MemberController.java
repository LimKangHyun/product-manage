package hello.product_manage.web.member;

import hello.product_manage.domain.member.Member;
import hello.product_manage.domain.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {

    private final MemberRepository memberRepository;

    @GetMapping("/add")
    public String addForm(@ModelAttribute("member") Member member) {
        return "/members/addMemberForm";
    }

    @PostMapping("/add")
    public String save(@ModelAttribute("member") Member member) {
        memberRepository.save(member);
        return "redirect:/";
    }
}
