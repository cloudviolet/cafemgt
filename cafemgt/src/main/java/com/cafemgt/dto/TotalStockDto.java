package com.cafemgt.dto;

//table name tb_detail_volume
public class TotalStockDto {
	
	private String	detailvolCode;
	private String	storeInfoCode;
	private String 	storeInfoName;
	private String 	incoCode;
	private String 	articleCode;
	private int 	incoCount;
	private int 	incoVolumeSubtotal;
	private int 	detailvolVolumeTotal;
	private int 	detailvolConCount;
	private int 	detailvolRemainVolume;
	private int 	detailvolRemainCount;
	private String 	incoDate;
	private String 	detailvolRegDate;
	private String 	detailvolDeadlineCheck;
	private String 	detailvolCheckString;
	private int 	incoCheck;
	private String 	detailvolSystemId;
	private String 	detailvolSystemName;
	private PurchasesDto incoDto;	
	private ArticleDto articleDto;
	
	public String getDetailvolCode() {
		return detailvolCode;
	}
	public void setDetailvolCode(String detailvolCode) {
		this.detailvolCode = detailvolCode;
	}
	public String getStoreInfoCode() {
		return storeInfoCode;
	}
	public void setStoreInfoCode(String storeInfoCode) {
		this.storeInfoCode = storeInfoCode;
	}
	public String getStoreInfoName() {
		return storeInfoName;
	}
	public void setStoreInfoName(String storeInfoName) {
		this.storeInfoName = storeInfoName;
	}
	public String getIncoCode() {
		return incoCode;
	}
	public void setIncoCode(String incoCode) {
		this.incoCode = incoCode;
	}
	public String getArticleCode() {
		return articleCode;
	}
	public void setArticleCode(String articleCode) {
		this.articleCode = articleCode;
	}
	public int getIncoCount() {
		return incoCount;
	}
	public void setIncoCount(int incoCount) {
		this.incoCount = incoCount;
	}
	public int getIncoVolumeSubtotal() {
		return incoVolumeSubtotal;
	}
	public void setIncoVolumeSubtotal(int incoVolumeSubtotal) {
		this.incoVolumeSubtotal = incoVolumeSubtotal;
	}
	public int getDetailvolVolumeTotal() {
		return detailvolVolumeTotal;
	}
	public void setDetailvolVolumeTotal(int detailvolVolumeTotal) {
		this.detailvolVolumeTotal = detailvolVolumeTotal;
	}
	public int getDetailvolConCount() {
		return detailvolConCount;
	}
	public void setDetailvolConCount(int detailvolConCount) {
		this.detailvolConCount = detailvolConCount;
	}
	public int getDetailvolRemainVolume() {
		return detailvolRemainVolume;
	}
	public void setDetailvolRemainVolume(int detailvolRemainVolume) {
		this.detailvolRemainVolume = detailvolRemainVolume;
	}
	public int getDetailvolRemainCount() {
		return detailvolRemainCount;
	}
	public void setDetailvolRemainCount(int detailvolRemainCount) {
		this.detailvolRemainCount = detailvolRemainCount;
	}
	public String getIncoDate() {
		return incoDate;
	}
	public void setIncoDate(String incoDate) {
		this.incoDate = incoDate;
	}
	public String getDetailvolRegDate() {
		return detailvolRegDate;
	}
	public void setDetailvolRegDate(String detailvolRegDate) {
		this.detailvolRegDate = detailvolRegDate;
	}
	public String getDetailvolDeadlineCheck() {
		return detailvolDeadlineCheck;
	}
	public void setDetailvolDeadlineCheck(String detailvolDeadlineCheck) {
		this.detailvolDeadlineCheck = detailvolDeadlineCheck;
	}
	public String getDetailvolCheckString() {
		return detailvolCheckString;
	}
	public void setDetailvolCheckString(String detailvolCheckString) {
		this.detailvolCheckString = detailvolCheckString;
	}
	public int getIncoCheck() {
		return incoCheck;
	}
	public void setIncoCheck(int incoCheck) {
		this.incoCheck = incoCheck;
	}
	public String getDetailvolSystemId() {
		return detailvolSystemId;
	}
	public void setDetailvolSystemId(String detailvolSystemId) {
		this.detailvolSystemId = detailvolSystemId;
	}
	public String getDetailvolSystemName() {
		return detailvolSystemName;
	}
	public void setDetailvolSystemName(String detailvolSystemName) {
		this.detailvolSystemName = detailvolSystemName;
	}
	public PurchasesDto getIncoDto() {
		return incoDto;
	}
	public void setIncoDto(PurchasesDto incoDto) {
		this.incoDto = incoDto;
	}
	public ArticleDto getArticleDto() {
		return articleDto;
	}
	public void setArticleDto(ArticleDto articleDto) {
		this.articleDto = articleDto;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TotalStockDto [detailvolCode=");
		builder.append(detailvolCode);
		builder.append(", storeInfoCode=");
		builder.append(storeInfoCode);
		builder.append(", storeInfoName=");
		builder.append(storeInfoName);
		builder.append(", incoCode=");
		builder.append(incoCode);
		builder.append(", articleCode=");
		builder.append(articleCode);
		builder.append(", incoCount=");
		builder.append(incoCount);
		builder.append(", incoVolumeSubtotal=");
		builder.append(incoVolumeSubtotal);
		builder.append(", detailvolVolumeTotal=");
		builder.append(detailvolVolumeTotal);
		builder.append(", detailvolConCount=");
		builder.append(detailvolConCount);
		builder.append(", detailvolRemainVolume=");
		builder.append(detailvolRemainVolume);
		builder.append(", detailvolRemainCount=");
		builder.append(detailvolRemainCount);
		builder.append(", incoDate=");
		builder.append(incoDate);
		builder.append(", detailvolRegDate=");
		builder.append(detailvolRegDate);
		builder.append(", detailvolDeadlineCheck=");
		builder.append(detailvolDeadlineCheck);
		builder.append(", detailvolCheckString=");
		builder.append(detailvolCheckString);
		builder.append(", incoCheck=");
		builder.append(incoCheck);
		builder.append(", detailvolSystemId=");
		builder.append(detailvolSystemId);
		builder.append(", detailvolSystemName=");
		builder.append(detailvolSystemName);
		builder.append(", incoDto=");
		builder.append(incoDto);
		builder.append(", articleDto=");
		builder.append(articleDto);
		builder.append("]");
		return builder.toString();
	}	
	
	
	
}
