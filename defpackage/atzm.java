package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atzm extends aonm implements aooz {
    public static final atzm a;
    private static volatile aopf r;
    public int b;
    public aqyg c;
    public aqyg d;
    public aqyg e;
    public aqyg f;
    public atzj g;
    public atzk h;
    public atzp i;
    public avgg j;
    public int l;
    public boolean m;
    public boolean o;
    private aqyg s;
    private aqyg t;
    private apxf u;
    private atzj v;
    private apjt w;
    private aqyg x;
    private aqyg y;
    private aota z;
    private byte A = 2;
    public aony k = emptyProtobufList();
    public aony n = emptyProtobufList();
    public String p = "";
    public aomf q = aomf.b;

    static {
        atzm atzmVar = new atzm();
        a = atzmVar;
        aonm.registerDefaultInstance(atzm.class, atzmVar);
    }

    private atzm() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.A);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.A = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0017\u0000\u0001\u0001\u001a\u0017\u0000\u0002\u0012\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0006\u0006ᐉ\b\u0007ᐉ\n\bင\f\tᐉ\u0005\nᐉ\t\u000bᐉ\u0016\fည\u0017\rᐉ\u000b\u000fᐉ\u0007\u0010Л\u0011ᐉ\u000e\u0012ဇ\u000f\u0013Л\u0014ဇ\u0010\u0015ဈ\u0013\u0016ᐉ\u0003\u0017ᐉ\u0014\u001aᐉ\u0015", new Object[]{"b", "c", "d", "e", "s", "t", "u", "j", "l", "g", "i", "z", "q", "v", "h", "k", avfv.class, "w", "m", "n", aulq.class, "o", "p", "f", "x", "y"});
            case NEW_MUTABLE_INSTANCE:
                return new atzm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = r;
                if (aopfVar == null) {
                    synchronized (atzm.class) {
                        aopfVar = r;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            r = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
