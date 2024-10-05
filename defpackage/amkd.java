package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amkd extends aonm implements aooz {
    public static final amkd a;
    private static volatile aopf h;
    public int b = 0;
    public Object c;
    public amkl d;
    public amkn e;
    public amkm f;
    public amkr g;

    static {
        amkd amkdVar = new amkd();
        a = amkdVar;
        aonm.registerDefaultInstance(amkd.class, amkdVar);
    }

    private amkd() {
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
                return newMessageInfo(a, "\u0000\t\u0001\u0000\u0001\r\t\u0000\u0000\u0000\u0001<\u0000\u0002\t\u0003\t\u0004\t\u0006Ȼ\u0000\u0007Ȼ\u0000\n\t\f<\u0000\r=\u0000", new Object[]{"c", "b", amkj.class, "d", "e", "f", "g", amku.class});
            case NEW_MUTABLE_INSTANCE:
                return new amkd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (amkd.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
