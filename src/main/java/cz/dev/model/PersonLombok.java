package cz.dev.model;

import lombok.RequiredArgsConstructor;
import lombok.Value;

@Value
@RequiredArgsConstructor
public class PersonLombok {

    int age;
    String message;
}
