package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aupi extends aonm implements aooz {
    public static final aupi a;
    private static volatile aopf e;
    public int b = 0;
    public Object c;
    public auqx d;
    private int f;

    static {
        aupi aupiVar = new aupi();
        a = aupiVar;
        aonm.registerDefaultInstance(aupi.class, aupiVar);
    }

    private aupi() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ျ\u0000\u0003်\u0000\u0004ဵ\u0000", new Object[]{"c", "b", "f", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aupi();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aupi.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
