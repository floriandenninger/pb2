package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amkr extends aonm implements aooz {
    public static final amkr a;
    private static volatile aopf c;
    public aomf b;

    static {
        amkr amkrVar = new amkr();
        a = amkrVar;
        aonm.registerDefaultInstance(amkr.class, amkrVar);
    }

    private amkr() {
        aomf aomfVar = aomf.b;
        this.b = aomf.b;
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
                return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u000f\u000f\u0001\u0000\u0000\u0000\u000f\n", new Object[]{"b"});
            case NEW_MUTABLE_INSTANCE:
                return new amkr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (amkr.class) {
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
