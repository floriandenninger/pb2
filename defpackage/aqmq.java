package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqmq extends aonm implements aooz {
    public static final aqmq a;
    public static final aonk b;
    private static volatile aopf d;
    public float c;
    private int e;

    static {
        aqmq aqmqVar = new aqmq();
        a = aqmqVar;
        aonm.registerDefaultInstance(aqmq.class, aqmqVar);
        b = aonm.newSingularGeneratedExtension(awpg.a, aqmqVar, aqmqVar, null, 339295757, aoqn.MESSAGE, aqmq.class);
    }

    private aqmq() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"e", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new aqmq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aqmq.class) {
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
