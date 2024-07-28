package com.example.webbanhang;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // Chỉ định HomeController là Controller
public class HomeController {
    // Khi user truy cập vào endpoint / thì homepage() được gọi
    @GetMapping("/")
    public String homepage(Model model) {
        model.addAttribute("message","TRANG CHỦ");
        return "index";  // Trả về trang index.html
    }
    // Có thể mapping thêm các endpoint khác nữa...

    @GetMapping("/about")
    public String showAboutPage() {
        return "/about";
    }

}

