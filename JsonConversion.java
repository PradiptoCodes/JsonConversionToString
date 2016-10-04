package util;

import java.text.ParseException;
import java.util.List;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import com.google.gson.Gson;

public class JsonConversion {
	
	
	public static void main(String[] args) throws ParseException
	{
		
		String jk="klgty";
			  String json2= 
			            "{"
			                + "'title': 'Computing and Information systems',"
			                + "'id' : 1,"
			                + "'children' : 'true',"
			                + "'groups' : [{"
			                    + "'title' : '"+jk+"',"
			                    + "'id' : 2,"
			                    + "'children' : 'true',"
			                    + "'groups' : [{"
			                        + "'title' : 'Intro To Computing and Internet',"
			                        + "'id' : 3,"
			                        + "'children': 'false',"
			                        + "'groups':[]"
			                    + "}]"
			                + "}]"
			            + "}";
			  
			  
				  String json = 
				            "{"
				                + "'Inputs': {"
				                + "'input1' : 1,"
				                + "'children' : 'true',"
				                + "'groups' : [{"
				                    + "'title' : '"+jk+"',"
				                    + "'id' : 2,"
				                    + "'children' : 'true',"
				                    + "'groups' : [{"
				                        + "'title' : 'Intro To Computing and Internet',"
				                        + "'id' : 3,"
				                        + "'children': 'false',"
				                        + "'groups':[]"
				                    + "}]"
				                + "}]"
				            + "}";
			  
			  
	      String name="pradipto Roy";
			  
			  
			String kl=  
			  
			   " {"
				 + "'Inputs': {"
				 +   "'input1': {"
				   +   "'ColumnNames': ["
				    +    "'Student Name',"
				    +    "'Total No. of login',"
				     +   "'Total No. of logout',"
				     +   "'No. of Exam passed',"
				     +   "'No. of Exam fail',"
				     +   "'Highest Marks',"
				     +   "'Lowest Marks',"
				     +   "'No. of Question asked',"
				     +   "'No. of Comments',"
				     + "]"
				     
				   +"}"
			+ "},"
				
				+"}";
			  
			        // Now do the magic.
			        Data data = new Gson().fromJson(kl, Data.class);
			 
			        // Show it.
			        System.out.println(data);
			}
	 
	
	class Data {
	    private String title;
	    private Long id;
	    private Boolean children;
	    private List<Data> groups;
	 
	    public String getTitle() { return title; }
	    public Long getId() { return id; }
	    public Boolean getChildren() { return children; }
	    public List<Data> getGroups() { return groups; }
	 
	    public void setTitle(String title) { this.title = title; }
	    public void setId(Long id) { this.id = id; }
	    public void setChildren(Boolean children) { this.children = children; }
	    public void setGroups(List<Data> groups) { this.groups = groups; }
	 
	    public String toString() {
	        return String.format("title:%s,id:%d,children:%s,groups:%s", title, id, children, groups);
	    }

}}
