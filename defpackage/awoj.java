package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awoj extends aonm implements aooz {
    public static final awoj a;
    private static volatile aopf d;
    public int b = 0;
    public Object c;

    static {
        awoj awojVar = new awoj();
        a = awojVar;
        aonm.registerDefaultInstance(awoj.class, awojVar);
    }

    private awoj() {
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
                return newMessageInfo(a, "\u0001\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001ဿ\u0000\u0002ဴ\u0000\u0003ျ\u0000\u0004်\u0000\u0005ွ\u0000\u0006ြ\u0000\u0007ြ\u0000\b့\u0000\tှ\u0000", new Object[]{"c", "b", awnx.c, awoi.class, awod.class});
            case NEW_MUTABLE_INSTANCE:
                return new awoj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (awoj.class) {
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
