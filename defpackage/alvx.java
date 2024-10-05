package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alvx extends aonm implements aooz {
    public static final alvx a;
    private static volatile aopf c;
    public int b = 1;
    private int d;

    static {
        alvx alvxVar = new alvx();
        a = alvxVar;
        aonm.registerDefaultInstance(alvx.class, alvxVar);
    }

    private alvx() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0003", new Object[]{"d", "b", aduo.k});
            case NEW_MUTABLE_INSTANCE:
                return new alvx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (alvx.class) {
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
