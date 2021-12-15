package smb.cmn.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.naming.java.javaURLContextFactory;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.boot.autoconfigure.h2.H2ConsoleAutoConfiguration;

import lombok.Data;

@Entity
@Table(name = "sys_user")
@Data
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USE_ID")
	private Long id;
	
	@Column(name = "USE_START_DATE", insertable = true, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date startDate;

	@Column(name = "usr_nm", length = 100)
	private String userName;

	@Column(name = "pwd", nullable = true, length = 100)
	private String password;

	@Column(name = "BRN_CD", length = 100)
	private String branchId;

	@Column(name = "USE_MAKER_DATE", length = 100)
	private String userMakerDate;

	@Column(name = "STATUS", length = 10)
	private Integer status;

	@Column(name = "FULL_NAME", length = 100)
	private String fullName;

	@Column(name = "ac_xpr")
	private boolean isAccountNonExpired;

	@Column(name = "ac_locked")
	private boolean isAccountNonLocked;

	@Column(name = "IS_ENABLE")
	private boolean isEnable;
	
	@Column(name = "isCredentialsNonExpired")
	private boolean isCredentialsNonExpired;

}
