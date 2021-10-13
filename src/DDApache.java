import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;





public class DDApache {


	@Test
	public void datadriveapache()
	{
		try
		{
		FileInputStream filevar = new FileInputStream("C:\\Users\\Anu\\eclipse-workspace\\DataDrivendata.xlsx");
		Workbook workbookAphe = new XSSFWorkbook(filevar);
		Sheet sheetvar = workbookAphe.getSheetAt(0);
		

		DataFormatter df = new DataFormatter();
		
		Iterator<Row> rowvalues = sheetvar.iterator(); 
		List<String> Cellcontent = new ArrayList<String>();
		
		
		while(rowvalues.hasNext())
		{
			Row rowvalueloop= rowvalues.next();
			Iterator<Cell> Cellvalues = rowvalueloop.iterator();
			while(Cellvalues.hasNext())
			{
				/*
				 * to convert all cells into string --
				 * DataFormatter df = new DataFormatter();
				 * String value = df.formatCellValue(cell);
				 */
				Cell cellvalueloop=Cellvalues.next();
				 
			
				Cellcontent.add(df.formatCellValue(cellvalueloop));
			}
		}
		
		
		/// program to store in 2d array
		
		
		for(int i=0;i<Cellcontent.size();i++ )
		{
			
			System.out.println(Cellcontent.get(i));
		}
		
		/*String data2darray[][];
		 * int k=0; for(int i=0;i<3;i++ ) { for(int j=0;j<3;j++) { System.out.println(i+
		 * "  "+j); data2darray[i][j]=Cellcontent.get(k);
		 * System.out.println(Cellcontent.get(k)); k++; } }
		 * System.out.println("printing after storing"); for(int i=0;i<3;i++ ) { for(int
		 * j=0;j<3;j++) { System.out.println(data2darray[i][j]); } }
		 */
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
				
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		DDApache obj = new DDApache();
		obj.datadriveapache();
	}

}
