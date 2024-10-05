package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aupr extends aonm implements aooz {
    public static final aupr a;
    private static volatile aopf f;
    public int b;
    public aqyg c;
    private aota g;
    private byte h = 2;
    public aony d = emptyProtobufList();
    public aomf e = aomf.b;

    static {
        aupr auprVar = new aupr();
        a = auprVar;
        aonm.registerDefaultInstance(aupr.class, auprVar);
    }

    private aupr() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0003\u0001ᐉ\u0000\u0002Л\u0005ᐉ\u0002\u0006ည\u0003", new Object[]{"b", "c", "d", aupw.class, "g", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aupr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aupr.class) {
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
