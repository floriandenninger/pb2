package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqcb extends aonm implements aooz {
    public static final aqcb a;
    private static volatile aopf s;
    private apkd A;
    private apkd B;
    private aota C;
    public int b;
    public avgg c;
    public aqyg d;
    public aqyg f;
    public aqyg g;
    public aqyg i;
    public apmh k;
    public aqyg m;
    public apxf n;
    public atdf o;
    public asvx p;
    public aomf q;
    public boolean r;
    private aqyg t;
    private aqyg u;
    private aqyg v;
    private aqyg w;
    private aqyg x;
    private aqyg y;
    private apkd z;
    private byte D = 2;
    public aony e = emptyProtobufList();
    public aony h = emptyProtobufList();
    public aony j = emptyProtobufList();
    public aony l = emptyProtobufList();

    static {
        aqcb aqcbVar = new aqcb();
        a = aqcbVar;
        aonm.registerDefaultInstance(aqcb.class, aqcbVar);
    }

    private aqcb() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.q = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.D);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.D = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u001a\u0000\u0001\u0002\"\u001a\u0000\u0004\u0017\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\t\u0005ᐉ\n\u0007ᐉ\f\bᐉ\r\tᐉ\u0010\nᐉ\u0011\u000eᐉ\u0018\u0010ည\u0019\u0012ᐉ\u000e\u0013ᐉ\u0015\u0014ᐉ\u0013\u0015ᐉ\u0012\u0016ᐉ\u0014\u0017ဉ\u0016\u0018Л\u0019ᐉ\u0004\u001aᐉ\u0005\u001bᐉ\u0006\u001cЛ\u001dဇ\u001a\u001eЛ\u001fЛ ᐉ\u000f\"ᐉ\b", new Object[]{"b", "c", "d", "t", "u", "v", "w", "m", "n", "C", "q", "x", "o", "A", "z", "B", "p", "e", apkd.class, "f", "g", "i", "l", apkd.class, "r", "h", aqyg.class, "j", aqyg.class, "y", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new aqcb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = s;
                if (aopfVar == null) {
                    synchronized (aqcb.class) {
                        aopfVar = s;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            s = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
