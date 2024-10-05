package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apmg extends aonh implements aoni {
    public static final apmg a;
    private static volatile aopf u;
    public int b;
    public Object d;
    public int e;
    public int f;
    public arfs g;
    public boolean h;
    public aqyg i;
    public arel m;
    public apxf n;
    public apxf o;
    public apxf p;
    public aots r;
    public aott s;
    private aota v;
    public int c = 0;
    private byte w = 2;
    public String j = "";
    public String k = "";
    public aony q = emptyProtobufList();
    public aomf t = aomf.b;

    static {
        apmg apmgVar = new apmg();
        a = apmgVar;
        aonm.registerDefaultInstance(apmg.class, apmgVar);
    }

    private apmg() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.w);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.w = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0013\u0001\u0001\u0001\u0019\u0013\u0000\u0001\b\u0001ဿ\u0000\u0002ဌ\u0003\u0003ဇ\u0006\u0005ᐉ\b\u0007ᐉ\r\bᐉ\u0005\tᐉ\u000e\nဉ\u0010\u000bဈ\t\fᐉ\u0012\rည\u0014\u000eᐉ\f\u0010ဉ\u0011\u0011ြ\u0000\u0012ဈ\u000b\u0013ᐉ\u000f\u0014ြ\u0000\u0015Л\u0019ဌ\u0004", new Object[]{"d", "c", "b", apld.m, "e", apld.l, "h", "i", "n", "g", "o", "r", "j", "v", "t", "m", "s", apmf.class, "k", "p", avfc.class, "q", apxf.class, "f", apld.j});
            case NEW_MUTABLE_INSTANCE:
                return new apmg();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = u;
                if (aopfVar == null) {
                    synchronized (apmg.class) {
                        aopfVar = u;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            u = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
