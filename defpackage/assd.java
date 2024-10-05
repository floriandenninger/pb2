package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class assd extends aonm implements aooz {
    public static final assd a;
    private static volatile aopf e;
    public int b;
    public asrv c;
    public int d;

    static {
        assd assdVar = new assd();
        a = assdVar;
        aonm.registerDefaultInstance(assd.class, assdVar);
    }

    private assd() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"b", "c", "d", assi.d});
            case NEW_MUTABLE_INSTANCE:
                return new assd();
            case NEW_BUILDER:
                return new assc();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (assd.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
