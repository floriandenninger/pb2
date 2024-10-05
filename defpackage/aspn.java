package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aspn extends aonm implements aooz {
    public static final aspn a;
    private static volatile aopf o;
    public int b;
    public Object d;
    public aqyg g;
    public aqyg h;
    public aqyg i;
    public avgg j;
    public aqyg l;
    public apxf m;
    public aomf n;
    private aqyg p;
    private aqyg q;
    private aota r;
    public int c = 0;
    private byte s = 2;
    public String e = "";
    public String f = "";
    public aony k = emptyProtobufList();

    static {
        aspn aspnVar = new aspn();
        a = aspnVar;
        aonm.registerDefaultInstance(aspn.class, aspnVar);
    }

    private aspn() {
        emptyProtobufList();
        this.n = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0010\u0001\u0001\u0001\u0013\u0010\u0000\u0001\f\u0001ဈ\u0000\u0003ᐉ\u0002\u0004ဈ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007်\u0000\bᐼ\u0000\tᐼ\u0000\nᐉ\t\u000bᐉ\n\fЛ\rᐉ\u000b\u000eᐉ\f\u000fᐉ\r\u0012ᐉ\u000f\u0013ည\u0010", new Object[]{"d", "c", "b", "e", "p", "f", "g", "h", aqyg.class, asqh.class, "i", "j", "k", asor.class, "l", "q", "m", "r", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new aspn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (aspn.class) {
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
