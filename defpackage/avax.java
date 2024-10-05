package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avax extends aonm implements aooz {
    public static final avax a;
    public static final aonk b;
    private static volatile aopf e;
    public int c;
    public boolean d;
    private int f;

    static {
        avax avaxVar = new avax();
        a = avaxVar;
        aonm.registerDefaultInstance(avax.class, avaxVar);
        b = aonm.newSingularGeneratedExtension(avbb.a, avaxVar, avaxVar, null, 322606150, aoqn.MESSAGE, avax.class);
    }

    private avax() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"f", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new avax();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (avax.class) {
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
