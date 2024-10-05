package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amkx extends aonm implements aooz {
    public static final amkx a;
    private static volatile aopf e;
    public int b;
    public int c = 5;
    public int d;

    static {
        amkx amkxVar = new amkx();
        a = amkxVar;
        aonm.registerDefaultInstance(amkx.class, amkxVar);
    }

    private amkx() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"b", "c", aduo.p, "d", aduo.q});
            case NEW_MUTABLE_INSTANCE:
                return new amkx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (amkx.class) {
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
