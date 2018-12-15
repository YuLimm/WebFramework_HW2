package kr.ac.hansung.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class NewClass {
	//2019년도 1학기에 신청할 예상 교과목
	private int id;

	@Size(min = 2, max = 20, message = "최소 2글자부터 최대 20글자까지 입력바랍니다")
	@NotEmpty(message="교과목 명을 입력하지 않았습니다")
	private String classname;// 최소2글자, 최대 20글자 가능, 에러출력


}
