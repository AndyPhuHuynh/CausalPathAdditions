package org.panda.causalpath.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class CPLogger
{
    public static final String logbackConfigFilePath = "src/main/resources/logback.xml";
    public final Logger paramError;
    public final Logger paramWarning;
    public CPLogger(String outputFilePath)
    {
        System.setProperty("InvalidParameterFilePath", outputFilePath);
        paramError = LoggerFactory.getLogger("InvalidParameterErrors");
        paramWarning = LoggerFactory.getLogger("InvalidParameterWarnings");
    }
}
