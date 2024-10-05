package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avwa extends aonm implements aooz {
    public static final avwa a;
    private static volatile aopf f;
    public int b;
    public aoyi c;
    public aowz e;
    private aota g;
    private byte h = 2;
    public aomf d = aomf.b;

    static {
        avwa avwaVar = new avwa();
        a = avwaVar;
        aonm.registerDefaultInstance(avwa.class, avwaVar);
    }

    private avwa() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ည\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "g", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new avwa();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (avwa.class) {
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
