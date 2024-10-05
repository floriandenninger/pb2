package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ausu extends aonh implements aoni {
    public static final ausu a;
    private static volatile aopf w;
    private aulq A;
    private auzj B;
    private ausv C;
    private aqwk D;
    private apxf E;
    private aota F;
    private aust G;
    private arar H;
    public int b;
    public int c;
    public Object e;
    public aqyg f;
    public aqyg g;
    public ausq h;
    public aulq i;
    public aqyg j;
    public avgg k;
    public boolean m;
    public ausl n;
    public apxf o;
    public ausr p;
    public ausw r;
    public int s;
    public aony t;
    public aomf u;
    public aqrh v;
    private aqyg x;
    private apxf y;
    private auss z;
    public int d = 0;
    private byte I = 2;
    public aony q = emptyProtobufList();

    static {
        ausu ausuVar = new ausu();
        a = ausuVar;
        aonm.registerDefaultInstance(ausu.class, ausuVar);
    }

    private ausu() {
        emptyProtobufList();
        this.t = emptyProtobufList();
        this.u = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.I);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.I = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u001e\u0001\u0002\u00010\u001e\u0000\u0002\u0016\u0001ᐉ\u0000\u0002ᐉ\u0006\u0003ᐉ\r\u0004ᐉ\u000e\u0005ᐉ\u0016\u0006ᐉ\u0011\tᐉ\u0005\u000bᐉ\u001a\fᐉ\u0001\u000eᐉ\u0004\u000fည\u001b\u0011ᐉ\u0019\u0013ᐉ\u0015\u0015ᐉ\u0014\u0017ဇ\n\u0018ᐉ\u001e\u0019ᐉ\u001f\u001aЛ\u001bဉ\u0002\u001cЛ\u001dᐉ\u0012\u001eᐉ\f\u001fᐉ\u000f$ᐉ\u0003'ᐉ\u0010)ဉ%+ဌ\u0017-ှ\u0000.ှ\u00000ြ\u0000", new Object[]{"e", "d", "b", "c", "f", "k", "o", "y", "r", "B", "j", "F", "g", "x", "u", "E", "p", "D", "m", "G", "H", "q", ausm.class, "h", "t", apxf.class, "C", "n", "z", "i", "A", "v", "s", auqy.f, ausy.class});
            case NEW_MUTABLE_INSTANCE:
                return new ausu();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = w;
                if (aopfVar == null) {
                    synchronized (ausu.class) {
                        aopfVar = w;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            w = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
