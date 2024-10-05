package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqmd extends aonm implements aooz {
    private static final aqmd a;
    private static volatile aopf b;
    private int c;
    private boolean d;

    static {
        aqmd aqmdVar = new aqmd();
        a = aqmdVar;
        aonm.registerDefaultInstance(aqmd.class, aqmdVar);
    }

    private aqmd() {
    }

    public static aqmc a() {
        return (aqmc) a.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        this.c |= 1;
        this.d = z;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aqmd();
            case NEW_BUILDER:
                return new aqmc();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aqmd.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
