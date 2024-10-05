package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoid extends aonm implements aooz {
    public static final aoid a;
    private static volatile aopf d;
    public int b = 0;
    public Object c;

    static {
        aoid aoidVar = new aoid();
        a = aoidVar;
        aonm.registerDefaultInstance(aoid.class, aoidVar);
    }

    private aoid() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002ဿ\u0000", new Object[]{"c", "b", aogu.u});
            case NEW_MUTABLE_INSTANCE:
                return new aoid();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aoid.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
