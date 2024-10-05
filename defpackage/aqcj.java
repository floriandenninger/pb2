package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqcj extends aonh implements aoni {
    public static final aqcj a;
    private static volatile aopf q;
    public int b;
    public auda d;
    public avgg f;
    public aqyg g;
    public aqyg h;
    public aqyg i;
    public aqyg j;
    public apxf k;
    public aomf m;
    public atdf n;
    public aqci o;
    public auar p;
    private aqyg r;
    private aqyg s;
    private aota t;
    private asnj u;
    private aqyg v;
    private arar w;
    private aqtc x;
    private byte y = 2;
    public String c = "";
    public aony e = emptyProtobufList();

    static {
        aqcj aqcjVar = new aqcj();
        a = aqcjVar;
        aonm.registerDefaultInstance(aqcj.class, aqcjVar);
    }

    private aqcj() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.m = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.y);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.y = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0014\u0000\u0001\u0001\u001b\u0014\u0000\u0001\u0011\u0001ဈ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0006\u0006ᐉ\b\bᐉ\t\tᐉ\u0007\nᐉ\r\u000bᐉ\u000f\fည\u000e\u000fᐉ\u0010\u0011ᐉ\u0013\u0012ᐉ\u0011\u0014ᐉ\u0001\u0015ᐉ\u0005\u0017ᐉ\u0012\u0018ᐉ\u0014\u0019Л\u001bဉ\u0015", new Object[]{"b", "c", "f", "g", "h", "i", "k", "s", "j", "t", "u", "m", "v", "o", "n", "d", "r", "w", "x", "e", avfv.class, "p"});
            case NEW_MUTABLE_INSTANCE:
                return new aqcj();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = q;
                if (aopfVar == null) {
                    synchronized (aqcj.class) {
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
