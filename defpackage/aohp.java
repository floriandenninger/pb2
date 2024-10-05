package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aohp extends aonm implements aooz {
    public static final aohp a;
    private static volatile aopf g;
    public int b;
    public int c;
    public int d;
    public int e;
    public aohu f;

    static {
        aohp aohpVar = new aohp();
        a = aohpVar;
        aonm.registerDefaultInstance(aohp.class, aohpVar);
    }

    private aohp() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001%\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဌ\u0003\u0004ဉ\u0004%ဌ\u0001", new Object[]{"b", "c", aogu.n, "e", aogu.m, "f", "d", aogu.h});
            case NEW_MUTABLE_INSTANCE:
                return new aohp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aohp.class) {
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
