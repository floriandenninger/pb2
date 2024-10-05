package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ovp extends aonm implements aooz {
    public static final ovp a;
    private static volatile aopf f;
    public int b;
    public aomf c = aomf.b;
    public aomf d = aomf.b;
    public int e;

    static {
        ovp ovpVar = new ovp();
        a = ovpVar;
        aonm.registerDefaultInstance(ovp.class, ovpVar);
    }

    private ovp() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0000\u0000\u0004ည\u0000\u0005ည\u0001\u0006ဌ\u0002", new Object[]{"b", "c", "d", "e", apyu.i});
            case NEW_MUTABLE_INSTANCE:
                return new ovp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (ovp.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
