package anypet.ksmartteam01.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import anypet.ksmartteam01.dto.AccommodationCategory;
import anypet.ksmartteam01.dto.AccommodationDetail;
import anypet.ksmartteam01.dto.AccommodationInquiry;
import anypet.ksmartteam01.dto.AccommodationPayment;
import anypet.ksmartteam01.dto.AccommodationPaymentCancel;
import anypet.ksmartteam01.dto.AccommodationReservationList;
import anypet.ksmartteam01.dto.Member;
import anypet.ksmartteam01.mapper.AccommodationMapper;

@Service
@Transactional
public class AccommodationService {

	// DI 생성자 메소드 주입방식
	private AccommodationMapper accommodationMapper;
	
	public AccommodationService(AccommodationMapper accommodationMapper) {
		this.accommodationMapper = accommodationMapper;
	}
	
	@PostConstruct
	public void accommodationService() {
		System.out.println("accommodationService bean 생성");
	}
	
	// 숙소 예약내역 삭제
	public void removeReservationList(AccommodationReservationList accommodationReservationCode) {
		
		accommodationMapper.removeReservationList(accommodationReservationCode);
		
		System.out.println("예약내역삭제: " + accommodationReservationCode);
	}
	
	// 숙소 결제취소
	public void adminPaymentCancel(AccommodationPaymentCancel accommodationPaymentCancel) {
		
		System.out.println("숙소 결제취소: " + accommodationPaymentCancel);
		accommodationMapper.adminPaymentCancel(accommodationPaymentCancel);
		
	}
	
	//숙소 결제취소 승인
	public void updatePaymentCancel(AccommodationPaymentCancel accommodationPaymentCancelCode) {
		
		accommodationMapper.updatePaymentCancel(accommodationPaymentCancelCode);
		
		System.out.println("결제취소코드: " + accommodationPaymentCancelCode);	
	}
	
	//숙소 정보 조회
	public AccommodationDetail getAccommodationDetailInfo(String goodsAccommodationOptionCode) {
		
		AccommodationDetail accommodationDetailInfo = accommodationMapper.getAccommodationDetailInfo(goodsAccommodationOptionCode);
		
		return accommodationDetailInfo;
	}
	
	//회원 정보 조회
	public Member getReservaionMemberInfo(String memberId) {
		
		Member memberInfo = accommodationMapper.getReservaionMemberInfo(memberId);
		
		return memberInfo;
	}
	
	//특정 결제내역 조회 
	public AccommodationPayment getAccommodationPayment(String accommodationReservationCode) {
	 
		AccommodationPayment accommodationPayment = accommodationMapper.getAccommodationPayment(accommodationReservationCode);
	 
		return accommodationPayment; 
	}
	
	
	//예약내역 목록
	public List<AccommodationReservationList> reservationList(){
		
		List<AccommodationReservationList> accommodationReservationList = accommodationMapper.reservationList();
		
		return accommodationReservationList;
	}
	
	//문의 답변 수정
	public void modifyInquiry(AccommodationInquiry accommodationInquiry) {
		
		accommodationMapper.modifyInquiry(accommodationInquiry);
		
		System.out.println("문의 답변 수정" + accommodationInquiry);
	}
	
	//문의목록 답변 조회
	public AccommodationInquiry inquiryAnswerSelect(String accommodationQnaNumber) {
		
		AccommodationInquiry inquiryAnswerSelect = accommodationMapper.inquiryAnswerSelect(accommodationQnaNumber);
		
		return inquiryAnswerSelect;
	}
	
	//문의 목록 삭제
	public int removeInquiry(String accommodationQnaNumber) {
		
		int result = accommodationMapper.removeInquiry(accommodationQnaNumber);
		
		return result;
	}
	
	//문의 목록
	public List<AccommodationInquiry> inquiryList(){
		
		List<AccommodationInquiry> accommodationInquiryList = accommodationMapper.inquiryList();
		
		return accommodationInquiryList;
		
	}
	
	//특정 카테고리 조회
	public AccommodationCategory getCategoryInfo(String accommodationCategoryCode) {
		
		AccommodationCategory accommodationCategory = accommodationMapper.getCategoryInfo(accommodationCategoryCode);
		
		return accommodationCategory;	
	}
	
	//카테고리 삭제
	public int removeCategory(String accommodationCategoryCode) {
		
		int result = accommodationMapper.removeCategory(accommodationCategoryCode);
		
		return result;
	}
	
	//카테고리 수정
	public void updateCategory(AccommodationCategory accommodationCategory) {
		
		accommodationMapper.updateCategory(accommodationCategory);
		
		System.out.println("카테고리 수정: " + accommodationCategory);
	}
	
	//카테고리 등록
	public void insertCategory(AccommodationCategory accommodationCategory){
		
		accommodationMapper.insertCategory(accommodationCategory);
		
		System.out.println("카테고리 등록: " + accommodationCategory);
	}
	
	//카테고리 목록
	public List<AccommodationCategory> categoryList(){
		
		List<AccommodationCategory> accommodationCategoryList = accommodationMapper.categoryList();
		
		return accommodationCategoryList;
	}
	
}
