package org.stepdefination;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void report(String Jsonpath) {
File f = new File(System.getProperty("user.dir")+"\\Reports\\JVM");
Configuration c = new Configuration(f, "faceBook");
c.addClassifications("pasupathi", "rikcj");
c.addClassifications("balaji", "bro");
c.addClassifications("amar", ",acham");
List <String> li = new ArrayList<String>();
li.add(Jsonpath);
ReportBuilder r = new ReportBuilder(li, c);
r.generateReports();

	}

}
