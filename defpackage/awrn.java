package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awrn extends aonm implements aooz {
    public static final awrn a;
    public static final aonk b;
    private static volatile aopf d;
    public String c = "";
    private int e;

    static {
        awrn awrnVar = new awrn();
        a = awrnVar;
        aonm.registerDefaultInstance(awrn.class, awrnVar);
        b = aonm.newSingularGeneratedExtension(awnw.a, awrnVar, awrnVar, null, 315254111, aoqn.MESSAGE, awrn.class);
    }

    private awrn() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"e", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new awrn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (awrn.class) {
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
