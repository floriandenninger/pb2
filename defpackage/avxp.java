package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avxp extends aonm implements aooz {
    public static final avxp a;
    private static volatile aopf d;
    public int b;
    public aony c = aonm.emptyProtobufList();
    private int e;

    static {
        avxp avxpVar = new avxp();
        a = avxpVar;
        aonm.registerDefaultInstance(avxp.class, avxpVar);
    }

    private avxp() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001a", new Object[]{"e", "b", avwx.a(), "c"});
            case NEW_MUTABLE_INSTANCE:
                return new avxp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (avxp.class) {
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
