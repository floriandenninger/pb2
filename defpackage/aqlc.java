package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqlc extends aonm implements aooz {
    private static volatile aopf A;
    public static final aqlc a;
    private aqyg B;
    private aqyg C;
    private aqyg D;
    private aqyg E;
    private aqyg F;
    private aqyg G;
    private aota H;
    public int b;
    public aqyg c;
    public aqyg d;
    public avgg e;
    public apmh f;
    public float g;
    public aqyg h;
    public aqyg i;
    public aqyg j;
    public aqyg k;
    public apmh l;
    public aqyg m;
    public aqyg n;
    public aqyg o;
    public aqyg r;
    public aqyg s;
    public long t;
    public long u;
    public aqyg v;
    public aqyg w;
    public boolean x;
    private byte I = 2;
    public aony p = emptyProtobufList();
    public aony q = emptyProtobufList();
    public String y = "";
    public aomf z = aomf.b;

    static {
        aqlc aqlcVar = new aqlc();
        a = aqlcVar;
        aonm.registerDefaultInstance(aqlc.class, aqlcVar);
    }

    private aqlc() {
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
                return newMessageInfo(a, "\u0001\u001f\u0000\u0001\u0001%\u001f\u0000\u0002\u0019\u0001ᐉ\u0004\u0002ᐉ\u0005\u0003ᐉ\u0006\u0004ᐉ\b\u0005ခ\t\u0006ᐉ\n\u0007ᐉ\u000b\bᐉ\u000e\tᐉ\u001e\nည\u001f\fᐉ\u0012\rᐉ\u0007\u000eᐉ\u000f\u000fᐉ\u0010\u0010ᐉ\u0011\u0013ᐉ\u0013\u0014ᐉ\u0014\u0015Л\u0016Л\u0017ᐉ\u0015\u0018ᐉ\u0016\u0019ဂ\u0017\u001aဂ\u0018\u001bᐉ\u0019\u001cᐉ\u001a\u001dᐉ\f\u001fᐉ\u0001\"ᐉ\r#ဈ\u001d$ᐉ\u001b%ဇ\u001c", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "l", "H", "z", "D", "C", "m", "n", "o", "E", "F", "q", aqle.class, "p", aqla.class, "r", "s", "t", "u", "v", "G", "j", "B", "k", "y", "w", "x"});
            case NEW_MUTABLE_INSTANCE:
                return new aqlc();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = A;
                if (aopfVar == null) {
                    synchronized (aqlc.class) {
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
