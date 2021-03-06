package com.telek.hemsipc.protocal3761.protocal.internal.packetSegment;

import lombok.Data;

/**
 * Created by PETER on 2015/3/25.
 */
@Data
public class Head extends Segment implements Cloneable {
    private int length;
    private int version;

    @Override
    public void reset() {
        length=0;
        version=0;
        getBuffer().clear();
    }

    @Override
    public Head clone() {
        Head head = new Head();
        head.setLength(length);
        head.setVersion(version);
        return head;
    }
}
