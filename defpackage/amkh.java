package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amkh extends aonm implements aooz {
    public static final amkh a;
    private static volatile aopf d;
    public int b = 0;
    public Object c;

    static {
        amkh amkhVar = new amkh();
        a = amkhVar;
        aonm.registerDefaultInstance(amkh.class, amkhVar);
    }

    private amkh() {
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
                return newMessageInfo(a, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001=\u0000\u0002<\u0000\u0003=\u0000\u0004<\u0000", new Object[]{"c", "b", amkd.class, amkg.class});
            case NEW_MUTABLE_INSTANCE:
                return new amkh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (amkh.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
