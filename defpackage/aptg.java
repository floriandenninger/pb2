package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aptg extends aonm implements aooz {
    public static final aptg a;
    private static volatile aopf n;
    public int b;
    public Object d;
    public apti e;
    public aqyg f;
    public apxf g;
    public aott h;
    public boolean i;
    public arel j;
    private apxf o;
    private aota p;
    private aulq q;
    public int c = 0;
    private byte r = 2;
    public String k = "";
    public aomf l = aomf.b;
    public String m = "";

    static {
        aptg aptgVar = new aptg();
        a = aptgVar;
        aonm.registerDefaultInstance(aptg.class, aptgVar);
    }

    private aptg() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.r);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000e\u0001\u0001\u0001\u000f\u000e\u0000\u0000\b\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0004\u0004ᐉ\u000b\u0005ည\f\u0006ᐼ\u0000\u0007ᐼ\u0000\bဉ\u0007\tဇ\b\nᐉ\t\u000bဈ\n\fᐉ\r\rᐉ\u0005\u000fဈ\u000e", new Object[]{"d", "c", "b", "e", "f", "g", "p", "l", avgg.class, arfs.class, "h", "i", "j", "k", "q", "o", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new aptg();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = n;
                if (aopfVar == null) {
                    synchronized (aptg.class) {
                        aopfVar = n;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            n = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
