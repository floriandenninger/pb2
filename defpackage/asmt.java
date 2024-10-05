package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asmt extends aonm implements aooz {
    public static final asmt a;
    private static volatile aopf o;
    public int b;
    public aqyg c;
    public aqyg d;
    public int f;
    public aqyg g;
    public aqyg h;
    public aqyg i;
    public aulq j;
    public aulq k;
    public aqyg l;
    public aqyg m;
    public apmh n;
    private aqyg p;
    private aqyg q;
    private apmh r;
    private byte s = 2;
    public String e = "";

    static {
        asmt asmtVar = new asmt();
        a = asmtVar;
        aonm.registerDefaultInstance(asmt.class, asmtVar);
    }

    private asmt() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.s);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.s = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0014\u000f\u0000\u0000\r\u0001ᐉ\u0000\u0002ᐉ\u0005\u0003ᐉ\u0006\u0005ᐉ\u0007\u0007ᐉ\b\tᐉ\t\nᐉ\n\fᐉ\u0001\rᐉ\u000b\u000eᐉ\f\u000fᐉ\u000e\u0010ᐉ\u0002\u0011ᐉ\u000f\u0012င\u0004\u0014ဈ\u0003", new Object[]{"b", "c", "g", "h", "i", "j", "k", "q", "d", "l", "m", "n", "p", "r", "f", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new asmt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (asmt.class) {
                        aopfVar = o;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            o = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
