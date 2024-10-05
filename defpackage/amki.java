package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amki extends aonm implements aooz {
    public static final amki a;
    private static volatile aopf f;
    public int b;
    public amkk c;
    public aony d = emptyProtobufList();
    public amks e;

    static {
        amki amkiVar = new amki();
        a = amkiVar;
        aonm.registerDefaultInstance(amki.class, amkiVar);
    }

    private amki() {
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
                return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0007\u0004\u0000\u0001\u0000\u0001\t\u0002\u001b\u0004\f\u0007\t", new Object[]{"c", "d", amkt.class, "b", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new amki();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (amki.class) {
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
