package org.mifosplatform.billing.scheduledjobs.data;

import java.util.List;

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.mifosplatform.billing.scheduledjobs.domain.JobParameters;
import org.mifosplatform.billing.scheduledjobs.service.JobParametersConstants;

public class JobParameterData {
	
	private String batchName;
	private String promotionalMessage;
	private String messageTempalate;
	private char isDynamic;
	private LocalDate dueDate;
	private LocalDate processDate;
	private LocalDate exipiryDate;
	private String defaultValue;
	private String MessageName;
	private String Value;
	private String url;
	private String username;
	private String password;
	private String provSystem;

	public JobParameterData(List<JobParameters> jobParameters) {
              
		for(JobParameters parameter:jobParameters){
			
			if(parameter.getParamName().equalsIgnoreCase(JobParametersConstants.PARAM_BATCH)){
				   this.batchName=parameter.getParamValue();
				   this.defaultValue=parameter.getParamDefaultValue();
				   
			}else if(parameter.getParamName().equalsIgnoreCase(JobParametersConstants.PARAM_SENDMESSAGE)){
				   this.MessageName=parameter.getParamValue();
				   this.Value=parameter.getParamDefaultValue();	
			
			}else if(parameter.getParamName().equalsIgnoreCase(JobParametersConstants.PARAM_PROMTIONALMESSAGE)){
			          this.promotionalMessage=parameter.getParamValue();	
			
			}else if(parameter.getParamName().equalsIgnoreCase(JobParametersConstants.PARAM_MESSAGETEMPLATE)){
				     this.messageTempalate=parameter.getParamValue();
			
			}else if(parameter.getParamName().equalsIgnoreCase(JobParametersConstants.PARAM_PROCESSDATE) && parameter.getParamValue()!=null){
				    this.processDate= DateTimeFormat.forPattern("dd MMMM yyyy")
		                 .parseLocalDate(parameter.getParamValue());
			
			}else if(parameter.getParamName().equalsIgnoreCase(JobParametersConstants.PARAM_DUEDATE) && parameter.getParamValue()!=null){
			    this.dueDate= DateTimeFormat.forPattern("dd MMMM yyyy")
		                 .parseLocalDate(parameter.getParamValue());

			}else if(parameter.getParamName().equalsIgnoreCase(JobParametersConstants.PARAM_EXIPIRYDATE) && parameter.getParamValue()!=null){
			    this.exipiryDate= DateTimeFormat.forPattern("dd MMMM yyyy")
		                 .parseLocalDate(parameter.getParamValue());
			}else if(parameter.getParamName().equalsIgnoreCase(JobParametersConstants.PARAM_URL)){
			     this.url=parameter.getParamValue();
					
		    }else if(parameter.getParamName().equalsIgnoreCase(JobParametersConstants.PARAM_USERNAME)){
		         this.username=parameter.getParamValue();
				
	        }else if(parameter.getParamName().equalsIgnoreCase(JobParametersConstants.PARAM_PASSWORD)){
	             this.password=parameter.getParamValue();
			
            }else if(parameter.getParamName().equalsIgnoreCase(JobParametersConstants.PARAM_Prov_System)){
                 this.provSystem=parameter.getParamValue();
	
            }else{
				 this.batchName=parameter.getParamValue();
			}
			/*if(parameter.isDynamic() == "Y" && parameter.getParamValue() == null){
				
	    		  if(parameter.getParamValue().equalsIgnoreCase("+1")){
	    			  
	    			  this.dueDate=new LocalDate().plusDays(1);
	    			  this.processDate=new LocalDate().plusDays(1);
	    		  }else{
	    			  dueDate=new LocalDate().minusDays(1);
	    			  this.processDate=new LocalDate().minusDays(1);
	    		  }
	    	          	  
	    	  }*/
		}
		
		
	}

	public String getBatchName() {
		return batchName;
	}

	public String getPromotionalMessage() {
		return promotionalMessage;
	}

	public String getMessageTempalate() {
		return messageTempalate;
	}

	public char isDynamic() {
		return isDynamic;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public LocalDate getProcessDate() {
		return processDate;
	}

	public char getIsDynamic() {
		return isDynamic;
	}

	public LocalDate getExipiryDate() {
		return exipiryDate;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public String getMessageName() {
		return MessageName;
	}

	public String getValue() {
		return Value;
	}

	public String getUrl() {
		return url;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getProvSystem() {
		return provSystem;
	}
	
	
	

}
