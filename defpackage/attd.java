package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class attd extends aonm implements aooz {
    public static final attd a;
    private static volatile aopf f;
    public int b;
    public int c = 0;
    public Object d;
    public long e;

    static {
        attd attdVar = new attd();
        a = attdVar;
        aonm.registerDefaultInstance(attd.class, attdVar);
    }

    private attd() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဃ\u0000\u0002ျ\u0000\u0003ြ\u0000", new Object[]{"d", "c", "b", "e", asrh.class});
            case NEW_MUTABLE_INSTANCE:
                return new attd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (attd.class) {
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
