package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aryq extends aonm implements aooz {
    public static final aryq a;
    private static volatile aopf f;
    public int b;
    public int c;
    public int d;
    public long e;

    static {
        aryq aryqVar = new aryq();
        a = aryqVar;
        aonm.registerDefaultInstance(aryq.class, aryqVar);
    }

    private aryq() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဂ\u0002", new Object[]{"b", "c", avzr.a(), "d", avzr.a(), "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aryq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aryq.class) {
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
