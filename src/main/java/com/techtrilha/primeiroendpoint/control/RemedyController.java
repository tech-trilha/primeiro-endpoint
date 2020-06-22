package com.techtrilha.primeiroendpoint.control;

import com.techtrilha.primeiroendpoint.model.Remedy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RemedyController {

  @GetMapping("/remedies")
  public Remedy generateRemedy() {
    final var remedy = new Remedy();
    remedy.setId(1L);
    remedy.setName("Xarope");
    return remedy;
  }

}
