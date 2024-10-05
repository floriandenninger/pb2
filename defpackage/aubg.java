package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aubg extends aonm implements aooz {
    private static volatile aopf O;
    public static final aubg a;
    public asnj A;
    public apmh B;
    public int C;
    public aubf D;
    public apmh E;
    public aomf F;
    public String G;
    public apmk H;
    public aubh I;

    /* renamed from: J, reason: collision with root package name */
    public auaz f122J;
    public aubc K;
    public aubd L;
    public aube M;
    public aony N;
    private aqyg P;
    private auda Q;
    private aqyg R;
    private aqyg S;
    private aqyg T;
    private aqyg U;
    private aqyg V;
    private aubb W;
    private apxf X;
    private apxf Y;
    private aota Z;
    private apxf aa;
    private apxf ab;
    private aulq ac;
    private aulq ad;
    private apxf ae;
    public int b;
    public int c;
    public Object e;
    public Object g;
    public apxf i;
    public aulq j;
    public aulq k;
    public asnf l;
    public boolean m;
    public aqyg n;
    public aqyg o;
    public aqyg p;
    public avgg q;
    public avgg r;
    public aqyg s;
    public aqyg t;
    public aqyg u;
    public apxf v;
    public aony w;
    public aubi x;
    public auay y;
    public auba z;
    public int d = 0;
    public int f = 0;
    private byte af = 2;
    public String h = "";

    static {
        aubg aubgVar = new aubg();
        a = aubgVar;
        aonm.registerDefaultInstance(aubg.class, aubgVar);
    }

    private aubg() {
        emptyProtobufList();
        this.w = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.F = aomf.b;
        this.G = "";
        emptyProtobufList();
        emptyProtobufList();
        this.N = emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.af);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.af = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u00015\u0002\u0002\u0001F5\u0000\u0002-\u0001ဈ\u0000\u0002ᐼ\u0000\u0003ᐉ\u000b\u0004ᐉ\u0010\u0005ᐉ\u0012\u0006ᐉ\u0013\u0007ᐉ\u0014\bᐉ\u0016\tᐉ\u001a\u000bဉ\u001b\rᐉ\u001e\u000fᐉ\"\u0010ဌ$\u0011ᐉ\u0015\u0012ဉ\u001d\u0013ᐉ%\u0014ᐉ)\u0015ᐉ&\u0016ᐉ(\u0017ည*\u0019ᐉ\u0017\u001aᐉ\u0018\u001bᐉ\u0019\u001cᐼ\u0001\u001dᐉ\n\u001eဈ+\u001fᐉ\u000f Л(ᐉ,)ᐉ-*ᐉ\u0003,ᐉ\u001f-ᐉ'.ᐉ./ᐉ/1ᐉ22ᐉ35ᐉ56ᐉ67ᐉ78ဉ\b9ᐉ#:ᐉ\f;ᐉ\r=ᐉ\u000e>ဇ\t?ᐼ\u0000@ᐼ\u0001Aᐉ0Bᐉ1Dᐉ\u0006Eᐉ\u0007FЛ", new Object[]{"e", "d", "g", "f", "b", "c", "h", apxf.class, "n", "r", "s", "t", "u", "R", "V", "x", "W", "A", "C", aufb.d, "v", "y", "X", "Z", "D", "Y", "F", "S", "T", "U", apxf.class, "P", "G", "Q", "w", aqyg.class, "aa", "ab", "i", "z", "E", "H", "I", "J", "K", "L", "ae", "M", "l", "B", "o", "p", "q", "m", aulq.class, aulq.class, "ac", "ad", "j", "k", "N", aulq.class});
            case NEW_MUTABLE_INSTANCE:
                return new aubg();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = O;
                if (aopfVar == null) {
                    synchronized (aubg.class) {
                        aopfVar = O;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            O = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
