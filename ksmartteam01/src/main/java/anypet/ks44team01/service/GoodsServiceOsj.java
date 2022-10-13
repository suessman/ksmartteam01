package anypet.ks44team01.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import anypet.ks44team01.dto.GoodsLargeCategory;
import anypet.ks44team01.dto.GoodsMediumCategory;
import anypet.ks44team01.dto.GoodsOrder;
import anypet.ks44team01.dto.GoodsOrderDetail;
import anypet.ks44team01.dto.Member;
import anypet.ks44team01.mapper.GoodsMapperOsj;

@Service
@Transactional
public class GoodsServiceOsj {
	
	private final GoodsMapperOsj goodsMapper;
	
	public GoodsServiceOsj(GoodsMapperOsj goodsMapper) {
		this.goodsMapper = goodsMapper;

	}
	
	@PostConstruct
	public void goodsServicInit() {
		System.out.println("goodsService bean 생성");
	}
	//사용자

	//상품 결제/주문정보 입력
		public void goodsPaymentInfoInsert(GoodsOrder goodsOrder){
			
			int result = goodsMapper.goodsPaymentInfoInsert(goodsOrder);
			
			System.out.println("상품 결제/주문정보 조회: " + result);
		}
	// 상품 결제페이지에 주문상세 조회
		public List<GoodsOrderDetail> getGoodsOrderDetailList(){
			
			List<GoodsOrderDetail> goodsOrderDetailList = goodsMapper.getGoodsOrderDetailList();
			
			return goodsOrderDetailList;
		}	
	// 상품 결제페이지 배송지 조회를 위한 특정회원 정보 조회
		public Member getMemberInfoById(String memberId) {
				
			Member member = goodsMapper.getMemberInfoById(memberId);
					
			return member;
		}
		
	// 배송지 업데이트
	
		
	//관리자
	//상품대분류목록조회
	public List<GoodsLargeCategory> getGoodsLargeCategoryList(){
		
		List<GoodsLargeCategory> goodsLargeCategoryList = goodsMapper.getGoodsLargeCategoryList();
		
		return goodsLargeCategoryList;
	}
	
	//상품중분류목록조회
	public List<GoodsMediumCategory> getGoodsMediumCategoryList(){
		
		List<GoodsMediumCategory> goodsMediumCategoryList = goodsMapper.getGoodsMediumCategoryList();
		
		return goodsMediumCategoryList;
	}
	
	//상품대분류등록
	public void goodsLargeCategoryInsert(GoodsLargeCategory goodsLargeCategory) {
		
		int result = goodsMapper.goodsLargeCategoryInsert(goodsLargeCategory);
		
		System.out.println("회원가입 결과 : " + result);
	}
		
	//상품중분류등록
	public void goodsMediumCategoryInsert(GoodsMediumCategory goodsMediumCategory) {
		
		int result = goodsMapper.goodsMediumCategoryInsert(goodsMediumCategory);
		
		System.out.println("회원가입 결과 : " + result);
	}
	
	//상품대분류수정
	public void goodsLargeCategoryModify(GoodsLargeCategory goodsLargeCategory) {
		goodsMapper.goodsLargeCategoryModify(goodsLargeCategory);
	}
	
	//특정대분류조회
	public GoodsLargeCategory getLargeCategoryInfoByCategoryCode(String categoryCode) {
		
		GoodsLargeCategory goodsLargeCategory = goodsMapper.getLargeCategoryInfoByCategoryCode(categoryCode);
		
		return goodsLargeCategory;
	}
	
	
	//상품중분류수정
	public void goodsMediumCategoryModify(GoodsMediumCategory goodsMediumCategory) {
		goodsMapper.goodsMediumCategoryModify(goodsMediumCategory);
	}
	
	//특정중분류조회
	public GoodsMediumCategory getMediumCategoryInfoByCategoryCodeSub(String categoryCodeSub) {
		
		GoodsMediumCategory goodsMediumCategory = goodsMapper.getMediumCategoryInfoByCategoryCodeSub(categoryCodeSub);
		
		return goodsMediumCategory;
	}
	
	
} 
