package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asqu extends aonm implements aooz {
    public static final asqu a;
    private static volatile aopf j;
    public int b;
    public aqyg c;
    public aqyg d;
    public arfs e;
    public boolean f;
    public apxf g;
    private aota k;
    private byte l = 2;
    public String h = "";
    public aomf i = aomf.b;

    static {
        asqu asquVar = new asqu();
        a = asquVar;
        aonm.registerDefaultInstance(asqu.class, asquVar);
    }

    private asqu() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ဇ\u0003\u0006ᐉ\u0004\bဈ\u0005\tᐉ\u0006\nည\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "k", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new asqu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (asqu.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
