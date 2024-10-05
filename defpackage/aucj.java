package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aucj extends aonm implements aooz {
    public static final aucj a;
    private static volatile aopf o;
    public int b;
    public aqyg c;
    public aucd d;
    public auce e;
    public aqyg f;
    public auch g;
    public aqyg h;
    public auch i;
    public auch j;
    public boolean k;
    public aqyg l;
    public boolean m;
    public apxf n;
    private auck p;
    private auce q;
    private aqyg r;
    private aucm s;
    private byte t = 2;

    static {
        aucj aucjVar = new aucj();
        a = aucjVar;
        aonm.registerDefaultInstance(aucj.class, aucjVar);
    }

    private aucj() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.t);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.t = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u000e\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0003\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bᐉ\u000b\fဇ\f\rᐉ\n\u000eᐉ\r\u000fဇ\u000e\u0010ᐉ\u000f", new Object[]{"b", "c", "d", "e", "q", "r", "p", "s", "f", "g", "h", "j", "k", "i", "l", "m", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new aucj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (aucj.class) {
                        aopfVar = o;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            o = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
