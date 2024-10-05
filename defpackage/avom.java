package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avom extends aonm implements aooz {
    public static final avom a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private apmh f;
    private apxf g;
    private aqyg h;
    private aqyg i;
    private aqyg j;
    private aqyg k;
    private aqyg l;
    private aqyg m;
    private aqyg n;
    private aqyg o;
    private aqyg p;
    private aqyg q;
    private aqyg r;
    private aota s;
    private aqyg t;
    private apmh u;
    private apmh v;
    private byte w = 2;

    static {
        avom avomVar = new avom();
        a = avomVar;
        aonm.registerDefaultInstance(avom.class, avomVar);
    }

    private avom() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0001\u0014\u0013\u0000\u0000\u0013\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\u0012\u000bᐉ\u0013\fᐉ\u000f\u000eᐉ\u0011\u000fᐉ\t\u0010ᐉ\u000b\u0011ᐉ\n\u0012ᐉ\f\u0013ᐉ\r\u0014ᐉ\u000e", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "u", "v", "s", "t", "m", "o", "n", "p", "q", "r"});
            case NEW_MUTABLE_INSTANCE:
                return new avom();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avom.class) {
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
