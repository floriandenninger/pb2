package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avqo extends aonm implements aooz {
    public static final avqo a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private aqyg f;
    private apxf g;
    private aota h;
    private byte i = 2;

    static {
        avqo avqoVar = new avqo();
        a = avqoVar;
        aonm.registerDefaultInstance(avqo.class, avqoVar);
    }

    private avqo() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\b\u0005\u0000\u0000\u0005\u0002ᐉ\u0002\u0005ᐉ\b\u0006ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u0006", new Object[]{"c", "d", "h", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new avqo();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avqo.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
