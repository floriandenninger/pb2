package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awwj extends aonm implements aooz {
    public static final awwj a;
    private static volatile aopf f;
    public int b;
    public int c;
    public aoot d = aoot.a;
    public long e;

    static {
        awwj awwjVar = new awwj();
        a = awwjVar;
        aonm.registerDefaultInstance(awwj.class, awwjVar);
    }

    private awwj() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001ဌ\u0000\u00022\u0003ဂ\u0001", new Object[]{"b", "c", awwg.a(), "d", awwi.a, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new awwj();
            case NEW_BUILDER:
                return new aone((byte[]) null, (byte[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (awwj.class) {
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
