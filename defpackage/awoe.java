package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awoe extends aonm implements aooz {
    public static final awoe a;
    public static final aonk b;
    private static volatile aopf e;
    public aony c = emptyProtobufList();
    public int d;
    private int f;

    static {
        awoe awoeVar = new awoe();
        a = awoeVar;
        aonm.registerDefaultInstance(awoe.class, awoeVar);
        b = aonm.newSingularGeneratedExtension(awoc.a, awoeVar, awoeVar, null, 188490103, aoqn.MESSAGE, awoe.class);
    }

    private awoe() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"f", "c", awof.class, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new awoe();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (awoe.class) {
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
