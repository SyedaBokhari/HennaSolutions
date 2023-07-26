#Author: john@example.com
#Date: july.25,2023
#Description: This Feature is to schedule the client meetings.
#keywords: date
Feature: schedule the meeting for the client.

  Scenario: select the date and time for the meeting
		Given the user select the date and time from the drop down menu.
		 When the user enter meeting topic and the number of people for the meeting.
		  And the user clicks on the Schedule Meeting button
		 Then the user will nevigate to the home page 