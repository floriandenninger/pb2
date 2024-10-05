package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asul extends aonh implements aoni {
    public static final asul a;
    public static final aonk b;
    private static volatile aopf d;
    private int e;
    private byte f = 2;
    public aomf c = aomf.b;

    static {
        asul asulVar = new asul();
        a = asulVar;
        aonm.registerDefaultInstance(asul.class, asulVar);
        b = aonm.newSingularGeneratedExtension(awpr.a, asulVar, asulVar, null, 169494678, aoqn.MESSAGE, asul.class);
    }

    private asul() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"e", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new asul();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (asul.class) {
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
