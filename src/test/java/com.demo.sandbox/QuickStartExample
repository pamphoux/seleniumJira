package com.demo.sandbox;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import net.rcarz.jiraclient.BasicCredentials;
import net.rcarz.jiraclient.Comment;
import net.rcarz.jiraclient.CustomFieldOption;
import net.rcarz.jiraclient.Field;
import net.rcarz.jiraclient.Issue;
import net.rcarz.jiraclient.Issue.FluentTransition;
import net.rcarz.jiraclient.Issue.FluentUpdate;
import net.rcarz.jiraclient.IssueType;
import net.rcarz.jiraclient.JiraClient;
import net.rcarz.jiraclient.JiraException;

public class QuickStartExample {
	
	
	public static void main(String[] args) {

	
	BasicCredentials creds = new BasicCredentials("example@gmail.com", "jira_api_token");
    JiraClient jira = new JiraClient("https://example.atlassian.net/", creds);

    try {
    	/* Retrieve issue P2P-58 from JIRA. We'll get an exception if this fails. */
        Issue issue = jira.getIssue("P2P-59");
	
        /* You can also do it like this: */
        System.out.println(issue.getKey());
        
        /* Add an attachment
        File file = new File ("/home/pierre/Pictures/20180127_083520.jpg");
        issue.addAttachment(file);*/

    } catch (JiraException ex) {
        System.err.println(ex.getMessage());

        if (ex.getCause() != null)
            System.err.println(ex.getCause().getMessage());
    }
	}
}
