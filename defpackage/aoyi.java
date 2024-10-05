package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoyi extends aonm implements aooz {
    private static volatile aopf P;
    public static final aoyi a;
    public aony A;
    public aony B;
    public aony C;
    public aony D;
    public aony E;
    public aony F;
    public aony G;
    public aony H;
    public aony I;

    /* renamed from: J, reason: collision with root package name */
    public aony f88J;
    public aony K;
    public aony L;
    public aony M;
    public aony N;
    public aony O;
    public aony b = emptyProtobufList();
    public aony c = emptyProtobufList();
    public aony d = emptyProtobufList();
    public aony e = emptyProtobufList();
    public aony f = emptyProtobufList();
    public aony g;
    public aony h;
    public aony i;
    public aony j;
    public aony k;
    public aony l;
    public aony m;
    public aony n;
    public aony o;
    public aony p;
    public aony q;
    public aony r;
    public aony s;
    public aony t;
    public aony u;
    public aony v;
    public aony w;
    public aony x;
    public aony y;
    public aony z;

    static {
        aoyi aoyiVar = new aoyi();
        a = aoyiVar;
        aonm.registerDefaultInstance(aoyi.class, aoyiVar);
    }

    private aoyi() {
        emptyProtobufList();
        this.g = emptyProtobufList();
        this.h = emptyProtobufList();
        this.i = emptyProtobufList();
        this.j = emptyProtobufList();
        this.k = emptyProtobufList();
        this.l = emptyProtobufList();
        this.m = emptyProtobufList();
        this.n = emptyProtobufList();
        this.o = emptyProtobufList();
        this.p = emptyProtobufList();
        emptyProtobufList();
        this.q = emptyProtobufList();
        this.r = emptyProtobufList();
        this.s = emptyProtobufList();
        this.t = emptyProtobufList();
        this.u = emptyProtobufList();
        this.v = emptyProtobufList();
        this.w = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.x = emptyProtobufList();
        this.y = emptyProtobufList();
        this.z = emptyProtobufList();
        this.A = emptyProtobufList();
        this.B = emptyProtobufList();
        emptyProtobufList();
        this.C = emptyProtobufList();
        emptyProtobufList();
        this.D = emptyProtobufList();
        this.E = emptyProtobufList();
        this.F = emptyProtobufList();
        this.G = emptyProtobufList();
        this.H = emptyProtobufList();
        this.I = emptyProtobufList();
        this.f88J = emptyProtobufList();
        this.K = emptyProtobufList();
        this.L = emptyProtobufList();
        this.M = emptyProtobufList();
        this.N = emptyProtobufList();
        this.O = emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001(\u0000\u0000\u00011(\u0000(\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b\u0005\u001b\u0007\u001b\b\u001b\t\u001b\n\u001b\u000b\u001b\f\u001b\r\u001b\u000e\u001b\u0010\u001b\u0011\u001b\u0012\u001b\u0013\u001b\u0014\u001b\u0015\u001b\u0016\u001b\u0017\u001b\u0018\u001b\u001b\u001b\u001c\u001b\u001d\u001b\u001e\u001b\u001f\u001b!\u001b#\u001b$\u001b%\u001b&\u001b'\u001b+\u001b,\u001b-\u001b.\u001b/\u001b0\u001b1\u001b", new Object[]{"b", aoye.class, "c", aoye.class, "d", aoye.class, "e", aoye.class, "f", aoye.class, "g", aoye.class, "h", aoye.class, "i", aoye.class, "j", aoye.class, "k", aoye.class, "l", aoye.class, "m", aoye.class, "p", aoye.class, "n", aoye.class, "q", aoye.class, "o", aoye.class, "r", aoye.class, "s", aoye.class, "t", aoye.class, "u", aoye.class, "v", aoye.class, "w", aoye.class, "x", aoye.class, "y", aoye.class, "z", aoye.class, "A", aoye.class, "B", aoye.class, "C", aoye.class, "D", aoye.class, "E", aoye.class, "F", aoye.class, "G", aoye.class, "H", aoye.class, "I", aoye.class, "J", aoye.class, "K", aoye.class, "L", aoye.class, "M", aoye.class, "N", aoye.class, "O", aoye.class});
            case NEW_MUTABLE_INSTANCE:
                return new aoyi();
            case NEW_BUILDER:
                return new aone((int[][]) null, (short[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = P;
                if (aopfVar == null) {
                    synchronized (aoyi.class) {
                        aopfVar = P;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            P = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
