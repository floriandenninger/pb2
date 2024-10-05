package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apjf extends aonm implements aooz {
    private static volatile aopf M;
    public static final apjf a;
    public apjg A;
    public aulq B;
    public aulq C;
    public aulq E;
    public long F;
    public aulq G;
    public apxf I;

    /* renamed from: J, reason: collision with root package name */
    public aulq f94J;
    public apxf K;
    private aqyg N;
    private apmh O;
    private apjb P;
    private aqyg Q;
    private aqyg R;
    private aqyg S;
    private aqyg T;
    private aota U;
    private apmh V;
    private aulq W;
    private aulq X;
    private aulq Y;
    private aulq Z;
    private aqyg aa;
    private aqyg ab;
    public int b;
    public int c;
    public aqyg d;
    public avgg e;
    public aqyg f;
    public aqyg g;
    public aqyg h;
    public aqyg i;
    public aqyg j;
    public apmh k;
    public apja l;
    public apjn m;
    public int n;
    public apmh o;
    public apjc p;
    public audl q;
    public apiz r;
    public aulq s;
    public aqyg u;
    public apjh v;
    public int w;
    public aulq y;
    public apxf z;
    private byte ac = 2;
    public aomf t = aomf.b;
    public aomf x = aomf.b;
    public String D = "";
    public String H = "";
    public String L = "";

    static {
        apjf apjfVar = new apjf();
        a = apjfVar;
        aonm.registerDefaultInstance(apjf.class, apjfVar);
    }

    private apjf() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.ac);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.ac = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u00012\u0000\u0002\u000172\u0000\u0000(\u0001ᐉ\u0001\u0002ᐉ\b\u0003ᐉ\t\u0004ᐉ\n\u0005ᐉ\u0003\u0006ᐉ\u0007\u0007ᐉ\u000b\bᐉ\u0000\tᐉ\u0004\nᐉ\r\u000bᐉ\u0005\fᐉ\u000e\rᐉ\u000f\u000eᐉ\u0010\u000fᐉ\u0006\u0010ᐉ\u0011\u0011ᐉ\u0013\u0012ᐉ\u0014\u0013ᐉ\u0015\u0014ᐉ\u0016\u0015ည\u0017\u0016ᐉ\u0018\u0018ᐉ\u001a\u0019ဌ\u001d\u001bဉ\u001b\u001cည\u001f\u001eᐉ\u001c\u001fᐉ  ᐉ!!ᐉ\"\"ဉ##ᐉ\u0002$ᐉ\u0012&ᐉ%'ᐉ'(ᐉ&)ᐉ(*ဈ*+ᐉ+,ဃ,-ဌ\f.ᐉ-/ᐉ.1ဈ02ᐉ13ᐉ24ᐉ35ဈ46ᐉ57ᐉ6", new Object[]{"b", "c", "e", "k", "O", "l", "g", "j", "m", "d", "h", "o", "i", "p", "q", "P", "N", "Q", "r", "s", "S", "T", "t", "U", "u", "w", apqr.s, "v", "x", "V", "y", "W", "z", "A", "f", "R", "X", "Y", "B", "C", "D", "E", "F", "n", apew.e, "G", "Z", "H", "I", "J", "K", "L", "aa", "ab"});
            case NEW_MUTABLE_INSTANCE:
                return new apjf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = M;
                if (aopfVar == null) {
                    synchronized (apjf.class) {
                        aopfVar = M;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            M = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
