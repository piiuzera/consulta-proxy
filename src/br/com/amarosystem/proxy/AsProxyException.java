package br.com.amarosystem.proxy;

public class AsProxyException extends Exception {
	private static final long serialVersionUID = 6101787649368168130L;
	
	private String code;
	private String details;
	
	public AsProxyException(String message) {
		super(message);
		this.code = "";
		this.details = "";
	}
	public AsProxyException(String message, String code) {
		super(message);
		this.code = code;
		this.details = "";
	}
	public AsProxyException(String message, String code, String details) {
		super(message);
		this.code = code;
		this.details = details;
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
}
