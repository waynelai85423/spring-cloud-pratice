package utils;

import com.google.common.collect.Maps;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.Map;

import static lombok.AccessLevel.PRIVATE;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor(access = PRIVATE)
public class ExtensionFields implements Serializable {

    /**
     * 特殊欄位，使用時需先與各方約定
     */
    @Singular
    protected Map<String, String> extras = Maps.newHashMap();
}
