package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum aoqn {
    DOUBLE(aoqo.DOUBLE, 1),
    FLOAT(aoqo.FLOAT, 5),
    INT64(aoqo.LONG, 0),
    UINT64(aoqo.LONG, 0),
    INT32(aoqo.INT, 0),
    FIXED64(aoqo.LONG, 1),
    FIXED32(aoqo.INT, 5),
    BOOL(aoqo.BOOLEAN, 0),
    STRING(aoqo.STRING, 2),
    GROUP(aoqo.MESSAGE, 3),
    MESSAGE(aoqo.MESSAGE, 2),
    BYTES(aoqo.BYTE_STRING, 2),
    UINT32(aoqo.INT, 0),
    ENUM(aoqo.ENUM, 0),
    SFIXED32(aoqo.INT, 5),
    SFIXED64(aoqo.LONG, 1),
    SINT32(aoqo.INT, 0),
    SINT64(aoqo.LONG, 0);

    public final aoqo s;
    public final int t;

    aoqn(aoqo aoqoVar, int i) {
        this.s = aoqoVar;
        this.t = i;
    }
}
