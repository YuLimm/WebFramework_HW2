package kr.ac.hansung.model;

import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class MyClass {
	//지금까지 수강한 과목
	private String year;//년도
	private String semester;//학기
	private String code;//과목 코드
	private String classname;//과목 명
	private String divide;//구분
	private int credit;//학점

}
