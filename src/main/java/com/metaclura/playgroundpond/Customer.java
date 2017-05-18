package com.metaclura.playgroundpond;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@Accessors(chain=true)
public class Customer {

    private String firstName;
    private String lastName;

}
