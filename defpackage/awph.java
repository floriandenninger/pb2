package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awph extends aonm implements aooz {
    public static final awph a;
    private static volatile aopf g;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public int f;

    static {
        awph awphVar = new awph();
        a = awphVar;
        aonm.registerDefaultInstance(awph.class, awphVar);
    }

    private awph() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ျ\u0000\u0002ွ\u0000\u0003ြ\u0000\u0004ဋ\u0003\u0005ဋ\u0004", new Object[]{"d", "c", "b", awpe.class, "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new awph();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (awph.class) {
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
