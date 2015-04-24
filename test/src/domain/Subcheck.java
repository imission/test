package domain;

public class Subcheck {

	private int id;
	private int check_id;
	private String item_num;
	private String subitem_num;
	private String value_str;
	private String value_multi;
	private String value_template;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCheck_id() {
		return check_id;
	}
	public void setCheck_id(int check_id) {
		this.check_id = check_id;
	}
	public String getSubitem_num() {
		return subitem_num;
	}
	public void setSubitem_num(String subitem_num) {
		this.subitem_num = subitem_num;
	}
	public String getValue_str() {
		return value_str;
	}
	public void setValue_str(String value_str) {
		this.value_str = value_str;
	}
	public String getValue_multi() {
		return value_multi;
	}
	public void setValue_multi(String value_multi) {
		this.value_multi = value_multi;
	}
	public String getValue_template() {
		return value_template;
	}
	public void setValue_template(String value_template) {
		this.value_template = value_template;
	}
	public String getItem_num() {
		return item_num;
	}
	public void setItem_num(String item_num) {
		this.item_num = item_num;
	}

}
