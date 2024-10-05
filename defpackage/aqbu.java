package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqbu extends aonm implements aooz {
    public static final aqbu a;
    private static volatile aopf d;
    public int b = 0;
    public Object c;

    static {
        aqbu aqbuVar = new aqbu();
        a = aqbuVar;
        aonm.registerDefaultInstance(aqbu.class, aqbuVar);
    }

    private aqbu() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\uec6a䂺\uec6a䂺\u0001\u0000\u0000\u0000\uec6a䂺ြ\u0000", new Object[]{"c", "b", aqbz.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqbu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aqbu.class) {
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
