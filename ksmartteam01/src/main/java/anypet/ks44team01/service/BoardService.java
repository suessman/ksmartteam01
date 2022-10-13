package anypet.ks44team01.service;

import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import anypet.ks44team01.dto.AccommodationCategory;
import anypet.ks44team01.dto.Board;
import anypet.ks44team01.dto.BoardCategory;
import anypet.ks44team01.mapper.BoardMapper;

@Service
@Transactional
public class BoardService {

	// 의존성 주입
	private BoardMapper boardMapper;

	public BoardService(BoardMapper boardMapper) {
		this.boardMapper = boardMapper;
	}

	// 기능 구현은 메소드 단위로 이루어지기 때문에 하나라도 잘못되면 롤백하기 위해 서비스에 트랜잭션 어노테이션 작성
	// 게시물 목록 조회
	public List<Board> getBoardList() {
		List<Board> boardList = boardMapper.getBoardList();
		return boardList;
	}
	
	// 특정 게시판 카테고리 조회
	public BoardCategory getBoardCategoryInfo(String boardCategoryCode) {	
		BoardCategory boardCategory = boardMapper.getBoardCategoryInfo(boardCategoryCode);	
		return boardCategory;
	}
	
	// 게시판 카테고리 목록 조회
	public List<BoardCategory> getBoardCategoryList() {
		List<BoardCategory> boardCategoryList = boardMapper.getBoardCategoryList();
		return boardCategoryList;
	}
		
	// 게시판 카테고리 등록
	public void addBoardCategory(BoardCategory boardCategory) {		
		boardMapper.addBoardCategory(boardCategory);	
		System.out.println("게시판 카테고리 등록 : " + boardCategory);
	}
	
	// 게시판 카테고리 수정
	public void modifyBoardCategory(BoardCategory boardCategory) {				
		boardMapper.modifyBoardCategory(boardCategory);		
		System.out.println("게시판 카테고리 수정 : " + boardCategory);
	}
		
	// 게시판 카테고리 삭제
	public int deleteBoardCategory(String boardCategoryCode) {				
		int result = boardMapper.deleteBoardCategory(boardCategoryCode);
		return result;
	}
		
	// 게시물 상세
	public List<Board> getBoardDetail() {
		List<Board> boardDetail = boardMapper.getBoardDetail();
		return boardDetail;
	}

	@PostConstruct
	public void boardService() {
		System.out.println("boardService bean 생성");
	}

}
