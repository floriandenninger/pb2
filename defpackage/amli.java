package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amli extends aonm implements aooz {
    private static final amli a;
    private static volatile aopf b;
    private int c;
    private int d;
    private long e;

    static {
        amli amliVar = new amli();
        a = amliVar;
        aonm.registerDefaultInstance(amli.class, amliVar);
    }

    private amli() {
    }

    public static amlg a() {
        return (amlg) a.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(long j) {
        this.c |= 2;
        this.e = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(amlh amlhVar) {
        this.d = amlhVar.p;
        this.c |= 1;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"c", "d", amlh.b(), "e"});
            case NEW_MUTABLE_INSTANCE:
                return new amli();
            case NEW_BUILDER:
                return new amlg();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (amli.class) {
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
