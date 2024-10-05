package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aukf extends aonm implements aooz {
    private static volatile aopf F;
    public static final aukf a;
    public aulq A;
    public aulq B;
    public aulq C;
    public aulq D;
    public aulq E;
    private aota G;
    private aulq H;
    public int b;
    public asnj c;
    public asnj d;
    public aqyg e;
    public auke f;
    public atdf g;
    public aukl h;
    public asew i;
    public aulq j;
    public aulq k;
    public aulq l;
    public aulq m;
    public aulq n;
    public int o;
    public aulq p;
    public aulq q;
    public auac r;
    public int t;
    public aulq u;
    public int v;
    public aulq w;
    public aulq x;
    public aukh y;
    public aulq z;
    private byte I = 2;
    public aomf s = aomf.b;

    static {
        aukf aukfVar = new aukf();
        a = aukfVar;
        aonm.registerDefaultInstance(aukf.class, aukfVar);
    }

    private aukf() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.I);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.I = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u001f\u0000\u0001\u0001\u001f\u001f\u0000\u0000\u0019\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ဉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\b\tᐉ\t\nᐉ\n\u000bᐉ\u000b\fဌ\f\rᐉ\r\u000eᐉ\u000e\u000fᐉ\u000f\u0010ည\u0010\u0011ᐉ\u0011\u0012ဌ\u0012\u0013ᐉ\u0013\u0014ဌ\u0014\u0015ᐉ\u0015\u0016ᐉ\u0016\u0017ဉ\u0017\u0018ᐉ\u0001\u0019ᐉ\u0018\u001aᐉ\u0019\u001bᐉ\u001a\u001cᐉ\u001b\u001dᐉ\u001c\u001eᐉ\u001d\u001fᐉ\u001e", new Object[]{"b", "c", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", aujj.q, "p", "q", "r", "s", "G", "t", aujj.o, "u", "v", aujj.p, "w", "x", "y", "d", "z", "A", "B", "C", "D", "H", "E"});
            case NEW_MUTABLE_INSTANCE:
                return new aukf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = F;
                if (aopfVar == null) {
                    synchronized (aukf.class) {
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
