package ai.boot.bootai.controller;

import ai.boot.bootai.service.OpenaiService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class OpenaiController {

    private final OpenaiService openaiService;

    @GetMapping("/openai/{text}")
    public String openai(@PathVariable String text) {
        return openaiService.call(text);
    }


}
