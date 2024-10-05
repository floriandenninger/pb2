package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class assb extends aonm implements aooz {
    public static final assb a;
    private static volatile aopf g;
    public int b;
    public asrv c;
    public int d;
    public int e;
    public int f;

    static {
        assb assbVar = new assb();
        a = assbVar;
        aonm.registerDefaultInstance(assb.class, assbVar);
    }

    private assb() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0004ဌ\u0002\u0005ဌ\u0003\u0006င\u0004", new Object[]{"b", "c", "d", assi.f, "e", asje.t, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new assb();
            case NEW_BUILDER:
                return new assa();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (assb.class) {
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
