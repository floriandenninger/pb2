package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ardc extends aonm implements aooz {
    public static final ardc a;
    private static volatile aopf m;
    public int b;
    public aqyg c;
    public auul d;
    public apxf f;
    public aqyg g;
    public aqyg h;
    public apkd i;
    public atdf j;
    public aswa k;
    private apxf n;
    private apkd o;
    private aulq p;
    private aota q;
    private byte r = 2;
    public aony e = emptyProtobufList();
    public aomf l = aomf.b;

    static {
        ardc ardcVar = new ardc();
        a = ardcVar;
        aonm.registerDefaultInstance(ardc.class, ardcVar);
    }

    private ardc() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.r);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u0012\u000e\u0000\u0001\f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0007\bᐉ\t\tᐉ\u000b\nည\f\u000bЛ\rᐉ\u0003\u000eᐉ\b\u000fᐉ\u0006\u0012ဉ\n", new Object[]{"b", "c", "d", "f", "g", "h", "i", "j", "q", "l", "e", avfv.class, "n", "p", "o", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new ardc();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (ardc.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            m = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
