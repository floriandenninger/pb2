package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auyr extends aonm implements aooz {
    public static final auyr a;
    private static volatile aopf h;
    public int b;
    public long c;
    public long d;
    public int e;
    public int f;
    public aomf g = aomf.b;

    static {
        auyr auyrVar = new auyr();
        a = auyrVar;
        aonm.registerDefaultInstance(auyr.class, auyrVar);
    }

    private auyr() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ည\u0004", new Object[]{"b", "c", "d", "e", auye.f, "f", aqkw.g, "g"});
            case NEW_MUTABLE_INSTANCE:
                return new auyr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (auyr.class) {
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
