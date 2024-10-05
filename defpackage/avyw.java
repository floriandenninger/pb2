package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avyw extends aonh implements aoni {
    public static final avyw a;
    private static volatile aopf j;
    private aqyg A;
    private aqyg B;
    private apmn C;
    private avyt D;
    private aqyg E;
    private aota F;
    private avyy G;
    private avyu H;
    private avyx I;

    /* renamed from: J, reason: collision with root package name */
    private apxf f135J;
    public int b;
    public aqyg c;
    public aqyg d;
    public aqyg e;
    public aqyg h;
    public asnj i;
    private int k;
    private apkd m;
    private apkd n;
    private aqyg o;
    private avyz p;
    private aqyg q;
    private aqyg r;
    private avyv s;
    private aqyg t;
    private aqyg u;
    private aqyg v;
    private aqyg w;
    private aqyg x;
    private aqyg y;
    private aqyg z;
    private byte K = 2;
    public boolean f = true;
    public boolean g = true;

    static {
        avyw avywVar = new avyw();
        a = avywVar;
        aonm.registerDefaultInstance(avyw.class, avywVar);
    }

    private avyw() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.K);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.K = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u001f\u0000\u0002\u00013\u001f\u0000\u0000\u001d\u0001ᐉ\u0002\u0002ᐉ\u0004\u0003ᐉ\u0007\u0004ᐉ\u000b\u0005ᐉ\r\u0006ᐉ\n\u0007ᐉ\f\bဇ\u0017\tဇ\u0018\nᐉ\u0019\rᐉ\u001d\u000fᐉ$\u0011ᐉ#\u0012ᐉ\u0006\u0014ᐉ&\u0015ᐉ'\u0016ᐉ\u0005\u0019ᐉ)\u001eᐉ\u001e\u001fᐉ!!ᐉ\u0003\"ᐉ\u0000#ᐉ\u0001%ᐉ\u000f)ᐉ+*ᐉ\b-ᐉ\u001a.ᐉ\u0010/ᐉ\u00112ᐉ\u00153ᐉ\u0012", new Object[]{"b", "k", "c", "d", "r", "u", "e", "t", "v", "f", "g", "h", "i", "F", "E", "q", "G", "H", "p", "I", "C", "D", "o", "m", "n", "w", "J", "s", "B", "x", "y", "A", "z"});
            case NEW_MUTABLE_INSTANCE:
                return new avyw();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (avyw.class) {
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
