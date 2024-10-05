package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqzb extends aonm implements aooz {
    public static final aqzb a;
    private static volatile aopf u;
    public int b;
    public avgg c;
    public aqyg d;
    public aqyg e;
    public aqyg f;
    public aqyg g;
    public boolean h;
    public apxf i;
    public aqyg j;
    public aqyg l;
    public aulq m;
    public aulq n;
    public apxf p;
    public aulq r;
    public aulq s;
    public int t;
    private aota v;
    private byte w = 2;
    public aony k = emptyProtobufList();
    public aomf o = aomf.b;
    public String q = "";

    static {
        aqzb aqzbVar = new aqzb();
        a = aqzbVar;
        aonm.registerDefaultInstance(aqzb.class, aqzbVar);
    }

    private aqzb() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.w);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.w = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0001\u000f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003Л\u0004ᐉ\b\u0005ᐉ\n\u0006ᐉ\u000b\u0007ည\f\bᐉ\u0002\tᐉ\u0003\nᐉ\u0007\u000bᐉ\t\fᐉ\r\rᐉ\u0004\u000eဇ\u0005\u000fဈ\u000e\u0010ᐉ\u000f\u0011ᐉ\u0010\u0012ဌ\u0011\u0013ᐉ\u0006", new Object[]{"b", "c", "d", "k", aulq.class, "l", "n", "v", "o", "e", "f", "j", "m", "p", "g", "h", "q", "r", "s", "t", aqze.b, "i"});
            case NEW_MUTABLE_INSTANCE:
                return new aqzb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = u;
                if (aopfVar == null) {
                    synchronized (aqzb.class) {
                        aopfVar = u;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            u = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
