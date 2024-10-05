package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apxj extends aonm implements aooz {
    public static final apxj a;
    private static volatile aopf i;
    public int b;
    public apmh c;
    public apmh d;
    public apmh e;
    public aqhi f;
    public aulq g;
    public long h;
    private aulq j;
    private aulq k;
    private apmh l;
    private apxl m;
    private apmh n;
    private apxl o;
    private apmh p;
    private apxl q;
    private apmh r;
    private apxl s;
    private apxl t;
    private aota u;
    private byte v = 2;

    static {
        apxj apxjVar = new apxj();
        a = apxjVar;
        aonm.registerDefaultInstance(apxj.class, apxjVar);
    }

    private apxj() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.v);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.v = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0000\u0011\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\n\u0004ᐉ\u0006\u0005ᐉ\b\u0006ᐉ\f\u0007ᐉ\u0001\tᐉ\u0013\nᐉ\u0007\u000bᐉ\t\fᐉ\u000b\rᐉ\r\u000eᐉ\u000e\u000fᐉ\u0005\u0010ဂ\u0011\u0011ᐉ\u0004\u0013ᐉ\u0003\u0014ᐉ\u000f", new Object[]{"b", "c", "e", "p", "l", "n", "r", "d", "u", "m", "o", "q", "s", "t", "f", "h", "k", "j", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new apxj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (apxj.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
