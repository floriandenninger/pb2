package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awkm extends aonm implements aooz {
    public static final awkm a;
    private static volatile aopf f;
    public int c;
    private int g;
    public String b = "";
    public String d = "";
    public aomf e = aomf.b;

    static {
        awkm awkmVar = new awkm();
        a = awkmVar;
        aonm.registerDefaultInstance(awkm.class, awkmVar);
    }

    private awkm() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ည\u0003", new Object[]{"g", "b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new awkm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (awkm.class) {
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
