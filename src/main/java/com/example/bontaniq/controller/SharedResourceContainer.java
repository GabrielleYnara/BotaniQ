package com.example.bontaniq.controller;

import java.util.HashMap;
import java.util.logging.Logger;

public class SharedResourceContainer {
    static HashMap<String, Object> requestResponse = new HashMap<>();

    protected Logger logger = Logger.getLogger(getClass().getName());
}
