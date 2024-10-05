package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoku extends aonm implements aooz {
    public static final aoku a;
    private static volatile aopf e;
    public int b;
    public long c;
    public aokt d;
    private int f;

    static {
        aoku aokuVar = new aoku();
        a = aokuVar;
        aonm.registerDefaultInstance(aoku.class, aokuVar);
    }

    private aoku() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဉ\u0002", new Object[]{"f", "b", aokr.a, "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aoku();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aoku.class) {
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
