package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avzv extends aonh implements aoni {
    private static volatile aopf F;
    public static final avzv a;
    public avzs A;
    public avzs B;
    public avzs C;
    public avwi D;
    public aomf E;
    private aqyg G;
    private aqyg H;
    private aqyg I;

    /* renamed from: J, reason: collision with root package name */
    private apbz f136J;
    private askm K;
    private apxf L;
    private aulq M;
    private avzt N;
    private apxf O;
    private aota P;
    public int b;
    public int c;
    public Object e;
    public avgg g;
    public aqyg h;
    public aqyg i;
    public aqyg j;
    public aqyg k;
    public aqyg m;
    public aqyg n;
    public apxf o;
    public aony p;
    public apkd q;
    public apkd r;
    public apkd s;
    public avrx t;
    public avzu u;
    public atdf v;
    public boolean w;
    public aony x;
    public avzw y;
    public avzs z;
    public int d = 0;
    private byte Q = 2;
    public String f = "";

    static {
        avzv avzvVar = new avzv();
        a = avzvVar;
        aonm.registerDefaultInstance(avzv.class, avzvVar);
    }

    private avzv() {
        emptyProtobufList();
        this.p = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.x = emptyProtobufList();
        this.E = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.Q);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.Q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001%\u0001\u0002\u00013%\u0000\u0002 \u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0006\u0006ᐉ\u000b\u0007ᐉ\f\bᐉ\r\tᐉ\u000f\nЛ\rᐉ\u0013\u000fᐉ\t\u0010ᐉ&\u0011ᐉ\u0015\u0012ᐉ\n\u0013ᐼ\u0000\u0014ᐉ\u0016\u0015ည'\u0016ᐉ\u0014\u001aᐉ\u000e\u001bဇ\u001a\u001cᐉ\u0018\u001dᐉ\u001d ᐉ\u0011!ᐼ\u0000\"Л#ᐉ\u0010$ᐉ\u0012&ဉ\u001e'ᐉ\u001f(ᐉ )ᐉ!*ᐉ\"-ဉ$.ᐉ\u00172ᐉ%3ᐉ\u001b", new Object[]{"e", "d", "b", "c", "f", "g", "h", "G", "H", "j", "k", "m", "o", "p", apjt.class, "J", "I", "P", "t", "i", avgg.class, "u", "E", "K", "n", "w", "v", "N", "r", apsq.class, "x", avfv.class, "q", "s", "y", "z", "A", "B", "C", "D", "L", "O", "M"});
            case NEW_MUTABLE_INSTANCE:
                return new avzv();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = F;
                if (aopfVar == null) {
                    synchronized (avzv.class) {
                        aopfVar = F;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            F = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
