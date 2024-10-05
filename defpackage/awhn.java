package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awhn extends aonh implements aoni {
    public static final awhn a;
    private static volatile aopf m;
    public int b;
    public aqyg c;
    public avgg d;
    public avgg e;
    public arfs f;
    public avgg g;
    public awhm h;
    public aqyg i;
    public awhi j;
    private awhj n;
    private aqyg o;
    private apmh p;
    private apmh q;
    private aota r;
    private byte s = 2;
    public String k = "";

    static {
        awhn awhnVar = new awhn();
        a = awhnVar;
        aonm.registerDefaultInstance(awhn.class, awhnVar);
    }

    private awhn() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u0010\u000e\u0000\u0000\f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ဉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\b\tဈ\t\nᐉ\r\rᐉ\u000b\u000eᐉ\f\u000fᐉ\n\u0010ᐉ\u0003", new Object[]{"b", "c", "d", "e", "g", "h", "i", "j", "n", "k", "r", "p", "q", "o", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new awhn();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (awhn.class) {
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
