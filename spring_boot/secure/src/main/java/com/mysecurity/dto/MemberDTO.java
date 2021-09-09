package com.mysecurity.dto;

import java.util.List;

import lombok.Data;

@Data
public class MemberDTO {

		private String userid;
		private String userpw;
		private String username;
		private boolean enabled;
		private String usepw;
		private String regDate;
		private String updateDate;
		private List<AuthDTO> authList;
}
