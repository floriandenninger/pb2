package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aohy extends aonm implements aooz {
    private static final aohy a;
    private static volatile aopf b;
    private int c;
    private int d;

    static {
        aohy aohyVar = new aohy();
        a = aohyVar;
        aonm.registerDefaultInstance(aohy.class, aohyVar);
    }

    private aohy() {
    }

    public static aohw a() {
        return (aohw) a.createBuilder();
    }

    public static /* synthetic */ void c(aohy aohyVar, aohx aohxVar) {
        aohyVar.d(aohxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(aohx aohxVar) {
        this.d = aohxVar.i;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "d", aohx.b()});
            case NEW_MUTABLE_INSTANCE:
                return new aohy();
            case NEW_BUILDER:
                return new aohw();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aohy.class) {
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
