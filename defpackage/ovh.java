package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ovh extends aonm implements aooz {
    public static final ovh a;
    private static volatile aopf f;
    public aomf b = aomf.b;
    public aomf c = aomf.b;
    public aomf d = aomf.b;
    public int e;
    private int g;

    static {
        ovh ovhVar = new ovh();
        a = ovhVar;
        aonm.registerDefaultInstance(ovh.class, ovhVar);
    }

    private ovh() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ဌ\u0003", new Object[]{"g", "b", "c", "d", "e", apyu.i});
            case NEW_MUTABLE_INSTANCE:
                return new ovh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (ovh.class) {
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
