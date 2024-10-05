package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqbt extends aonm implements aooz {
    public static final aqbt a;
    private static volatile aopf d;
    public int b = 0;
    public Object c;

    static {
        aqbt aqbtVar = new aqbt();
        a = aqbtVar;
        aonm.registerDefaultInstance(aqbt.class, aqbtVar);
    }

    private aqbt() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\uf760䂹\ue883鲓\u0002\u0000\u0000\u0000\uf760䂹ြ\u0000\ue883鲓ြ\u0000", new Object[]{"c", "b", auar.class, avss.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqbt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aqbt.class) {
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
