package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akzs extends aonm implements aooz {
    public static final akzs a;
    private static volatile aopf at;
    public akzp A;
    public long C;
    public long D;
    public long E;
    public boolean F;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public akzp f65J;
    public akzp K;
    public akzp L;
    public akzp M;
    public akzp N;
    public akzp O;
    public akzn R;
    public boolean U;
    public boolean V;
    public avyg W;
    public int Z;
    public akzp aa;
    public avuh ab;
    public akzp ac;
    public akzp ad;
    public boolean ae;
    public boolean af;
    public int ag;
    public int ah;
    public akzp ai;
    public akzp aj;
    public akzp ak;
    public akzp an;
    public akzp ao;
    public akzo ap;
    public boolean aq;
    public boolean ar;
    public awaf as;
    public int b;
    public int c;
    public int d;
    public long h;
    public akzw i;
    public arvt j;
    public int l;
    public int m;
    public akzt q;
    public akzl r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public akzm x;
    public akzp y;
    public boolean z;
    private byte au = 2;
    public String e = "";
    public String f = "";
    public String g = "";
    public String k = "";
    public aomf n = aomf.b;
    public aomf o = aomf.b;
    public String p = "";
    public String B = "";
    public String G = "";
    public String H = "";
    public aony P = aonm.emptyProtobufList();
    public aony Q = aonm.emptyProtobufList();
    public String S = "";
    public aony T = aonm.emptyProtobufList();
    public String X = "";
    public String Y = "";
    public String al = "";
    public String am = "";

    static {
        akzs akzsVar = new akzs();
        a = akzsVar;
        aonm.registerDefaultInstance(akzs.class, akzsVar);
    }

    private akzs() {
    }

    public static /* synthetic */ void a(akzs akzsVar) {
        akzsVar.c |= 32768;
        akzsVar.U = true;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.au);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.au = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001C\u0000\u0003\u0001ϫC\u0000\u0003\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0004\u0004ဈ\u0006\u0005ဈ$\u0006ဈ%\u0007ဉ'\bဉ*\tဈ3\nဌ4\u000bဉ5\fဉ7\rဉ8\u000eဇ9\u000fဉ=\u0010ဃ\u0003\u0011ဈ2\u0012ဈ@\u0013ဉB\u0014ဉ\u0019\u0015ဉ\u001a\u001cဉ?\u001eဉ+\u001fဌ\u0007 ဉ,!\u001a\"\u001a$ဉ-%ဇ:&ဉE'ဈ.)ည\u000b*\u001a+ဇ/,ဉ(-ဃ&.ဉ1/ဇG0ဇ01ဉ\u001c2ဈ\u001d3ဇ\u001b4ဉ)5ဌ;6ဌ<7ဉ\u000e8ဌ\u00119ᐉ\u0005:ᐉ6;ဉI<ဇ\u0015=ဇ\u0016>ဈ\u0002?ည\f@ဉ\u000fAဉ>Bဇ!Cဌ\bDဇ\u0017EဇHFဇ\u0018GဈAHဉCIဈ\rϩဃ\u001eϪဃ ϫဃ\u001f", new Object[]{"b", "c", "d", "e", "f", "i", "k", "G", "H", "J", "M", "Y", "Z", akzr.b(), "aa", "ac", "ad", "ae", "ai", "h", "X", "al", "an", "x", "y", "ak", "N", "l", akzq.b(), "O", "P", "Q", "R", "af", "ap", "S", "n", "T", "U", "K", "I", "W", "aq", "V", "A", "B", "z", "L", "ag", avtr.a(), "ah", avtq.a(), "q", "s", aduo.f, "j", "ab", "as", "t", "u", "g", "o", "r", "aj", "F", "m", avtn.a(), "v", "ar", "w", "am", "ao", "p", "C", "E", "D"});
            case NEW_MUTABLE_INSTANCE:
                return new akzs();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = at;
                if (aopfVar == null) {
                    synchronized (akzs.class) {
                        aopfVar = at;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            at = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
