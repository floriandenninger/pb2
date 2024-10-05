package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class edp extends aonm implements aooz {
    public static final edp a;
    private static volatile aopf f;
    public int b;
    public edo c;
    public edn d;
    public int e = -1;
    private int g;

    static {
        edp edpVar = new edp();
        a = edpVar;
        aonm.registerDefaultInstance(edp.class, edpVar);
    }

    private edp() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0007ဌ\u0005", new Object[]{"g", "b", "c", "d", "e", sgo.d});
            case NEW_MUTABLE_INSTANCE:
                return new edp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (edp.class) {
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
