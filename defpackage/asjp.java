package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asjp extends aonm implements aooz {
    public static final asjp a;
    public static final aonk b;
    private static volatile aopf e;
    public aomf c = aomf.b;
    public aomf d = aomf.b;
    private int f;

    static {
        asjp asjpVar = new asjp();
        a = asjpVar;
        aonm.registerDefaultInstance(asjp.class, asjpVar);
        b = aonm.newSingularGeneratedExtension(apxf.a, asjpVar, asjpVar, null, 168118343, aoqn.MESSAGE, asjp.class);
    }

    private asjp() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"f", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new asjp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (asjp.class) {
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
