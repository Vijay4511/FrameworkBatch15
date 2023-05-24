package test;

import org.testng.annotations.Test;

public class TrackTicketsModule {
	
	@Test(groups= {"smoke"})
	public void TrackService()
	{
		System.out.println("TrackService");
	}
	
	@Test(groups= {"regression"})
	public void TimeTableTrack()
	{
		System.out.println("TimeTableTrack");
	
	}

}
