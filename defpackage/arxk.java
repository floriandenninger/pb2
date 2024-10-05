package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arxk extends aonm implements aooz {
    public static final arxk a;
    private static volatile aopf f;
    public int b;
    public int c;
    public aony d = emptyProtobufList();
    public aomf e = aomf.b;
    private int g;

    static {
        arxk arxkVar = new arxk();
        a = arxkVar;
        aonm.registerDefaultInstance(arxk.class, arxkVar);
    }

    private arxk() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002င\u0001\u0003\u001b\u0004ည\u0002", new Object[]{"g", "b", armv.q, "c", "d", arxi.class, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new arxk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (arxk.class) {
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
