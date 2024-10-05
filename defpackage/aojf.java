package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aojf extends aonm implements aooz {
    public static final aojf a;
    private static volatile aopf g;
    public int b;
    public String c = "";
    public aony d = emptyProtobufList();
    public aojt e;
    public aoko f;

    static {
        aojf aojfVar = new aojf();
        a = aojfVar;
        aonm.registerDefaultInstance(aojf.class, aojfVar);
    }

    private aojf() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"b", "c", "d", aojl.class, "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aojf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aojf.class) {
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
