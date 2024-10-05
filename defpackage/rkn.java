package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rkn extends aonm implements aooz {
    public static final rkn a;
    private static volatile aopf f;
    public int b;
    public int c;
    public aony d = emptyProtobufList();
    public aony e = emptyProtobufList();

    static {
        rkn rknVar = new rkn();
        a = rknVar;
        aonm.registerDefaultInstance(rkn.class, rknVar);
    }

    private rkn() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b", new Object[]{"b", "c", "d", rkr.class, "e", rko.class});
            case NEW_MUTABLE_INSTANCE:
                return new rkn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (rkn.class) {
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
