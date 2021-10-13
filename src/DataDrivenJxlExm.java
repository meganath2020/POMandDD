	import java.io.FileInputStream;

	import org.testng.annotations.Test;

	import jxl.Sheet;
	import jxl.Workbook;
	
public class DataDrivenJxlExm {


		
		public void dataDrivenGeneral()
		{
			try
			{
			FileInputStream fileinput = new FileInputStream("C:\\Users\\Anu\\eclipse-workspace\\DataDrivendata97format.xls");
			Workbook workbookxl	= Workbook.getWorkbook(fileinput);
			Sheet sheetxl = workbookxl.getSheet(0);
			int rowcount=sheetxl.getRows();
			int colcount=sheetxl.getColumns();
			String testdatavar[][]= new String [rowcount-1][colcount];
			
			System.out.println(rowcount + " " +colcount);
			
			// as per xcel sheet, first is column then is row
			for (int i=1;i<rowcount;i++)
			{
				for (int j=0;j<colcount;j++)
				{
					//getcell(i,j is given as xcel saves in different format
					testdatavar[i-1][j]=sheetxl.getCell(j,i).getContents();	
				}
			}
			
			System.out.println("printing data after driven");
			
			for (int i=0;i<rowcount-1;i++)
			{
				for (int j=0;j<colcount;j++)
				{
					System.out.println(testdatavar[i][j]);	
				}
			}
			
			}
		catch(Exception e)
			{
			System.out.println(e);
			}
		}
		
		public static void main(String[] args)
		{
			DataDrivenJxlExm obj = new DataDrivenJxlExm();
			obj.dataDrivenGeneral();
		}
			

	}



