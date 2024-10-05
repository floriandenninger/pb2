package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awyw extends aonm implements aooz {
    public static final awyw a;
    private static volatile aopf f;
    public String b = "";
    public String c = "";
    public aony d = emptyProtobufList();
    public aomf e = aomf.b;

    static {
        awyw awywVar = new awyw();
        a = awywVar;
        aonm.registerDefaultInstance(awyw.class, awywVar);
    }

    private awyw() {
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
                return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\n", new Object[]{"b", "c", "d", awyv.class, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new awyw();
            case NEW_BUILDER:
                return new aone((int[][]) null, (int[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (awyw.class) {
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
