package chap03.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import chap04.spring.ChangePasswordService;
import chap03.spring.MemberDao;
import chap03.spring.MemberInfoPrinter;
import chap03.spring.MemberListPrinter;
import chap03.spring.MemberPrinter;
import chap03.spring.MemberRegisterService;
import chap03.spring.VersionPrinter;

@Configuration
public class AppCtx {
		@Bean
		public MemberDao memberDao() {
			return new MemberDao();
		}
		
		@Bean
		public MemberRegisterService memberRegSvc() {
			return new MemberRegisterService(memberDao());
		}
		
		@Bean
		public ChangePasswordService changePwdSvc() {
			ChangePasswordService pwdSvc = new ChangePasswordService();
			pwdSvc.setMemberDao(memberDao());
			return pwdSvc;
		}
		
		@Bean
		public MemberPrinter memberPrinter() {
			return new MemberPrinter();
		}
		
		@Bean
		public MemberListPrinter listPrinter() {
			return new MemberListPrinter(memberDao(), memberPrinter());
		}
		
		@Bean
		public MemberInfoPrinter infoPrinter() {
			MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
			infoPrinter.setMemberDao(memberDao());
			infoPrinter.setPrinter(memberPrinter());
			return infoPrinter;
		}
		
		@Bean
		public VersionPrinter versionPrinter() {
			VersionPrinter versionPrinter = new VersionPrinter();
			versionPrinter.setMajorVersion(5);
			versionPrinter.setMinorVersion(0);
			return versionPrinter;
		}
}
