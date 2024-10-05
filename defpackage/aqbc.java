package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqbc extends aonm implements aooz {
    public static final aonv a = new uct(13);
    public static final aqbc b;
    private static volatile aopf i;
    public boolean d;
    public boolean e;
    public int g;
    public boolean h;
    private int j;
    public String c = "";
    public aonu f = emptyIntList();

    static {
        aqbc aqbcVar = new aqbc();
        b = aqbcVar;
        aonm.registerDefaultInstance(aqbc.class, aqbcVar);
    }

    private aqbc() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(b, "\u0001\u0006\u0000\u0001\u0003\u000f\u0006\u0000\u0001\u0000\u0003ဈ\u0002\u0004ဇ\u0003\nဇ\n\u000b\u001e\fင\u000b\u000fဇ\r", new Object[]{"j", "c", "d", "e", "f", apue.a(), "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aqbc();
            case NEW_BUILDER:
                return new aone(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (aqbc.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(b);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
