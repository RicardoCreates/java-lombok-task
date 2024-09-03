package de.ricardo;

import lombok.Builder;
import lombok.With;

@Builder
public record Teacher(@With int id,@With String name,@With String subject) {
}
