package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awti extends aonm implements aooz {
    public static final awti a;
    private static volatile aopf h;
    public int b;
    public aonp c = emptyDoubleList();
    public aonp d = emptyDoubleList();
    public awtj e;
    public awtm f;
    public awto g;

    static {
        awti awtiVar = new awti();
        a = awtiVar;
        aonm.registerDefaultInstance(awti.class, awtiVar);
    }

    private awti() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0002\u0000\u0001\u0012\u0002\u0012\u0004ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new awti();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (awti.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
