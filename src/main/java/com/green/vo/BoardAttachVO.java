package com.green.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class BoardAttachVO {

	private String uuid;
	private String uploadPath;
	private String fileName;

	private Long bno; // 게시글의 번호(bno)에 첨부파일의 bno가 외래키로 연결되어 있음
}
