package dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CampingDto {
	public CampingDto(int id, boolean isReserve, String date, String tel, String name) {
		this.spotId = id;
		this.isSpotReserve = isReserve;
		this.rvDate = date;
		this.rpTel = tel;
		this.rpName = name;
	}
	private int spotId;
	private boolean isSpotReserve;
	private String rvDate;
	private String rpTel;
	private String rpName;
}
