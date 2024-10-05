package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qej extends aonm implements aooz {
    public static final qej a;
    private static volatile aopf e;
    public int b;
    public aony c = emptyProtobufList();
    public aony d;
    private int f;

    static {
        qej qejVar = new qej();
        a = qejVar;
        aonm.registerDefaultInstance(qej.class, qejVar);
    }

    private qej() {
        emptyProtobufList();
        this.d = emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0002\u0000\u0001ဌ\u0000\u0002\u001b\u0004\u001b", new Object[]{"f", "b", dvg.q, "c", qeg.class, "d", qei.class});
            case NEW_MUTABLE_INSTANCE:
                return new qej();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (qej.class) {
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
