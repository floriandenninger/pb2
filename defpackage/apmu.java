package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apmu extends aonm implements aooz {
    public static final apmu a;
    private static volatile aopf g;
    public int b;
    public Object d;
    public long f;
    public int c = 0;
    public aomf e = aomf.b;

    static {
        apmu apmuVar = new apmu();
        a = apmuVar;
        aonm.registerDefaultInstance(apmu.class, apmuVar);
    }

    private apmu() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ည\u0000\u0002ဃ\u0001\u0003ျ\u0000\u0004ြ\u0000\u0005ျ\u0000", new Object[]{"d", "c", "b", "e", "f", asrh.class});
            case NEW_MUTABLE_INSTANCE:
                return new apmu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (apmu.class) {
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
