package domain;

import java.io.Serializable;
import java.util.List;

public class DdItem implements Serializable {

	private static final long serialVersionUID = 8484458324328060785L;

	private int id;
	private String name;
	private String num;

	private List<DdSubitem> ddSubitems;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public List<DdSubitem> getDdSubitems() {
		return ddSubitems;
	}
	public void setDdSubitems(List<DdSubitem> ddSubitems) {
		this.ddSubitems = ddSubitems;
	}

}
