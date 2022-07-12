package com.demo.utility;

import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface JiraCreateIssue {
 boolean isCreateIssue();
}
