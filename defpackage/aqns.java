package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqns extends aonm implements aooz {
    public static final aqns a;
    public static final aonk b;
    private static volatile aopf e;
    public int c;
    public int d;

    static {
        aqns aqnsVar = new aqns();
        a = aqnsVar;
        aonm.registerDefaultInstance(aqns.class, aqnsVar);
        b = aonm.newSingularGeneratedExtension(awas.a, aqnsVar, aqnsVar, null, 337527695, aoqn.MESSAGE, aqns.class);
    }

    private aqns() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "d", awjd.a()});
            case NEW_MUTABLE_INSTANCE:
                return new aqns();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aqns.class) {
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
