package broadcast;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Advertisement {


    private int duration;
    private String productName;
    private int priceForMinute;


}
