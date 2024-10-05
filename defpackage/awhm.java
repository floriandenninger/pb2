package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awhm extends aonm implements aooz {
    public static final awhm a;
    private static volatile aopf g;
    public long b;
    public String c = "";
    public long d;
    public long e;
    public long f;
    private int h;

    static {
        awhm awhmVar = new awhm();
        a = awhmVar;
        aonm.registerDefaultInstance(awhm.class, awhmVar);
    }

    private awhm() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"h", "b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new awhm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (awhm.class) {
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
