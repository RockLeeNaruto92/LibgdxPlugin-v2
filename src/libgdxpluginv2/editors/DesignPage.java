package libgdxpluginv2.editors;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;

/**
 * Design page has pallete part and drag-drop part.
 * @author superman
 *
 */
public class DesignPage {
	private static int NUMBER_OF_MAIN_PART = 2;
	private static double PALETTE_PART_WIDTH = 0.3;
	private static double DRAG_DROP_PART_WIDTH = 0.7;
	
	private static int PALLETE_HEADER_HEIGHT = 50; // px
	private static int PALLETE_EXPANDBAR_ITEM_HEIGHT = 50; //px
	private static int PALLETE_DISTANCE_BETWEEN_EXPANDBAR_ITEM_WITH_EXPANDBAR_ITEM = 5; //px
	private static int PALLETE_DISTANCE_BETWEEN_EXPANDBAR = 10; //px
	private static int PALLETE_DISTANCE_BETWEEN_EXPANBAR_ITEM_WITH_PALLETE_LEFT = 10; //px;
	private static int PALLETE_DISTANCE_BETWEEN_EXPANBAR_ITEM_WITH_PALLETE_RIGHT = 10;
	private static int PALLETE_DISTANCE_BETWEEN_EXPANBAR_WITH_PALLETE_RIGHT = 5; //px
	private static int PALLETE_DISTANCE_BETWEEN_EXPANBAR_WITH_PALLETE_LEFT = 5; //px
	private static int PALLETE_DISTANCE_BETWEEN_EXPANBAR_WITH_PALLETE_HEADER = 5; //px
	
	private static String PALLETE_NAME = "Pallete";

	private Composite composite;
	
	private ExpandBar palleteExpandBar;
	private Group palleteGroup;
	
	public DesignPage(Composite composite){
		this.composite = composite;
		this.create();
	}

	private void create(){
		createMainLayout();
		createPalletePart();
		createDragDropPart();
	}
	
	/**
	 * Create main row layout
	 */
	private void createMainLayout(){
		RowLayout layout = new RowLayout(SWT.VERTICAL);
		
		composite.setLayout(layout);
	}
	
	private void createDragDropPart(){
		
	}
	
	private void createPalletePart(){
		createPalleteLayout();
		createPalleteHeader();
		createPalleteExpandBar();
	}
	
	private void createPalleteLayout(){
		int palleteWidth = (int)(composite.getBorderWidth() * PALETTE_PART_WIDTH);
		RowData data = new RowData(palleteWidth, SWT.FULL_SELECTION);
		
		palleteGroup = new Group(composite, SWT.NONE);
		
		palleteGroup.setLayoutData(data);
		palleteGroup.setLayout(new FormLayout());
	}
	
	private void createPalleteHeader(){
		FormData headerData = new FormData(SWT.FULL_SELECTION, PALLETE_HEADER_HEIGHT);
		Label label = new Label(palleteGroup, SWT.NONE);
		
		label.setText(PALLETE_NAME);
		label.setAlignment(SWT.CENTER);
		label.setLayoutData(headerData);
	}
	
	private void createPalleteExpandBar(){
		palleteExpandBar = new ExpandBar(palleteGroup, SWT.V_SCROLL);
		
		FormData expandBarData = new FormData(SWT.FULL_SELECTION, SWT.FULL_SELECTION);
		expandBarData.top = new FormAttachment(PALLETE_DISTANCE_BETWEEN_EXPANBAR_WITH_PALLETE_HEADER, 0);
		expandBarData.right = new FormAttachment(PALLETE_DISTANCE_BETWEEN_EXPANBAR_WITH_PALLETE_RIGHT);
		
		palleteExpandBar.setLayoutData(expandBarData);
	}
	
}
