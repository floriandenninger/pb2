package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoii extends aonm implements aooz {
    public static final aoii a;
    private static volatile aopf f;
    public Object c;
    public Object e;
    public int b = 0;
    public int d = 0;

    static {
        aoii aoiiVar = new aoii();
        a = aoiiVar;
        aonm.registerDefaultInstance(aoii.class, aoiiVar);
    }

    private aoii() {
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
                return newMessageInfo(a, "\u0001\u0004\u0002\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001ျ\u0000\u0002ြ\u0000\u0003ြ\u0001\u0004ြ\u0001", new Object[]{"c", "b", "e", "d", aojt.class, aoig.class, aoih.class});
            case NEW_MUTABLE_INSTANCE:
                return new aoii();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aoii.class) {
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
