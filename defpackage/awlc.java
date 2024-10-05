package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awlc extends aonm implements aooz {
    public static final awlc a;
    private static volatile aopf f;
    public int c;
    public int d;
    private int g;
    public String b = "";
    public String e = "";

    static {
        awlc awlcVar = new awlc();
        a = awlcVar;
        aonm.registerDefaultInstance(awlc.class, awlcVar);
    }

    private awlc() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဈ\u0003", new Object[]{"g", "b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new awlc();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (awlc.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
