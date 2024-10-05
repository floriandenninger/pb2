package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aefh extends aonm implements aooz {
    public static final aefh a;
    private static volatile aopf g;
    public ajcb b;
    public String c = "";
    public aomf d = aomf.b;
    public int e;
    public int f;
    private int h;

    static {
        aefh aefhVar = new aefh();
        a = aefhVar;
        aonm.registerDefaultInstance(aefh.class, aefhVar);
    }

    private aefh() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဍ\u0003\u0005ဍ\u0004", new Object[]{"h", "b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aefh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aefh.class) {
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
