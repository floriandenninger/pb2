package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awmq extends aonm implements aooz {
    public static final awmq a;
    public static final aonk b;
    private static volatile aopf d;
    public aony c = emptyProtobufList();

    static {
        awmq awmqVar = new awmq();
        a = awmqVar;
        aonm.registerDefaultInstance(awmq.class, awmqVar);
        b = aonm.newSingularGeneratedExtension(awmp.a, awmqVar, awmqVar, null, 1, aoqn.MESSAGE, awmq.class);
    }

    private awmq() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"c", awmr.class});
            case NEW_MUTABLE_INSTANCE:
                return new awmq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (awmq.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
