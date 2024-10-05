package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqqq extends aonm implements aooz {
    public static final aqqq a;
    private static volatile aopf g;
    public int b;
    public int c;
    public int d;
    public aont e = emptyFloatList();
    public int f;

    static {
        aqqq aqqqVar = new aqqq();
        a = aqqqVar;
        aonm.registerDefaultInstance(aqqq.class, aqqqVar);
    }

    private aqqq() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003\u0013\u0004ဌ\u0002", new Object[]{"b", "c", "d", "e", "f", avya.i});
            case NEW_MUTABLE_INSTANCE:
                return new aqqq();
            case NEW_BUILDER:
                return new aone((boolean[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aqqq.class) {
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
