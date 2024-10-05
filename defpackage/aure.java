package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aure extends aonm implements aooz {
    public static final aure a;
    private static volatile aopf g;
    public int b;
    public int e;
    public String c = "";
    public String d = "";
    public String f = "";

    static {
        aure aureVar = new aure();
        a = aureVar;
        aonm.registerDefaultInstance(aure.class, aureVar);
    }

    private aure() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဈ\u0003", new Object[]{"b", "c", "d", "e", aurg.a(), "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aure();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aure.class) {
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
