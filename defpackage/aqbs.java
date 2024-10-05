package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqbs extends aonm implements aooz {
    public static final aqbs a;
    private static volatile aopf p;
    public int b;
    public Object d;
    public Object f;
    public arfs g;
    public aulq h;
    public avgg i;
    public aqyg j;
    public aqyg k;
    public aqbr m;
    private apxf q;
    private apxf r;
    private aota s;
    public int c = 0;
    public int e = 0;
    private byte t = 2;
    public String l = "";
    public aomf n = aomf.b;
    public boolean o = true;

    static {
        aqbs aqbsVar = new aqbs();
        a = aqbsVar;
        aonm.registerDefaultInstance(aqbs.class, aqbsVar);
    }

    private aqbs() {
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
                return newMessageInfo(a, "\u0001\u0010\u0002\u0001\u0001\u0014\u0010\u0000\u0000\r\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0004\u0004ᐼ\u0001\u0005ᐉ\u0010\u0006ည\u0011\u0007ᐼ\u0000\bᐼ\u0000\tᐼ\u0001\u000bᐉ\u000e\fဈ\r\rᐉ\u0005\u0011ဇ\u0013\u0012ᐉ\u0001\u0013ᐉ\u000b\u0014ᐉ\f", new Object[]{"d", "c", "f", "e", "b", "g", "i", "j", apxf.class, "s", "n", arfs.class, aqyg.class, apxf.class, "m", "l", "k", "o", "h", "q", "r"});
            case NEW_MUTABLE_INSTANCE:
                return new aqbs();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = p;
                if (aopfVar == null) {
                    synchronized (aqbs.class) {
                        aopfVar = p;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            p = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
