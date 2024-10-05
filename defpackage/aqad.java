package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqad extends aonm implements aooz {
    public static final aqad a;
    private static volatile aopf f;
    public aony b = emptyProtobufList();
    public String c = "";
    public String d = "";
    public boolean e;
    private int g;

    static {
        aqad aqadVar = new aqad();
        a = aqadVar;
        aonm.registerDefaultInstance(aqad.class, aqadVar);
    }

    private aqad() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဈ\u0001\u0005ဇ\u0003", new Object[]{"g", "c", "b", avur.class, "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aqad();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aqad.class) {
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
