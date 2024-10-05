package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class audj extends aonh implements aoni {
    private static volatile aopf B;
    public static final audj a;
    public aqkm A;
    private aota C;
    private apxf D;
    private aulq E;
    public int b;
    public avgg d;
    public aqyg e;
    public aqyg f;
    public aqyg g;
    public aqyg h;
    public apxf i;
    public apkd j;
    public apkd k;
    public apkd m;
    public apmh n;
    public String o;
    public atdf p;
    public audi q;
    public aomf r;
    public avgg s;
    public aqyg t;
    public boolean u;
    public aony v;
    public avrx w;
    public audh x;
    public aony y;
    public aulq z;
    private byte F = 2;
    public String c = "";

    static {
        audj audjVar = new audj();
        a = audjVar;
        aonm.registerDefaultInstance(audj.class, audjVar);
    }

    private audj() {
        emptyProtobufList();
        this.o = "";
        emptyProtobufList();
        this.r = aomf.b;
        this.v = emptyProtobufList();
        this.y = emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u001b\u0000\u0001\u0001#\u001b\u0000\u0002\u0015\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\nဈ\f\u000fᐉ\u0011\u0010ᐉ\u0013\u0011ည\u0014\u0013ᐉ\u0010\u0014ᐉ\u0015\u0015ᐉ\u0016\u0016ဇ\u0018\u0017ᐉ\u0017\u0018ᐉ\t\u0019Л\u001aᐉ\n\u001bᐉ\b\u001cᐉ\u0019\u001dဉ\u001a\u001fЛ ᐉ\u000b!ᐉ\u001c\"ဉ\u001d#ᐉ\u001e", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "o", "q", "C", "r", "p", "s", "D", "u", "t", "k", "v", avfv.class, "m", "j", "w", "x", "y", audk.class, "n", "z", "A", "E"});
            case NEW_MUTABLE_INSTANCE:
                return new audj();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = B;
                if (aopfVar == null) {
                    synchronized (audj.class) {
                        aopfVar = B;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            B = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
