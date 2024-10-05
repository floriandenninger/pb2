package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asik extends aonm implements aooz {
    public static final asik a;
    private static volatile aopf f;
    public int b;
    public boolean c;
    public boolean d;
    public long e;

    static {
        asik asikVar = new asik();
        a = asikVar;
        aonm.registerDefaultInstance(asik.class, asikVar);
    }

    private asik() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\n\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဇ\u0002\nဂ\t", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new asik();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (asik.class) {
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
