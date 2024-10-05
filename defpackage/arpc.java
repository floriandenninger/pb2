package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arpc extends aonm implements aooz {
    public static final arpc a;
    private static volatile aopf d;
    public int b;
    public aomf c = aomf.b;
    private int e;

    static {
        arpc arpcVar = new arpc();
        a = arpcVar;
        aonm.registerDefaultInstance(arpc.class, arpcVar);
    }

    private arpc() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ည\u0001", new Object[]{"e", "b", aqtk.r, "c"});
            case NEW_MUTABLE_INSTANCE:
                return new arpc();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (arpc.class) {
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
