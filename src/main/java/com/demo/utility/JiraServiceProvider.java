package com.demo.utility;

import java.util.ArrayList;

import net.rcarz.jiraclient.BasicCredentials;
import net.rcarz.jiraclient.Field;
import net.rcarz.jiraclient.Issue;
import net.rcarz.jiraclient.Issue.FluentCreate;
import net.rcarz.jiraclient.Issue.FluentUpdate;
import net.rcarz.jiraclient.JiraClient;
import net.rcarz.jiraclient.JiraException;

public class JiraServiceProvider {

	private JiraClient Jira;
	private String project;
	private String JiraUrl;

	public JiraServiceProvider(String JiraUrl, String username, String password, String project) {
		this.JiraUrl = JiraUrl;

		// create basic authentication object
		BasicCredentials creds = new BasicCredentials(username, password);

		// initialize the Jira client with the url and the credentials
		Jira = new JiraClient(JiraUrl, creds);
		this.project = project;
	}

	public void createJiraIssue(String issueType, String summary, String description, String priority, String duedate,
			String labels) {

		try {

			// Avoid Creating Duplicate Issue
			Issue.SearchResult sr = Jira.searchIssues("summary ~ \"" + summary + "\"");
			if (sr.total != 0) {
				System.out.println("Same Issue Already Exists on Jira");
				return;
			}

			// Create issue if not exists
			  FluentCreate fleuntCreate = Jira.createIssue(project, issueType);
			  fleuntCreate.field(Field.SUMMARY, summary);
			  fleuntCreate.field(Field.DESCRIPTION, description);
			  fleuntCreate.field(Field.PRIORITY, priority);
			  fleuntCreate.field(Field.DUE_DATE, duedate);
			  fleuntCreate.field(Field.LABELS, new ArrayList() {{add("Selenium-Automation");}});
			  Issue newIssue = fleuntCreate.execute();
			  System.out.println("********************************************");
			  System.out.println("New issue created in Jira with ID: " + newIssue);
			  System.out.println("New issue URL is :" + JiraUrl + "/browse/" + newIssue);
			  System.out.println("*******************************************");
			  
	           //Update new created issue
	           //newIssue.addComment("Test Suite 2022-08-15");
			 
		} catch (JiraException e) {
			e.printStackTrace();
		}
	}
}
