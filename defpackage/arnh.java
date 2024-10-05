package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arnh extends aonm implements aooz {
    public static final arnh a;
    private static volatile aopf g;
    public int b;
    public int c;
    public int d;
    public int e;
    public arnp f;

    static {
        arnh arnhVar = new arnh();
        a = arnhVar;
        aonm.registerDefaultInstance(arnh.class, arnhVar);
    }

    private arnh() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0005ဉ\u0004", new Object[]{"b", "c", "d", armv.f, "e", armv.g, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new arnh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (arnh.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
