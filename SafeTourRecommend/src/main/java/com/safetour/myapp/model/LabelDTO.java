package com.safetour.myapp.model;

import java.io.Serializable;

public class LabelDTO extends ThemeDTO  implements Serializable, FormDTO {
	private ThemeDTO themeDTO;
	private String Label_1;
	private String Label_2;
	private String Label_3;
	private String Label_4;
	private String Label_5;
	private String Label_6;
	private String Label_7;
	private String Label_8;
	private String Label_9;
	private String Label_10;
	private String Label_11;
	private String Label_12;
	
	public LabelDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	public LabelDTO(String sentence, String gender, int age, String partner, String address) {
		super(sentence, gender, age, partner, address);
		// TODO Auto-generated constructor stub
	}



	public LabelDTO(ThemeDTO themeDTO, String label_1, String label_2, String label_3, String label_4, String label_5,
			String label_6, String label_7, String label_8, String label_9, String label_10, String label_11, String label_12) {
		super();
		this.themeDTO = themeDTO;
		Label_1 = label_1;
		Label_2 = label_2;
		Label_3 = label_3;
		Label_4 = label_4;
		Label_5 = label_5;
		Label_6 = label_6;
		Label_7 = label_7;
		Label_8 = label_8;
		Label_9 = label_9;
		Label_10 = label_10;
		Label_11 = label_11;
		Label_12 = label_12;
		
	}



	public ThemeDTO getThemeDTO() {
		return themeDTO;
	}



	public void setThemeDTO(ThemeDTO themeDTO) {
		this.themeDTO = themeDTO;
	}



	public String getLabel_1() {
		return Label_1;
	}



	public void setLabel_1(String label_1) {
		Label_1 = label_1;
	}



	public String getLabel_2() {
		return Label_2;
	}



	public void setLabel_2(String label_2) {
		Label_2 = label_2;
	}



	public String getLabel_3() {
		return Label_3;
	}



	public void setLabel_3(String label_3) {
		Label_3 = label_3;
	}



	public String getLabel_4() {
		return Label_4;
	}



	public void setLabel_4(String label_4) {
		Label_4 = label_4;
	}



	public String getLabel_5() {
		return Label_5;
	}



	public void setLabel_5(String label_5) {
		Label_5 = label_5;
	}



	public String getLabel_6() {
		return Label_6;
	}



	public void setLabel_6(String label_6) {
		Label_6 = label_6;
	}



	public String getLabel_7() {
		return Label_7;
	}



	public void setLabel_7(String label_7) {
		Label_7 = label_7;
	}



	public String getLabel_8() {
		return Label_8;
	}



	public void setLabel_8(String label_8) {
		Label_8 = label_8;
	}



	public String getLabel_9() {
		return Label_9;
	}

	public String getLabel_10() {
		return Label_10;
	}
	
	public String getLabel_11() {
		return Label_11;
	}
	
	public String getLabel_12() {
		return Label_12;
	}


	public void setLabel_9(String label_9) {
		Label_9 = label_9;
	}
	
	public void setLabel_10(String label_10) {
		Label_10 = label_10;
	}
	
	public void setLabel_11(String label_11) {
		Label_11 = label_11;
	}
	
	public void setLabel_12(String label_12) {
		Label_12 = label_12;
	}



	@Override
	public String toString() {
		return "LabelDTO [themeDTO=" + themeDTO + ", Label_1=" + Label_1 + ", Label_2=" + Label_2 + ", Label_3="
				+ Label_3 + ", Label_4=" + Label_4 + ", Label_5=" + Label_5 + ", Label_6=" + Label_6 + ", Label_7="
				+ Label_7 + ", Label_8=" + Label_8 + ", Label_9=" + Label_9 + ", Label_10=" + Label_10 + ", Label_11="
						+ Label_11 + ", Label_12=" + Label_12 + "]";
	}



	@Override
	public void Insert() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public String Read() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public int Update() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public int Delete() {
		// TODO Auto-generated method stub
		return 0;
	}


	
	
}
