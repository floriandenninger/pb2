package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class augv extends aonm implements aooz {
    public static final augv a;
    private static volatile aopf f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        augv augvVar = new augv();
        a = augvVar;
        aonm.registerDefaultInstance(augv.class, augvVar);
    }

    private augv() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဌ\u0002", new Object[]{"b", "c", augq.a(), "d", "e", augr.a()});
            case NEW_MUTABLE_INSTANCE:
                return new augv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (augv.class) {
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
