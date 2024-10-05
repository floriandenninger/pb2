package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoix extends aonm implements aooz {
    public static final aoix a;
    private static volatile aopf g;
    public int b;
    public String c = "";
    public aony d = aonm.emptyProtobufList();
    public aony e = emptyProtobufList();
    public aoko f;

    static {
        aoix aoixVar = new aoix();
        a = aoixVar;
        aonm.registerDefaultInstance(aoix.class, aoixVar);
    }

    private aoix() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001b\u0004ဉ\u0001", new Object[]{"b", "c", "d", "e", aojt.class, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aoix();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aoix.class) {
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
