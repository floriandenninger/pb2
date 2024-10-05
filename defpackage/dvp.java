package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dvp extends aonm implements aooz {
    public static final dvp a;
    private static volatile aopf e;
    public int b;
    public aomf c = aomf.b;
    public aomf d = aomf.b;

    static {
        dvp dvpVar = new dvp();
        a = dvpVar;
        aonm.registerDefaultInstance(dvp.class, dvpVar);
    }

    private dvp() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new dvp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (dvp.class) {
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
