package com.qwinix.entaly.qa.steps;

public class JsonModel
{
	public String xval;
	public int yval;
	public String cDateval;
	public String mval;
	public String idval;
	public String linetype;
	public String getXval()
	{
		return xval;
	}
	public void setXval(String xval)
	{
		this.xval = xval;
	}
	public int getYval()
	{
		return yval;
	}
	public void setYval(int yval)
	{
		this.yval = yval;
	}
	public String getcDateval()
	{
		return cDateval;
	}
	public String getmval()
	{
		return mval;
	}
	public String getidval()
	{
		return idval;
	}
	public void setdata(String cDateval,String mval,String idval)
	{
		this.cDateval = cDateval;
		this.mval = mval;
		this.idval = idval;
	}
	
	public String getType() {
		return linetype;
	}
	public void setType(String linetype) {
		this.linetype = linetype;
	}
}

