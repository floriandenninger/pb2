package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awwr extends aonm implements aooz {
    public static final awwr a;
    private static volatile aopf f;
    public int b;
    public boolean d;
    public aoot c = aoot.a;
    public long e = -1;

    static {
        awwr awwrVar = new awwr();
        a = awwrVar;
        aonm.registerDefaultInstance(awwr.class, awwrVar);
    }

    private awwr() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u00012\u0002ဇ\u0000\u0003ဂ\u0001", new Object[]{"b", "c", awwq.a, "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new awwr();
            case NEW_BUILDER:
                return new aone((float[]) null, (float[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (awwr.class) {
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
