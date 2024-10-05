package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aodl extends aonm implements aooz {
    public static final aodl a;
    private static volatile aopf f;
    public int b;
    public int c;
    public int d;
    private aoot g = aoot.a;
    public String e = "";

    static {
        aodl aodlVar = new aodl();
        a = aodlVar;
        aonm.registerDefaultInstance(aodl.class, aodlVar);
    }

    private aodl() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0006\u0010\u0004\u0001\u0000\u0000\u0006င\u0005\u0007င\u0006\b2\u0010ဈ\u000e", new Object[]{"b", "c", "d", "g", aodk.a, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aodl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aodl.class) {
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
