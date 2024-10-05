package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auzj extends aonm implements aooz {
    private static volatile aopf H;
    public static final auzj a;
    public aott B;
    public aott C;
    public apxf E;
    public long F;
    public long G;
    private aqyg I;

    /* renamed from: J, reason: collision with root package name */
    private aqyg f129J;
    private aqyg K;
    private aqyg L;
    private auzi M;
    private aota N;
    public int b;
    public int c;
    public Object e;
    public aqyg g;
    public aqyg h;
    public aqyg i;
    public aqyg j;
    public aqyg k;
    public boolean l;
    public boolean n;
    public apmh o;
    public auzh p;
    public auzn q;
    public auzp r;
    public arel t;
    public auzg u;
    public int v;
    public arfs w;
    public int d = 0;
    private byte O = 2;
    public String f = "";
    public String m = "";
    public String s = "";
    public aony x = emptyProtobufList();
    public aony y = emptyProtobufList();
    public aony z = emptyProtobufList();
    public aony A = emptyProtobufList();
    public aomf D = aomf.b;

    static {
        auzj auzjVar = new auzj();
        a = auzjVar;
        aonm.registerDefaultInstance(auzj.class, auzjVar);
    }

    private auzj() {
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
                return newMessageInfo(a, "\u0001$\u0001\u0002\u0001($\u0000\u0004\u0016\u0001ᐉ\u0001\u0002ᐉ\u0004\u0003ဇ\n\u0004ဇ\f\u0005ᐉ\u0010\u0006ဌ\u0015\u0007ဈ\u0000\tᐉ\b\nᐉ\t\u000bᐉ\u0011\fᐉ\u0002\rᐉ\u0003\u000eᐉ\u001c\u000fည\u001d\u0010ᐉ\u0007\u0011ᐉ\u0016\u0012Л\u0013ြ\u0000\u0014ᐉ\u0005\u0015ᐉ\r\u0016ᐉ\u000f\u0017ᐉ\u0006\u0018ᐉ\u0013\u0019ဉ\u001a\u001aဉ\u001b\u001bᐉ\u000e\u001cဉ\u0014\u001fဈ\u0012 ᐉ !ဂ!\"Л#ြ\u0000$ဈ\u000b&Л'Л(ဂ\"", new Object[]{"e", "d", "b", "c", "I", "i", "l", "n", "q", "v", auye.h, "f", "K", "L", "r", "g", "h", "N", "D", "J", "w", "x", apxf.class, auzk.class, "j", "o", "M", "k", "t", "B", "C", "p", "u", "s", "E", "F", "y", apxf.class, auzl.class, "m", "z", apxf.class, "A", apxf.class, "G"});
            case NEW_MUTABLE_INSTANCE:
                return new auzj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = H;
                if (aopfVar == null) {
                    synchronized (auzj.class) {
                        aopfVar = H;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            H = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
