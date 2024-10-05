package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aptm extends aonh implements aoni {
    public static final aptm a;
    private static volatile aopf n;
    public int b;
    public Object d;
    public aqyg e;
    public apxf f;
    public atdf g;
    public aqyg h;
    public int i;
    public aqyg j;
    public aqyg k;
    private aqyg o;
    private apxf p;
    private aqyg q;
    private apmh r;
    private aota s;
    private aqyg t;
    public int c = 0;
    private byte u = 2;
    public aomf m = aomf.b;

    static {
        aptm aptmVar = new aptm();
        a = aptmVar;
        aonm.registerDefaultInstance(aptm.class, aptmVar);
    }

    private aptm() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.u);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.u = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0010\u0001\u0001\u0001\u0014\u0010\u0000\u0000\u000e\u0001ᐉ\u0000\u0002ᐼ\u0000\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\u0007ည\u0011\bᐉ\u0012\tဌ\u0007\nᐉ\b\u000bᐉ\t\fᐼ\u0000\rᐉ\u0013\u000eᐉ\f\u0010ᐉ\u000f\u0012ᐉ\r\u0014ᐉ\n", new Object[]{"d", "c", "b", "e", avgg.class, "f", "g", "h", "m", "s", "i", apqr.h, "j", "k", arfs.class, "t", "p", "r", "q", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new aptm();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = n;
                if (aopfVar == null) {
                    synchronized (aptm.class) {
                        aopfVar = n;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            n = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
