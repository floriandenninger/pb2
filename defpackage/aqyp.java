package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqyp extends aonm implements aooz {
    public static final aqyp a;
    private static volatile aopf r;
    public int b;
    public avgg c;
    public aqyg d;
    public aqyg e;
    public aqyg f;
    public aqyg g;
    public aqyg h;
    public aqyg i;
    public aqyg j;
    public boolean k;
    public avgg l;
    public aulq n;
    public aulq o;
    private aota s;
    private byte t = 2;
    public aony m = emptyProtobufList();
    public aomf p = aomf.b;
    public String q = "";

    static {
        aqyp aqypVar = new aqyp();
        a = aqypVar;
        aonm.registerDefaultInstance(aqyp.class, aqypVar);
    }

    private aqyp() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.t);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.t = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0001\r\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tဇ\b\nᐉ\t\u000bЛ\fᐉ\n\rᐉ\u000b\u000eᐉ\f\u000fည\r\u0010ဈ\u000e", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", aqyq.class, "n", "o", "s", "p", "q"});
            case NEW_MUTABLE_INSTANCE:
                return new aqyp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = r;
                if (aopfVar == null) {
                    synchronized (aqyp.class) {
                        aopfVar = r;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            r = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
