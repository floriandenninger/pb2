package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aefl extends aonm implements aooz {
    public static final aefl a;
    private static volatile aopf f;
    public int b;
    public int c = 1;
    public aefn d;
    public boolean e;

    static {
        aefl aeflVar = new aefl();
        a = aeflVar;
        aonm.registerDefaultInstance(aefl.class, aeflVar);
    }

    private aefl() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဇ\u0002", new Object[]{"b", "c", ovw.b(), "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aefl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aefl.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
