package com.scienta.cs.postagelabel.reposioty;

import com.scienta.cs.postagelabel.model.entity.PostageLabel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostageLabelRespository extends JpaRepository<PostageLabel, String> {
}
