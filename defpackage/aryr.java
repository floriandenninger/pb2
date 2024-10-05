package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aryr extends aonh implements aoni {
    private static volatile aopf L;
    public static final aryr a;
    public atyh A;
    public arye B;
    public aryl C;
    public argp D;
    public aphp E;
    public aony F;
    public aulq G;
    public apwo H;
    public aoui I;

    /* renamed from: J, reason: collision with root package name */
    public arys f111J;
    public aqzg K;
    private aota M;
    private avcn N;
    public int b;
    public int c;
    public arnd d;
    public atyi e;
    public aryi f;
    public aryx g;
    public aryv h;
    public aryb i;
    public aryj j;
    public atqq k;
    public apnt n;
    public aony o;
    public aryu p;
    public aulq q;
    public arhb r;
    public arxx s;
    public aryy t;
    public aony u;
    public aomf v;
    public String w;
    public String x;
    public aqth y;
    public aony z;
    private byte O = 2;
    public aony m = emptyProtobufList();

    static {
        aryr aryrVar = new aryr();
        a = aryrVar;
        aonm.registerDefaultInstance(aryr.class, aryrVar);
    }

    private aryr() {
        emptyProtobufList();
        this.o = emptyProtobufList();
        this.u = emptyProtobufList();
        this.v = aomf.b;
        this.w = "";
        this.x = "";
        this.z = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.F = emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.O);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.O = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001#\u0000\u0002\u0001̉#\u0000\u0005\u001c\u0001ᐉ\u0000\u0002ᐉ\u0002\u0004ᐉ\u0004\u0006ဉ\u0005\u0007Л\tဉ\u0006\nᐉ\b\u000bᐉ\u0003\rЛ\u000eᐉ\u0007\u000fᐉ\u0001\u0010ဉ\t\u0011ᐉ\n\u0014ᐉ\r\u0015ည\u0011\u0016ဉ\u000e\u0017ဈ\u0012\u0019ဈ\u0013\u001aᐉ\u000f\u001dᐉ\u0010\u001eЛ ᐉ\u0015#ᐉ\u0017$Л&ᐉ\u0018)ᐉ\u001b*ᐉ\u001c,ᐉ\u001d.ᐉ\u001e3Л6ᐉ!8ᐉ#:ᐉ$;ᐉ%̉ᐉ&", new Object[]{"b", "c", "d", "f", "h", "i", "m", aryk.class, "j", "n", "g", "o", apey.class, "k", "e", "p", "q", "r", "v", "s", "w", "x", "t", "M", "u", aryn.class, "y", "N", "z", apxf.class, "A", "B", "C", "D", "E", "F", asjc.class, "G", "H", "I", "J", "K"});
            case NEW_MUTABLE_INSTANCE:
                return new aryr();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = L;
                if (aopfVar == null) {
                    synchronized (aryr.class) {
                        aopfVar = L;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            L = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
