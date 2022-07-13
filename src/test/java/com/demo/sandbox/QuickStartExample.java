package com.demo.sandbox;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.asynchttpclient.Request;
import org.joda.time.chrono.AssembledChronology.Fields;

import com.demo.utility.JiraCreateIssue;

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
import net.rcarz.jiraclient.RestClient;
import net.rcarz.jiraclient.User;

public class QuickStartExample {
	
	
	public static void main(String[] args) {

	
	BasicCredentials creds = new BasicCredentials("13aixpress@gmail.com", "WF7swfJ3M6MTfSxkek4j3E2D");
    JiraClient jira = new JiraClient("https://pamphoux.atlassian.net/", creds);

    try {
    	/* Retrieve issue P2P-58 from JIRA. We'll get an exception if this fails. */
        Issue issue = jira.getIssue("TNG-9");
	
        /* You can also do it like this: */
        System.out.println(issue.getKey());
        
        
        /* Add an attachment
        File file = new File ("/home/pierre/Pictures/20180127_083520.jpg");
        issue.addAttachment(file);*/
        
        /* Print the reporter's username and then the display name */
        //System.out.println("Reporter: " + issue.getReporter());
        System.out.println("Reporter's Name: " + issue.getReporter().getDisplayName());
        //System.out.println("Reporter's id: " + issue.getReporter().getId());
        
        /* Print the assignee's username and then the display name */
        //System.out.println("Assignee: " + issue.getAssignee());
        System.out.println("Assignee's Name: " + issue.getAssignee().getDisplayName());
        //System.out.println("Assignee's Id: " + issue.getAssignee().getId());
        
        /* update issue */

        
        
    } catch (JiraException ex) {
        System.err.println(ex.getMessage());

        if (ex.getCause() != null)
            System.err.println(ex.getCause().getMessage());
    }
	}
}
