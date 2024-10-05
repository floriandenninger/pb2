package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auoi extends aonm implements aooz {
    public static final auoi a;
    private static volatile aopf p;
    public int b;
    public Object d;
    public Object f;
    public int g;
    public aqyg h;
    public aqyg i;
    public aott k;
    public boolean l;
    public arfs m;
    public auoh n;
    public boolean o;
    private aota q;
    public int c = 0;
    public int e = 0;
    private byte r = 2;
    public aomf j = aomf.b;

    static {
        auoi auoiVar = new auoi();
        a = auoiVar;
        aonm.registerDefaultInstance(auoi.class, auoiVar);
    }

    private auoi() {
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
                return newMessageInfo(a, "\u0001\u000e\u0002\u0001\u0001\u000e\u000e\u0000\u0000\b\u0001ᐼ\u0000\u0002ျ\u0000\u0003ဌ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐼ\u0001\u0007ᐉ\u0007\bည\b\tဉ\t\nဇ\n\u000bᐼ\u0001\fᐉ\u000b\rᐉ\f\u000eဇ\r", new Object[]{"d", "c", "f", "e", "b", avgg.class, "g", apqx.a(), "h", "i", apxf.class, "q", "j", "k", "l", auoj.class, "m", "n", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new auoi();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = p;
                if (aopfVar == null) {
                    synchronized (auoi.class) {
                        aopfVar = p;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            p = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
