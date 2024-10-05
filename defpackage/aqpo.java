package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqpo extends aonm implements aooz {
    public static final aqpo a;
    private static volatile aopf f;
    public int b;
    public aony c = emptyProtobufList();
    public int d;
    public aqcr e;

    static {
        aqpo aqpoVar = new aqpo();
        a = aqpoVar;
        aonm.registerDefaultInstance(aqpo.class, aqpoVar);
    }

    private aqpo() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003ဉ\u0001", new Object[]{"b", "c", aqpn.class, "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aqpo();
            case NEW_BUILDER:
                return new aone((float[][]) null, (int[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aqpo.class) {
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
