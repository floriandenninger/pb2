package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aokv extends aonm implements aooz {
    public static final aokv a;
    private static volatile aopf f;
    public int b;
    public int c;
    public int d;
    public int e;
    private int g;

    static {
        aokv aokvVar = new aokv();
        a = aokvVar;
        aonm.registerDefaultInstance(aokv.class, aokvVar);
    }

    private aokv() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"g", "b", aoib.t, "c", aoib.r, "d", aoib.q, "e", aokr.c});
            case NEW_MUTABLE_INSTANCE:
                return new aokv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aokv.class) {
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
