package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arvq extends aonm implements aooz {
    public static final arvq a;
    private static volatile aopf e;
    public int b;
    public int c;
    public aruw d;

    static {
        arvq arvqVar = new arvq();
        a = arvqVar;
        aonm.registerDefaultInstance(arvq.class, arvqVar);
    }

    private arvq() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဉ\u0002", new Object[]{"b", "c", armv.n, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new arvq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (arvq.class) {
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
