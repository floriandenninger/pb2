package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asuj extends aonm implements aooz {
    public static final asuj a;
    private static volatile aopf g;
    public int b;
    public asiu c;
    public aqht d;
    public asui e;
    public apto f;

    static {
        asuj asujVar = new asuj();
        a = asujVar;
        aonm.registerDefaultInstance(asuj.class, asujVar);
    }

    private asuj() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new asuj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (asuj.class) {
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
