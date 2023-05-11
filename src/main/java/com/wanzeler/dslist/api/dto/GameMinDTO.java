package com.wanzeler.dslist.api.dto;

import com.wanzeler.dslist.domain.model.Game;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GameMinDTO {
	
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO(Game entity) {
		entity.getId();
		entity.getTitle();
		entity.getYear();
		entity.getImgUrl();
		entity.getShortDescription();
	}
}
