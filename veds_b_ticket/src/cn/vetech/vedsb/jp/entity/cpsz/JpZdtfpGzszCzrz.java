package cn.vetech.vedsb.jp.entity.cpsz;

import javax.persistence.Id;
import javax.persistence.Table;

import org.vetech.core.modules.mybatis.page.AbstractPageEntity;

@Table(name = "JP_ZDTFP_GZSZ_CZRZ")
public class JpZdtfpGzszCzrz extends AbstractPageEntity {
	private static final long serialVersionUID = 622826235296088142L;
	@Id
	/**主键*/

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
		return gzid;
	}
	public void setGzid(String gzid) {
		this.gzid = gzid;
	}
		return zt;
	}
	public void setZt(String zt) {
		this.zt = zt;
	}
		return czDatetime;
	}
	public void setCzDatetime(String czDatetime) {
		this.czDatetime = czDatetime;
	}
		return czshbh;
	}
	public void setCzshbh(String czshbh) {
		this.czshbh = czshbh;
	}
		return czbmbh;
	}
	public void setCzbmbh(String czbmbh) {
		this.czbmbh = czbmbh;
	}
		return czyhbh;
	}
	public void setCzyhbh(String czyhbh) {
		this.czyhbh = czyhbh;
	}
		return bzbz;
	}
	public void setBzbz(String bzbz) {
		this.bzbz = bzbz;
	}
		return czsm;
	}
	public void setCzsm(String czsm) {
		this.czsm = czsm;
	}

}