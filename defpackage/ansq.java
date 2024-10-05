package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ansq extends aonm implements aooz {
    public static final ansq a;
    private static volatile aopf f;
    public int b;
    public int c = 0;
    public Object d;
    public long e;

    static {
        ansq ansqVar = new ansq();
        a = ansqVar;
        aonm.registerDefaultInstance(ansq.class, ansqVar);
    }

    private ansq() {
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
                return newMessageInfo(a, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဃ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000", new Object[]{"d", "c", "b", "e", ansi.class, ansg.class, ansk.class, ansc.class, ansp.class, anso.class, ansn.class});
            case NEW_MUTABLE_INSTANCE:
                return new ansq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (ansq.class) {
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
