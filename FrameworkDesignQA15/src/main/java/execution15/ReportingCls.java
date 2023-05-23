package execution15;

import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportingCls {
	
	public static ExtentReports extent;

	public static ExtentReports GenerateReport() {
		
		String reportpath = System.getProperty("user.dir")+"\\reports\\testreport.html";
		
		String configpath = System.getProperty("user.dir")+"\\Resources\\ReportConfig.json";

		ExtentSparkReporter spark = new ExtentSparkReporter(reportpath);
		
		/*spark.config().setDocumentTitle("QAResults");
		spark.config().setReportName("TSRTC Test Execution");
		spark.config().setCss(".badge-success{background-color:#19af24;");*/
		
		try {
			spark.loadJSONConfig(new File(configpath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		extent = new ExtentReports();
		
		extent.attachReporter(spark);
		
		 extent.setSystemInfo("Team Name", "Automaton");
		extent.setSystemInfo("Team Lead", "Siva kumar");
			
		return extent;
		
		

	}

}
