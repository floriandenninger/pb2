package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asrz extends aonm implements aooz {
    public static final asrz a;
    private static volatile aopf g;
    public int b;
    public asrv c;
    public int d;
    public int e;
    public int f;

    static {
        asrz asrzVar = new asrz();
        a = asrzVar;
        aonm.registerDefaultInstance(asrz.class, asrzVar);
    }

    private asrz() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004င\u0003", new Object[]{"b", "c", "d", assi.a, "e", assi.b, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new asrz();
            case NEW_BUILDER:
                return new asry();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (asrz.class) {
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
