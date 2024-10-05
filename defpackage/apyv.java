package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apyv extends aonm implements aooz {
    private static volatile aopf S;
    public static final apyv a;
    public aomf A;
    public apjn B;
    public apxf C;
    public apxf D;
    public apyx E;
    public boolean F;
    public aony G;
    public int H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public apyy f96J;
    public apyw K;
    public aony L;
    public aulq M;
    public boolean N;
    public aqyg O;
    public boolean P;
    public String Q;
    public apxf R;
    private aqyg T;
    private aqyg U;
    private aqyg V;
    private aqyg W;
    private apmh X;
    private aqyg Y;
    private apjt Z;
    private aqhi aa;
    private aota ab;
    private apzf ac;
    private apzz ad;
    private aulq ae;
    private apmh af;
    private aqyg ag;
    private aulq ah;
    private aulq ai;
    private aulq aj;
    public int b;
    public int c;
    public int d;
    public Object f;
    public Object h;
    public aulq j;
    public aqyg k;
    public int l;
    public avgg m;
    public apxf n;
    public boolean o;
    public aqyg p;
    public apmh q;
    public aqyg r;
    public aqyg s;
    public apxk t;
    public atdf u;
    public apyp v;
    public apxo w;
    public apxo x;
    public apxo y;
    public apxo z;
    public int e = 0;
    public int g = 0;
    private byte ak = 2;
    public String i = "";

    static {
        apyv apyvVar = new apyv();
        a = apyvVar;
        aonm.registerDefaultInstance(apyv.class, apyvVar);
    }

    private apyv() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.A = aomf.b;
        this.G = emptyProtobufList();
        this.L = emptyProtobufList();
        this.Q = "";
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.ak);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.ak = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u00019\u0002\u0003\u0001`9\u0000\u0002+\u0001ᐉ\u0005\u0002ᐉ\t\u0003ᐉ\n\u0004ᐉ\u000e\u0005ᐉ\u0012\bᐉ\u0017\tဈ\u0000\nᐉ\u0016\fᐼ\u0001\u000eᐉ\u000f\u0012ᐉ\u001e\u0013ည%\u0014ᐉ&\u0017ᐉ'\u0018ᐉ(\u0019ᐉ\u0007\u001aᐉ\r\u001bဇ\f\u001cᐉ\u0015\u001eဌ\b\u001fဿ\u0000 ᐉ)!ᐉ \"ᐉ\u0010#ᐉ\u0011$ᐉ+&ᐉ*'ᐉ\u001f(ဇ-)ᐉ,*ဌ.+ᐼ\u0001,ᐉ$-Л1ᐉ\u00062ဇ23ᐉ\u00185ဉ47ᐉ\u001b8ᐉ59ဉ6:ᐉ!;\u001b<ᐉ#>ᐉ:NᐉAOဇBQᐉ\u0004SᐉETᐉFVᐉHZဇJ\\ᐉD]ᐉL^ᐼ\u0000_ဈM`ᐉN", new Object[]{"f", "e", "h", "g", "b", "c", "d", "k", "m", "n", "p", "r", "u", "i", "t", aqyg.class, "W", "Z", "A", "ab", "ac", "B", "U", "V", "o", "s", "l", apyu.a, apyu.c, "C", "x", "q", "X", "E", "D", "w", "F", "ad", "H", apyk.a(), apjt.class, "aa", "G", apxf.class, "T", "I", "v", "J", "Y", "ae", "K", "y", "L", apyt.class, "z", "af", "M", "N", "j", "ah", "ai", "O", "P", "ag", "aj", apys.class, "Q", "R"});
            case NEW_MUTABLE_INSTANCE:
                return new apyv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = S;
                if (aopfVar == null) {
                    synchronized (apyv.class) {
                        aopfVar = S;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            S = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
