package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ardf extends aonh implements aoni {
    private static volatile aopf A;
    public static final ardf a;
    private aqyg B;
    private aqyg C;
    private apxf D;
    private apxf E;
    private arar F;
    private aota G;
    public int b;
    public avgg c;
    public aqyg d;
    public aqyg e;
    public aqyc f;
    public avgg g;
    public aqyg h;
    public aqyg i;
    public aqyg j;
    public aqyg k;
    public apxf m;
    public avrx n;
    public apkd q;
    public apkd r;
    public apkd s;
    public arde t;
    public boolean u;
    public aony v;
    public atdf w;
    public aswa x;
    public avwi y;
    public aomf z;
    private byte H = 2;
    public aony o = emptyProtobufList();
    public aony p = emptyProtobufList();

    static {
        ardf ardfVar = new ardf();
        a = ardfVar;
        aonm.registerDefaultInstance(ardf.class, ardfVar);
    }

    private ardf() {
        emptyProtobufList();
        emptyProtobufList();
        this.v = emptyProtobufList();
        emptyProtobufList();
        this.z = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.H);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.H = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u001d\u0000\u0001\u0002'\u001d\u0000\u0003\u0018\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0007\u0006ᐉ\b\u0007ᐉ\n\bᐉ\f\nᐉ\u0004\u000bᐉ\u001c\fᐉ\u000e\rЛ\u000eᐉ\u0006\u000fЛ\u0011ည\u001e\u0014ᐉ\u0013\u0016ᐉ\t\u0017ဇ\u0015\u0018ᐉ\u0017\u0019ᐉ\u0010\u001aᐉ\u0018\u001cЛ\u001dᐉ\u000f\u001eᐉ\u0011\u001fᐉ\u0012\"ဉ\u001a$ဉ\u0005%ဉ\u001b&ᐉ\r'ᐉ\u000b", new Object[]{"b", "c", "d", "B", "h", "i", "k", "m", "e", "G", "n", "o", apjt.class, "g", "p", apjt.class, "z", "t", "j", "u", "w", "r", "F", "v", avfv.class, "q", "s", "E", "x", "f", "y", "D", "C"});
            case NEW_MUTABLE_INSTANCE:
                return new ardf();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = A;
                if (aopfVar == null) {
                    synchronized (ardf.class) {
                        aopfVar = A;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            A = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
