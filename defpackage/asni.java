package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asni extends aonh implements aoni {
    public static final asni a;
    private static volatile aopf q;
    public int b;
    public asnp c;
    public int d;
    public int e;
    public aqyg f;
    public aqyg g;
    public aqyg h;
    public int i;
    public aqyg j;
    public aqyg k;
    public aqyg m;
    public boolean o;
    private aqyg r;
    private aqyg s;
    private aota t;
    private apxf u;
    private apxf v;
    private byte w = 2;
    public aomf n = aomf.b;
    public aony p = emptyProtobufList();

    static {
        asni asniVar = new asni();
        a = asniVar;
        aonm.registerDefaultInstance(asni.class, asniVar);
    }

    private asni() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.w);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.w = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0001\f\u0001ဉ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007င\u0007\bᐉ\b\tᐉ\t\nᐉ\n\u000bည\f\rဇ\r\u000eᐉ\u000e\u000fЛ\u0010ᐉ\u000f\u0011ᐉ\u0010\u0013ᐉ\u0006\u0014ᐉ\u000b", new Object[]{"b", "c", "d", asno.a(), "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "t", "p", apxf.class, "u", "v", "r", "s"});
            case NEW_MUTABLE_INSTANCE:
                return new asni();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = q;
                if (aopfVar == null) {
                    synchronized (asni.class) {
                        aopfVar = q;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            q = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
