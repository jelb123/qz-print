package qz.common;

import qz.utils.SystemUtilities;

/**
 * Created by robert on 7/9/2014.
 */
public class Constants {
    public static final String HEXES = "0123456789ABCDEF";
    public static final char[] HEXES_ARRAY = HEXES.toCharArray();
    public static final int OUTPUT_STREAM_SIZE = 20480;
    public static final int BYTE_BUFFER_SIZE = 512;
    public static final int APPEND_XML = 1;
    public static final String VERSION = "1.8.5";
    public static final int APPEND_RAW = 2;
    public static final int APPEND_IMAGE = 3;
    public static final int APPEND_IMAGE_PS = 4;
    public static final int APPEND_PDF = 8;
    public static final int APPEND_HTML = 16;

    /* QZ-Tray Constants */
    public static final String BLOCK_FILE = "blocked";
    public static final String ALLOW_FILE = "allowed";
    public static final String TEMP_FILE = "temp";
    public static final String LOG_FILE = "debug";
    public static final String DATA_DIR = ".qz";
}
