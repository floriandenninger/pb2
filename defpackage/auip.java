package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auip extends aonm implements aooz {
    public static final auip a;
    private static volatile aopf p;
    public int b;
    public aqyg c;
    public avgg d;
    public apxf g;
    public aqyg h;
    public aqyg i;
    public aqyg j;
    public atdf k;
    public aqyg l;
    public int m;
    public aomf n;
    public apsq o;
    private aqyg q;
    private aovx r;
    private aovx s;
    private aota t;
    private aqyg u;
    private byte v = 2;
    public aony e = emptyProtobufList();
    public aony f = emptyProtobufList();

    static {
        auip auipVar = new auip();
        a = auipVar;
        aonm.registerDefaultInstance(auip.class, auipVar);
    }

    private auip() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.n = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0012\u0000\u0001\u0002\u0018\u0012\u0000\u0002\u0010\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\bᐉ\u0010\tည\u0011\rᐉ\u0013\u000eᐉ\u0006\u000fᐉ\b\u0011Л\u0012ᐉ\t\u0013ဌ\n\u0014Л\u0015ᐉ\u0014\u0016ᐉ\u0007\u0017ᐉ\u000b\u0018ᐉ\f", new Object[]{"b", "c", "d", "q", "g", "h", "t", "n", "u", "i", "k", "f", avfv.class, "l", "m", aufb.r, "e", avgg.class, "o", "j", "r", "s"});
            case NEW_MUTABLE_INSTANCE:
                return new auip();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = p;
                if (aopfVar == null) {
                    synchronized (auip.class) {
                        aopfVar = p;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            p = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
