package test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent=true)
@AllArgsConstructor
@ToString(exclude = {
        "secondAttribute"
})
public class MyLombokPojo {
    private String firstAttribute;
    private int secondAttribute;
}

