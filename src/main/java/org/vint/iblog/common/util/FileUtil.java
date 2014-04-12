package org.vint.iblog.common.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * Created by Vin on 14-4-11.
 */
public class FileUtil {

    /**
     * Parse configuration file content.
     * @param contextPath   classpath of configuration file
     * @return  the content of configuration file
     * @throws Exception
     */
    public static String readCfgFile(String contextPath) throws Exception {
        InputStream is = FileUtil.class.getResourceAsStream(contextPath);
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();
        String s = "";
        while ((s = br.readLine()) != null)
            sb.append(s);
        is.close();
        br.close();
        return sb.toString().replaceAll("(?<=>)\\s+(?=<)", "");
    }

}
