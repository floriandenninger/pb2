package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awga extends aonm implements aooz {
    public static final awga a;
    private static volatile aopf e;
    public int b;
    public aomf c = aomf.b;
    public int d;

    static {
        awga awgaVar = new awga();
        a = awgaVar;
        aonm.registerDefaultInstance(awga.class, awgaVar);
    }

    private awga() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဌ\u0001", new Object[]{"b", "c", "d", aweb.i});
            case NEW_MUTABLE_INSTANCE:
                return new awga();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (awga.class) {
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
