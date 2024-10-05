package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asgr extends aonm implements aooz {
    public static final asgr a;
    private static volatile aopf g;
    public int b;
    public String c = "";
    public awav d;
    public asht e;
    public int f;

    static {
        asgr asgrVar = new asgr();
        a = asgrVar;
        aonm.registerDefaultInstance(asgr.class, asgrVar);
    }

    private asgr() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဌ\u0003", new Object[]{"b", "c", "d", "e", "f", asaq.r});
            case NEW_MUTABLE_INSTANCE:
                return new asgr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (asgr.class) {
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
