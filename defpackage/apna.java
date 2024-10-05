package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apna extends aonm implements aooz {
    public static final apna a;
    private static volatile aopf x;
    private aota A;
    private apxf B;
    private apxf C;
    private aulq D;
    private apxf E;
    private apxf F;
    private apnc G;
    private apnd H;
    private apxf I;

    /* renamed from: J, reason: collision with root package name */
    private apxf f95J;
    private apxf K;
    private apmh L;
    private apxf M;
    private aulq N;
    public int b;
    public int c;
    public Object e;
    public aqyg g;
    public apmv h;
    public avgg i;
    public apxf j;
    public aqyg l;
    public apmx m;
    public boolean n;
    public apnb o;
    public apne q;
    public aqyg r;
    public apxf t;
    public apmy u;
    public aulq v;
    public aulq w;
    private apxf y;
    private apmz z;
    public int d = 0;
    private byte O = 2;
    public String f = "";
    public aony k = emptyProtobufList();
    public aony p = emptyProtobufList();
    public aomf s = aomf.b;

    static {
        apna apnaVar = new apna();
        a = apnaVar;
        aonm.registerDefaultInstance(apna.class, apnaVar);
    }

    private apna() {
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.O);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.O = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001$\u0001\u0002\u0006;$\u0000\u0002\u001f\u0006ဈ\u0001\u0007ᐉ\u0003\tᐼ\u0000\rЛ\u000fᐉ\r\u0012ᐉ\u0010\u0014ဉ\u0012\u0015ᐉ\u0011\u0016ᐉ\u0013\u0019ᐉ\t\u001aᐉ\u0014\u001bည\u0015\u001cᐉ\u0016\u001dᐉ\u0019\u001eᐉ\u001b ᐉ\u001d!ᐉ\u001e\"ᐉ\u001f#ᐉ $ᐉ!%ᐉ\f&ဇ\u000f'ᐉ\"(ᐉ#)ᐉ$.ဉ\u0004/ᐉ'0Л2ᐉ\u00174ᐉ\u00185ᐉ\u000b6ᐉ(7ᐼ\u00008ᐉ)9ᐉ*;ᐉ\u0002", new Object[]{"e", "d", "b", "c", "f", "y", avgg.class, "k", apjt.class, "m", "o", "q", "z", "r", "i", "A", "s", "B", "E", "F", "G", "H", "I", "J", "K", "l", "n", "t", "L", "M", "h", "u", "p", apmw.class, "C", "D", "j", "v", aulq.class, "w", "N", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new apna();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = x;
                if (aopfVar == null) {
                    synchronized (apna.class) {
                        aopfVar = x;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            x = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
