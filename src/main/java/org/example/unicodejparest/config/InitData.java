package org.example.unicodejparest.config;

import jakarta.annotation.PostConstruct;
import org.example.unicodejparest.model.Unicode;
import org.example.unicodejparest.repository.UnicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.HashSet;
import java.util.Set;

@Configuration
public class InitData {

    @Autowired
            private UnicodeRepository unicodeRepository;

    Set<Character> charSet = new HashSet<Character>();

    @PostConstruct
    public void init() {
        int codePoint = Character.MIN_CODE_POINT;
        while(codePoint <= Character.MAX_CODE_POINT) {
            char ch = (char)codePoint;
            charSet.add(ch);
            Unicode unicode = new Unicode();
            unicode.setUnicode(codePoint);
            unicode.setBogstav(ch);
            unicodeRepository.save(unicode);

            codePoint++;
        }
    }

}
