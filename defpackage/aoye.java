package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoye extends aonm implements aooz {
    public static final aoye a;
    private static volatile aopf g;
    public int b;
    public int d;
    public boolean f;
    public String c = "";
    public aony e = emptyProtobufList();

    static {
        aoye aoyeVar = new aoye();
        a = aoyeVar;
        aonm.registerDefaultInstance(aoye.class, aoyeVar);
    }

    private aoye() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003\u001b\u0004ဇ\u0002", new Object[]{"b", "c", "d", "e", asur.class, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aoye();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aoye.class) {
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
