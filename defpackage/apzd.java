package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apzd extends aonm implements aooz {
    public static final apzd a;
    private static volatile aopf n;
    public int b;
    public avgg c;
    public aqyg d;
    public aqyg e;
    public apmh f;
    public apmh g;
    public aqyg h;
    public apmh i;
    public aulq j;
    public aulq l;
    public boolean m;
    private apmh o;
    private apzc p;
    private apzb q;
    private aqyg r;
    private aqyg s;
    private apxf t;
    private apxf u;
    private byte v = 2;
    public String k = "";

    static {
        apzd apzdVar = new apzd();
        a = apzdVar;
        aonm.registerDefaultInstance(apzd.class, apzdVar);
    }

    private apzd() {
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
                return newMessageInfo(a, "\u0001\u0012\u0000\u0001\u0002\u0017\u0012\u0000\u0000\u0010\u0002ᐉ\u0005\u0003ᐉ\u0006\u0004ᐉ\u0001\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0007\bᐉ\n\tᐉ\b\nᐉ\t\u000bᐉ\u000b\rᐉ\f\u000eᐉ\r\u000fᐉ\u000e\u0011ᐉ\u000f\u0013ဈ\u0010\u0014ᐉ\u0011\u0015ဇ\u0012\u0017ᐉ\u0014", new Object[]{"b", "f", "o", "c", "d", "e", "g", "r", "p", "q", "s", "h", "t", "i", "j", "k", "l", "m", "u"});
            case NEW_MUTABLE_INSTANCE:
                return new apzd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = n;
                if (aopfVar == null) {
                    synchronized (apzd.class) {
                        aopfVar = n;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            n = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
