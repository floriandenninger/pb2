package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asue extends aonm implements aooz {
    public static final asue a;
    public static final aonk b;
    private static volatile aopf f;
    public int c;
    public int d;
    private aota g;
    private byte h = 2;
    public aomf e = aomf.b;

    static {
        asue asueVar = new asue();
        a = asueVar;
        aonm.registerDefaultInstance(asue.class, asueVar);
        b = aonm.newSingularGeneratedExtension(awnw.a, asueVar, asueVar, null, 241780379, aoqn.MESSAGE, asue.class);
    }

    private asue() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဌ\u0000\u0002ည\u0001\u0003ᐉ\u0002", new Object[]{"c", "d", aqkw.q, "e", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new asue();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (asue.class) {
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
