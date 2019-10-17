package com.lucasromagnoli.testador.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiGithubDTO {

	public final static String baseURL = "https://api.github.com/users/";
	
	private String id;
	private String login;
	
	@Override
	public String toString() {
		return "ApiGithubDTO [id=" + id + ", login=" + login + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
}
