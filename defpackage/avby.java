package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avby extends aonm implements aooz {
    public static final avby a;
    private static volatile aopf g;
    public int b;
    public aqyg c;
    public apxf d;
    public boolean f;
    private aota h;
    private byte i = 2;
    public aomf e = aomf.b;

    static {
        avby avbyVar = new avby();
        a = avbyVar;
        aonm.registerDefaultInstance(avby.class, avbyVar);
    }

    private avby() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0003\u0005ည\u0004\u0006ဇ\u0005", new Object[]{"b", "c", "d", "h", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new avby();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (avby.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
