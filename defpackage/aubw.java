package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aubw extends aonh implements aoni {
    public static final aubw a;
    private static volatile aopf z;
    private aqyg A;
    private aqyg B;
    private apkd C;
    private aota D;
    private aulq E;
    public int b;
    public aqyg c;
    public aqyg d;
    public aqyg e;
    public avgg f;
    public aqyg g;
    public avgg i;
    public aqyg j;
    public boolean k;
    public apxf m;
    public aqyg n;
    public apkd p;
    public atdf q;
    public aomf r;
    public aubv s;
    public asvx t;
    public avwi u;
    public aqyg v;
    public aony w;
    public asnf x;
    public asnf y;
    private byte F = 2;
    public aony h = emptyProtobufList();
    public String o = "";

    static {
        aubw aubwVar = new aubw();
        a = aubwVar;
        aonm.registerDefaultInstance(aubw.class, aubwVar);
    }

    private aubw() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.r = aomf.b;
        this.w = emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.F);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.F = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u001b\u0000\u0001\u0001#\u001b\u0000\u0002\u0014\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0006\u0006ဇ\u0007\u0007ᐉ\b\bᐉ\t\tᐉ\u000b\nဈ\f\u000bᐉ\u0011\fᐉ\u0002\u000eᐉ\u0013\u000fည\u0012\u0012ᐉ\n\u0013ᐉ\u000f\u0014ᐉ\r\u0015ᐉ\u000e\u0018Л\u001bဉ\u0015\u001cဉ\u0016\u001eᐉ\u0018\u001fᐉ\u0019 Л!ᐉ\u0005\"ဉ\u001a#ဉ\u001b", new Object[]{"b", "c", "d", "f", "g", "j", "k", "m", "A", "n", "o", "D", "e", "s", "r", "B", "q", "p", "C", "h", avfv.class, "t", "u", "E", "v", "w", aulq.class, "i", "x", "y"});
            case NEW_MUTABLE_INSTANCE:
                return new aubw();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = z;
                if (aopfVar == null) {
                    synchronized (aubw.class) {
                        aopfVar = z;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            z = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
