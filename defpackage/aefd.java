package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aefd extends aonm implements aooz {
    public static final aefd a;
    private static volatile aopf g;
    public int b;
    public ajcb c;
    public double d;
    public double e;
    public double f;

    static {
        aefd aefdVar = new aefd();
        a = aefdVar;
        aonm.registerDefaultInstance(aefd.class, aefdVar);
    }

    private aefd() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002က\u0001\u0003က\u0003\u0004က\u0002", new Object[]{"b", "c", "d", "f", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aefd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aefd.class) {
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
