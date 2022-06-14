package miniproject;

public class TestCase extends CommonReusableActions implements Common_inputs,CommonObjects
{
	
	public void setupbrowser()
	{
		LaunchBrowser(IP_browser);
		load_webpage(IP_page_url);
		set_explicitwait_time(IP_explicit_time);
	}
	
	public void register_user()
	{
		Type_text(Obj_Reg_form_firstname, IP_reg_form_Firstname);
		Type_text(Obj_Reg_form_surname, Ip_reg_form_Surname);
		Type_text(Obj_Reg_Form_Email, Ip_reg_form_email);
		Type_text(Obj_Reg_Retype_email, IP_reg_form_retype_email);
		Type_text(Obj_Reg_password, IP_reg_Form_password);
		select_dropdown(Obj_Reg_Day_Dropdown, "text", IP_reg_dob_day);
		
	}
	
	
	public static void main (String args[])
	{
		TestCase obj=new TestCase();
		obj.setupbrowser();
		obj.register_user();
	}

}
