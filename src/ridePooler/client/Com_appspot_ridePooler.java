package ridePooler.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Com_appspot_ridePooler implements EntryPoint {

  private VerticalPanel mainPanel = new VerticalPanel();
  private FlexTable ridersListFlexTable = new FlexTable();
  private HorizontalPanel addRiderPanel = new HorizontalPanel();
  private TextBox newRiderTextBox = new TextBox();
  private Button addRiderButton = new Button("Add Rider");
  private Button saveRideButton = new Button("Save Ride");

  /**
   * Entry point method.
   */
  public void onModuleLoad() {
    // Create Table for Riders List
	  ridersListFlexTable.setText(0, 0, "Name");
	  ridersListFlexTable.setText(0, 1, "Rider");
	  ridersListFlexTable.setText(0, 2, "Driver");
	  ridersListFlexTable.setText(0, 3, "Rides/Drives Ratio");
	  
    // Assemble Add Rider panel.
	  addRiderPanel.add(newRiderTextBox);
	  addRiderPanel.add(addRiderButton);
	  
    // Assemble Main panel.
	  mainPanel.add(addRiderPanel);
	  mainPanel.add(ridersListFlexTable);
	  mainPanel.add(saveRideButton);
	  
    // Associate the Main panel with the HTML host page.
	  RootPanel.get("riderList").add(mainPanel);
	  
    // Move cursor focus to the input box.
	  newRiderTextBox.setFocus(true);

  }

}