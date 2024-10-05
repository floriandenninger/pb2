package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aokw extends aonm implements aooz {
    public static final aokw a;
    private static volatile aopf g;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    static {
        aokw aokwVar = new aokw();
        a = aokwVar;
        aonm.registerDefaultInstance(aokw.class, aokwVar);
    }

    private aokw() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"b", "c", aoib.t, "d", aoib.r, "e", aoib.q, "f", aokr.c});
            case NEW_MUTABLE_INSTANCE:
                return new aokw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aokw.class) {
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
