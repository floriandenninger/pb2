package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class argf extends aonm implements aooz {
    public static final argf a;
    private static volatile aopf g;
    public int b;
    public double c;
    public double d;
    public double e = 1.0d;
    public double f = 1.0d;

    static {
        argf argfVar = new argf();
        a = argfVar;
        aonm.registerDefaultInstance(argf.class, argfVar);
    }

    private argf() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003က\u0002\u0004က\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new argf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (argf.class) {
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
