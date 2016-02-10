package model;

import java.io.Serializable;

public class Security implements Serializable{
	
	private static final long serialVersionUID = -3475925282524036776L;
	
	public Security(String id, String sec_code, String sec_desc,
			String isin_code, String sector_id, int sec_type_id,
			int currency_id, int location_id, int rating_id) {
		super();
		this.id = id;
		this.sec_code = sec_code;
		this.sec_desc = sec_desc;
		this.isin_code = isin_code;
		this.sector_id = sector_id;
		this.sec_type_id = sec_type_id;
		this.currency_id = currency_id;
		this.location_id = location_id;
		this.rating_id = rating_id;
	}
	String id;
	String sec_code;
	String sec_desc	;
	String isin_code;
	String sector_id;
	int sec_type_id	;
	int currency_id	;
	int location_id	;
	int rating_id   ;	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSec_code() {
		return sec_code;
	}

	public void setSec_code(String sec_code) {
		this.sec_code = sec_code;
	}

	public String getSec_desc() {
		return sec_desc;
	}

	public void setSec_desc(String sec_desc) {
		this.sec_desc = sec_desc;
	}

	public String getIsin_code() {
		return isin_code;
	}

	public void setIsin_code(String isin_code) {
		this.isin_code = isin_code;
	}

	public String getSector_id() {
		return sector_id;
	}

	public void setSector_id(String sector_id) {
		this.sector_id = sector_id;
	}

	public int getSec_type_id() {
		return sec_type_id;
	}

	public void setSec_type_id(int sec_type_id) {
		this.sec_type_id = sec_type_id;
	}

	public int getCurrency_id() {
		return currency_id;
	}

	public void setCurrency_id(int currency_id) {
		this.currency_id = currency_id;
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}

	public int getRating_id() {
		return rating_id;
	}

	public void setRating_id(int rating_id) {
		this.rating_id = rating_id;
	}

	
/*
	@Override
	public void fromData(DataInput in) throws IOException,
			ClassNotFoundException {
		
		 sec_type_id=in.readInt();
		 currency_id=in.readInt();
		 location_id=in.readInt();
		 rating_id  =in.readInt();
		 id         =in.readUTF();
		 sec_code   =in.readUTF();
		 sec_desc   =in.readUTF();
		 isin_code  =in.readUTF();
		 sector_id  =in.readUTF();
	}

	@Override
	public void toData(DataOutput out) throws IOException {
		out.writeInt(sec_type_id);
		out.writeInt(currency_id);
		out.writeInt(location_id);
		out.writeInt(rating_id  );
		out.writeUTF(id         );
		out.writeUTF(sec_code   );
		out.writeUTF(sec_desc   );
		out.writeUTF(isin_code  );
		out.writeUTF(sector_id  );

	}
*/
	@Override
	public String toString() {
	String toString="";
	toString+="id = "+ id+"\n";
	toString+= "sec_code   = "+sec_code+"\n";
	toString+= "sec_desc   = "+sec_desc	 +"\n";
	toString+= "isin_code  = "+isin_code +"\n";
	toString+= "sector_id  = "+sector_id +"\n";
	toString+= "sec_type_id= "+sec_type_id+"\n";
	toString+= "currency_id= "+currency_id+"\n";
	toString+= "location_id= "+location_id+"\n";
	toString+= "rating_id  = "+rating_id  +"\n";
	return toString;
	}
}
