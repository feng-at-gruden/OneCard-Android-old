package de.syss.MifareClassicTool.Utils;

import de.syss.MifareClassicTool.BuildConfig;

/**
 * Created by Guo on 2015/10/31.
 */
public class Constant {


    //   public static final String ServerIP = "10.152.211.237";
    public static final String ServerIP = BuildConfig.IsUat? "192.168.0.188" : "10.154.214.240";
    public static final int ServerPort = 10001;
    public static final int WaitTime = 200;        //2 seconds

}
