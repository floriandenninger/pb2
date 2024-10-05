package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asxp extends aonm implements aooz {
    public static final asxp a;
    public static final aonk b;
    private static volatile aopf d;
    public int c;
    private int e;

    static {
        asxp asxpVar = new asxp();
        a = asxpVar;
        aonm.registerDefaultInstance(asxp.class, asxpVar);
        b = aonm.newSingularGeneratedExtension(atpo.b, asxpVar, asxpVar, null, 396373871, aoqn.MESSAGE, asxp.class);
    }

    private asxp() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"e", "c", atrx.a()});
            case NEW_MUTABLE_INSTANCE:
                return new asxp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (asxp.class) {
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
