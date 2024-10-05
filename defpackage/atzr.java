package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atzr extends aonm implements aooz {
    public static final atzr a;
    private static volatile aopf t;
    private aulq A;
    private apxf B;
    private apxf C;
    private apxf D;
    private apxf E;
    private apxf F;
    private aqyg G;
    private atzd H;
    private aulq I;
    public int b;
    public atzq d;
    public atzs e;
    public atzi f;
    public atzo g;
    public atzn h;
    public atzw i;
    public aulq j;
    public aulq k;
    public aulq l;
    public aqyg m;
    public aulq n;
    public apmh o;
    public aulq p;
    public aulq q;
    public aulq r;
    public aulq s;
    private int u;
    private apxf v;
    private atzt w;
    private aulq x;
    private aulq y;
    private aulq z;

    /* renamed from: J, reason: collision with root package name */
    private byte f121J = 2;
    public aony c = emptyProtobufList();

    static {
        atzr atzrVar = new atzr();
        a = atzrVar;
        aonm.registerDefaultInstance(atzr.class, atzrVar);
    }

    private atzr() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f121J);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f121J = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u001f\u0000\u0002\u0001(\u001f\u0000\u0001\u001f\u0001Л\u0002ᐉ\u0000\u0003ᐉ\t\u0004ᐉ\n\u0005ᐉ\u0001\u0006ᐉ\u0004\u0007ᐉ\b\bᐉ\f\rᐉ\r\u000eᐉ\u000e\u000fᐉ\u0010\u0010ᐉ\u0012\u0011ᐉ\u0007\u0012ᐉ\u0013\u0013ᐉ\u000b\u0014ᐉ\u000f\u0015ᐉ\u0014\u0016ᐉ\u0015\u0017ᐉ\u0018\u0019ᐉ\u001c\u001aᐉ\u001d\u001bᐉ\u001e\u001cᐉ\u001f\u001dᐉ \u001eᐉ\u0019\u001fᐉ! ᐉ\u001a$ᐉ\"%ᐉ\u0011'ᐉ\u001b(ᐉ#", new Object[]{"b", "u", "c", atzh.class, "d", "g", "h", "e", "f", "w", "i", "y", "z", "k", "m", "v", "n", "x", "j", "o", "p", "q", "B", "C", "D", "E", "F", "r", "G", "s", "H", "l", "A", "I"});
            case NEW_MUTABLE_INSTANCE:
                return new atzr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = t;
                if (aopfVar == null) {
                    synchronized (atzr.class) {
                        aopfVar = t;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            t = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
