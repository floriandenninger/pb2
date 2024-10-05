package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apzx extends aonm implements aooz {
    public static final apzx a;
    private static volatile aopf m;
    public int b;
    public apyx c;
    public aulq d;
    public aulq e;
    public apzp f;
    public apzi g;
    public apzw i;
    public boolean j;
    public int k;
    public boolean l;
    private aulq n;
    private aulq o;
    private aqyg p;
    private aqyg q;
    private aota r;
    private aqyg s;
    private apzz t;
    private apzm u;
    private aqyg v;
    private byte w = 2;
    public aomf h = aomf.b;

    static {
        apzx apzxVar = new apzx();
        a = apzxVar;
        aonm.registerDefaultInstance(apzx.class, apzxVar);
    }

    private apzx() {
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
                return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0001\u0017\u0013\u0000\u0000\u000e\u0001ᐉ\u0000\u0002ᐉ\u0005\u0003ᐉ\u0007\u0004ᐉ\b\u0006ည\t\u0007ᐉ\n\bᐉ\f\tဉ\r\nဇ\u000e\u000bᐉ\u000f\fᐉ\u0006\rဌ\u0010\u000fᐉ\u0012\u0010ᐉ\u0002\u0011ᐉ\u0001\u0013ᐉ\u0004\u0014ᐉ\u0014\u0015ᐉ\u0003\u0017ဇ\u0016", new Object[]{"b", "c", "f", "p", "q", "h", "r", "s", "i", "j", "t", "g", "k", apqr.u, "u", "e", "d", "o", "v", "n", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new apzx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (apzx.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            m = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
