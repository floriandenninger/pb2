package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ascl extends aonm implements aooz {
    public static final ascl a;
    private static volatile aopf c;
    public long b;
    private int d;

    static {
        ascl asclVar = new ascl();
        a = asclVar;
        aonm.registerDefaultInstance(ascl.class, asclVar);
    }

    private ascl() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဃ\u0002", new Object[]{"d", "b"});
            case NEW_MUTABLE_INSTANCE:
                return new ascl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (ascl.class) {
                        aopfVar = c;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            c = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
