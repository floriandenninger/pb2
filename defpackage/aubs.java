package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aubs extends aonh implements aoni {
    private static volatile aopf C;
    public static final aubs a;
    public static final aonk b;
    public apmk A;
    public arfs B;
    private apxf D;
    private aqyg E;
    private aota F;
    private apgx G;
    private aqyg H;
    private aubo I;

    /* renamed from: J, reason: collision with root package name */
    private aubu f123J;
    private apxf K;
    public int c;
    public int d;
    public Object f;
    public aqyg h;
    public int j;
    public int m;
    public aqyg n;
    public aqyg o;
    public aqyg p;
    public aqyg q;
    public boolean r;
    public asnj u;
    public int w;
    public aony x;
    public aubq y;
    public atdf z;
    public int e = 0;
    private byte L = 2;
    public String g = "";
    public aony i = emptyProtobufList();
    public String k = "";
    public String s = "";
    public aomf t = aomf.b;
    public aony v = emptyProtobufList();

    static {
        aubs aubsVar = new aubs();
        a = aubsVar;
        aonm.registerDefaultInstance(aubs.class, aubsVar);
        b = aonm.newSingularGeneratedExtension(aulp.a, aubsVar, aubsVar, null, 50631000, aoqn.MESSAGE, aubs.class);
    }

    private aubs() {
        emptyProtobufList();
        this.x = emptyProtobufList();
    }

    public final void a() {
        aony aonyVar = this.i;
        if (aonyVar.c()) {
            return;
        }
        this.i = aonm.mutableCopy(aonyVar);
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.L);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.L = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u001e\u0001\u0002\u0001'\u001e\u0000\u0003\u0016\u0001ဈ\u0000\u0002Л\u0003င\u0003\u0005ဈ\u0005\u0006င\u0006\u0007ᐉ\t\bဇ\f\nᐉ\u0011\rဈ\u0010\u000eᐉ\u0013\u000fЛ\u0010ᐉ\n\u0011ᐉ\u000b\u0012ᐉ\u0007\u0013ဌ\u0014\u0014ည\u0012\u0016ᐉ\u0001\u0018ᐉ\u0002\u0019ᐉ\u0015\u001aᐉ\u0016\u001cᐉ\u0017\u001dᐉ\u0018\u001eᐉ\u0019\u001fᐉ\u001a ᐉ\u001b\"ᐼ\u0000#Л$ᐉ\b%ᐉ\u001e'ᐉ ", new Object[]{"f", "e", "c", "d", "g", "i", aubr.class, "j", "k", "m", "o", "r", "F", "s", "u", "v", aubx.class, "p", "q", "n", "w", atxj.o, "t", "h", "D", "y", "z", "G", "H", "I", "A", "J", aulq.class, "x", apjt.class, "E", "K", "B"});
            case NEW_MUTABLE_INSTANCE:
                return new aubs();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = C;
                if (aopfVar == null) {
                    synchronized (aubs.class) {
                        aopfVar = C;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            C = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
