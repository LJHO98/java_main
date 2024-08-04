package service;

import dto.MangerDTO;

public interface ManagerActive {
	public void action(int menu, String code, String member, MangerDTO manger);
}
