package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoub extends aonm implements aooz {
    public static final aoub a;
    private static volatile aopf c;
    public boolean b;
    private int d;

    static {
        aoub aoubVar = new aoub();
        a = aoubVar;
        aonm.registerDefaultInstance(aoub.class, aoubVar);
    }

    private aoub() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0011\u0011\u0001\u0000\u0000\u0000\u0011ဇ\u0007", new Object[]{"d", "b"});
            case NEW_MUTABLE_INSTANCE:
                return new aoub();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (aoub.class) {
                        aopfVar = c;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            c = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
