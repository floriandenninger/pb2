package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awfl extends aonm implements aooz {
    public static final awfl a;
    private static volatile aopf q;
    public int b;
    public long c;
    public int d;
    public int e;
    public int g;
    public long h;
    public boolean i;
    public aqyg j;
    public apmh k;
    public aqyg l;
    public aqyg m;
    public apxf n;
    public aony o;
    public apxf p;
    private apmh r;
    private byte s = 2;
    public int f = 10000;

    static {
        awfl awflVar = new awfl();
        a = awflVar;
        aonm.registerDefaultInstance(awfl.class, awflVar);
    }

    private awfl() {
        emptyProtobufList();
        this.o = emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0014\u000f\u0000\u0001\b\u0001ဂ\u0000\u0003ᐉ\n\u0004ᐉ\u000b\u0005ဋ\u0003\u0006ᐉ\f\u0007ᐉ\u000e\nᐉ\r\u000bင\u0001\rЛ\u000eဌ\u0004\u000fဂ\u0005\u0011ᐉ\u0010\u0012ဇ\u0007\u0013ဋ\u0002\u0014ᐉ\u000f", new Object[]{"b", "c", "j", "k", "f", "l", "m", "r", "d", "o", apxf.class, "g", awfk.a(), "h", "p", "i", "e", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new awfl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = q;
                if (aopfVar == null) {
                    synchronized (awfl.class) {
                        aopfVar = q;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            q = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
