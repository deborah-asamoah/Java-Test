package com.vmorg;

import java.util.Date;

public interface Frontend {

    String generateHostName(String host, String date, int numberOfBuilds);

    String authenticateUser(String user);


}
