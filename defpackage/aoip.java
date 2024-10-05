package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoip extends aonm implements aooz {
    public static final aoip a;
    private static volatile aopf g;
    public int b;
    public long d;
    public long f;
    public String c = "";
    public String e = "";

    static {
        aoip aoipVar = new aoip();
        a = aoipVar;
        aonm.registerDefaultInstance(aoip.class, aoipVar);
    }

    private aoip() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0003\u0003ဂ\u0002\u0004ဂ\u0004", new Object[]{"b", "c", "e", "d", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aoip();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aoip.class) {
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
