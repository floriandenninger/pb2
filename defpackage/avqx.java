package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avqx extends aonm implements aooz {
    public static final avqx a;
    private static volatile aopf d;
    public int b;
    private aqyg e;
    private aqyg f;
    private apxf g;
    private aota h;
    private byte i = 2;
    public aomf c = aomf.b;

    static {
        avqx avqxVar = new avqx();
        a = avqxVar;
        aonm.registerDefaultInstance(avqx.class, avqxVar);
    }

    private avqx() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0003\r\u0005\u0000\u0000\u0004\u0003ᐉ\u0002\u0004ᐉ\u0003\u000bᐉ\t\fည\n\rᐉ\u0006", new Object[]{"b", "e", "f", "h", "c", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new avqx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (avqx.class) {
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
