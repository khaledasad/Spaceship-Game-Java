/**
 * 
 */
package controller;

/**
 * @author Robert
 *
 */
public class LocationCtrl 
{
	private int locationID;
	private String locationName;
	
	public LocationCtrl(int locationID, String locationName) 
	{
		this.locationID = locationID;
		this.locationName = locationName;
	}
	
	public int getLocationID() 
	{
		return locationID;
	}
	
	public void setLocationID(int locationID) 
	{
		this.locationID = locationID;
	}
	
	public String getLocationName()
	{
		return locationName;
	}
	
	public void setLocationName(String locationName)
	{
		this.locationName = locationName;
	}

	@Override
	public String toString() 
	{
		return "LocationCtrl [locationID=" + locationID + ", locationName=" + locationName + "]";
	}
	
}
