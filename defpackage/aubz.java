package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aubz extends aonm implements aooz {
    public static final aubz a;
    private static volatile aopf n;
    public int b;
    public aqyg d;
    public auda e;
    public long h;
    public aqyg i;
    public apxf j;
    public aqyg k;
    public atdf l;
    public aomf m;
    private aqyg o;
    private aqyg p;
    private aqyg q;
    private apbz r;
    private aqyg s;
    private aota t;
    private asnj u;
    private aqyg v;
    private apsq w;
    private byte x = 2;
    public String c = "";
    public aony f = emptyProtobufList();
    public aony g = emptyProtobufList();

    static {
        aubz aubzVar = new aubz();
        a = aubzVar;
        aonm.registerDefaultInstance(aubz.class, aubzVar);
    }

    private aubz() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.m = aomf.b;
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.x);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.x = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0014\u0000\u0001\u0001\u0019\u0014\u0000\u0002\u0011\u0001ဈ\u0000\u0002ᐉ\u0001\u0003Л\u0004ဂ\u0003\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\t\nᐉ\n\fᐉ\u000e\rᐉ\u0004\u000eᐉ\u0010\u000fည\u000f\u0010ᐉ\u0011\u0011ᐉ\b\u0013ᐉ\u000b\u0014ᐉ\u0002\u0017Л\u0018ᐉ\u0012\u0019ᐉ\f", new Object[]{"b", "c", "d", "f", avgg.class, "h", "j", "o", "k", "q", "r", "t", "i", "u", "m", "v", "p", "l", "e", "g", avfv.class, "w", "s"});
            case NEW_MUTABLE_INSTANCE:
                return new aubz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = n;
                if (aopfVar == null) {
                    synchronized (aubz.class) {
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
