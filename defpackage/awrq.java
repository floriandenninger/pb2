package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awrq extends aonm implements aooz {
    public static final awrq a;
    public static final aonk b;
    private static volatile aopf e;
    public int c;
    public String d = "";

    static {
        awrq awrqVar = new awrq();
        a = awrqVar;
        aonm.registerDefaultInstance(awrq.class, awrqVar);
        b = aonm.newSingularGeneratedExtension(awpr.a, awrqVar, awrqVar, null, 284051629, aoqn.MESSAGE, awrq.class);
    }

    private awrq() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new awrq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (awrq.class) {
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
