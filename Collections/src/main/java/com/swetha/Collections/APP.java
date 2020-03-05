package com.swetha.Collections;

import org.apache.logging.log4j.*;



public class APP {
    private static final Logger logger = LogManager.getLogger(APP.class);

    public static void main(String[] args) {
        Integer[] array = {23, 45};
        Collections_list<Integer> list = new Collections_list<Integer>(array);
        list.add(23);
        logger.debug(list);
    }
}