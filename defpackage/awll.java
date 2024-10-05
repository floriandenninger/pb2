package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awll extends aonm implements aooz {
    public static final awll a;
    private static volatile aopf d;
    public int b = 0;
    public Object c;

    static {
        awll awllVar = new awll();
        a = awllVar;
        aonm.registerDefaultInstance(awll.class, awllVar);
    }

    private awll() {
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
                return newMessageInfo(a, "\u0001\b\u0001\u0000\u0001\n\b\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0004ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000", new Object[]{"c", "b", awlc.class, awkt.class, awli.class, awkm.class, awkp.class, awlo.class, awlq.class, awma.class});
            case NEW_MUTABLE_INSTANCE:
                return new awll();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (awll.class) {
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
