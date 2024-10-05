package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apim extends aonm implements aooz {
    public static final apim a;
    private static volatile aopf b;
    private int c;
    private apmh d;
    private aqyg e;
    private aqyg f;
    private aqyg g;
    private apmh h;
    private aqyg i;
    private aqyg j;
    private aqyg k;
    private aqyg l;
    private aqyg m;
    private aqyg n;
    private aqyg o;
    private apin p;
    private aqyg q;
    private apmh r;
    private aqyg s;
    private aota t;
    private byte u = 2;

    static {
        apim apimVar = new apim();
        a = apimVar;
        aonm.registerDefaultInstance(apim.class, apimVar);
    }

    private apim() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.u);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.u = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0002\u0014\u0011\u0000\u0000\u0011\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\f\nᐉ\r\u000bᐉ\u000e\fᐉ\u0001\rᐉ\b\u000eᐉ\t\u000fᐉ\n\u0010ᐉ\u000b\u0012ᐉ\u0012\u0013ᐉ\u000f\u0014ᐉ\u0010", new Object[]{"c", "e", "f", "g", "h", "i", "j", "o", "p", "q", "d", "k", "l", "m", "n", "t", "r", "s"});
            case NEW_MUTABLE_INSTANCE:
                return new apim();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (apim.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
