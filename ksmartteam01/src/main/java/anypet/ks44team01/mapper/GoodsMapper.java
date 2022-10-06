package anypet.ks44team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import anypet.ks44team01.dto.GoodsLargeCategory;
import anypet.ks44team01.dto.Goods;

@Mapper
public interface GoodsMapper {

	public List<GoodsLargeCategory> getGoodsLargeCategoryList();

	
	//상품 목록 조회
	public List<Goods> getGoodsList();
}