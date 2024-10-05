package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aueu extends aonm implements aooz {
    public static final aueu a;
    private static volatile aopf e;
    public int b;
    public int c;
    public int d;
    private int f;

    static {
        aueu aueuVar = new aueu();
        a = aueuVar;
        aonm.registerDefaultInstance(aueu.class, aueuVar);
    }

    private aueu() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"f", "b", aufb.b, "c", asmn.a(), "d", asmn.a()});
            case NEW_MUTABLE_INSTANCE:
                return new aueu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aueu.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
