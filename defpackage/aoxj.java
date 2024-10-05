package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoxj extends aonm implements aooz {
    public static final aoxj a;
    private static volatile aopf g;
    public int b;
    public int c;
    public int d;
    public int e;
    public String f = "";

    static {
        aoxj aoxjVar = new aoxj();
        a = aoxjVar;
        aonm.registerDefaultInstance(aoxj.class, aoxjVar);
    }

    private aoxj() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0005ဈ\u0004", new Object[]{"b", "c", argn.k, "d", argn.l, "e", argn.m, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aoxj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aoxj.class) {
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
