package com.infinity.todolist;

public class ResponseBody {
	private Boolean status;
	private String msg;
	ResponseBody(){
		
	}
	ResponseBody(Boolean status, String msg){
		this.status = status;
		this.msg = msg;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
