package com.telek.hemsipc.protocol.daqm4300;

/**
 * @author telek
 */
public class DAQM4300constant {
    /**
     * 功能码:01 说明:读取线圈寄存器
     */
    public static byte[][] READ_BOILER_CABINET = {
            { (byte) 0x02, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x08 },
            { (byte) 0x02, (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x08 },
            { (byte) 0x02, (byte) 0x00, (byte) 0x02, (byte) 0x00, (byte) 0x08 },
            { (byte) 0x02, (byte) 0x00, (byte) 0x03, (byte) 0x00, (byte) 0x08 },
            { (byte) 0x02, (byte) 0x00, (byte) 0x04, (byte) 0x00, (byte) 0x08 },
            { (byte) 0x02, (byte) 0x00, (byte) 0x05, (byte) 0x00, (byte) 0x08 },
            { (byte) 0x02, (byte) 0x00, (byte) 0x06, (byte) 0x00, (byte) 0x08 },
            { (byte) 0x02, (byte) 0x00, (byte) 0x07, (byte) 0x00, (byte) 0x08 } };
    /**
     * 功能码:05 说明:写单个线圈寄存器
     */
    public static byte[][] BOILER_CABINET_OFF = {
            { (byte) 0x05, (byte) 0x00, (byte) 0x10, (byte) 0x00, (byte) 0x00 },
            { (byte) 0x05, (byte) 0x00, (byte) 0x11, (byte) 0x00, (byte) 0x00 },
            { (byte) 0x05, (byte) 0x00, (byte) 0x12, (byte) 0x00, (byte) 0x00 },
            { (byte) 0x05, (byte) 0x00, (byte) 0x13, (byte) 0x00, (byte) 0x00 },
            { (byte) 0x05, (byte) 0x00, (byte) 0x14, (byte) 0x00, (byte) 0x00 },
            { (byte) 0x05, (byte) 0x00, (byte) 0x15, (byte) 0x00, (byte) 0x00 },
            { (byte) 0x05, (byte) 0x00, (byte) 0x16, (byte) 0x00, (byte) 0x00 },
            { (byte) 0x05, (byte) 0x00, (byte) 0x17, (byte) 0x00, (byte) 0x00 } };
    
    public static byte[][] BOILER_CABINET_ON = {
            { (byte) 0x05, (byte) 0x00, (byte) 0x10, (byte) 0xFF, (byte) 0x00 },
            { (byte) 0x05, (byte) 0x00, (byte) 0x11, (byte) 0xFF, (byte) 0x00 },
            { (byte) 0x05, (byte) 0x00, (byte) 0x12, (byte) 0xFF, (byte) 0x00 },
            { (byte) 0x05, (byte) 0x00, (byte) 0x13, (byte) 0xFF, (byte) 0x00 },
            { (byte) 0x05, (byte) 0x00, (byte) 0x14, (byte) 0xFF, (byte) 0x00 },
            { (byte) 0x05, (byte) 0x00, (byte) 0x15, (byte) 0xFF, (byte) 0x00 },
            { (byte) 0x05, (byte) 0x00, (byte) 0x16, (byte) 0xFF, (byte) 0x00 },
            { (byte) 0x05, (byte) 0x00, (byte) 0x17, (byte) 0xFF, (byte) 0x00 } };
    
    /**
     * 功能码:15(16 进制为 0F) 说明:写多个线圈寄存器;
     */
   // public static byte[][] WRITE_multi = {};
}
