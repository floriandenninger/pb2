package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqvt extends aonm implements aooz {
    public static final aqvt a;
    private static volatile aopf n;
    public aulq b;
    public avgg c;
    public aqyg d;
    public arfs e;
    public apxf f;
    public aqyg g;
    public aqyg h;
    public arfs i;
    public aqyg j;
    public aqyg k;
    public int l;
    private int o;
    private aqyg p;
    private apxf q;
    private aqyg r;
    private aota s;
    private byte t = 2;
    public aomf m = aomf.b;

    static {
        aqvt aqvtVar = new aqvt();
        a = aqvtVar;
        aonm.registerDefaultInstance(aqvt.class, aqvtVar);
    }

    private aqvt() {
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
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0001\u0012\u0010\u0000\u0000\u000e\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\n\fᐉ\u000b\rည\u000e\u000eᐉ\u000f\u000fᐉ\u0003\u0010ဌ\r\u0011ᐉ\t\u0012ᐉ\f", new Object[]{"o", "b", "c", "d", "f", "g", "h", "p", "q", "j", "r", "m", "s", "e", "l", aquw.g, "i", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new aqvt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = n;
                if (aopfVar == null) {
                    synchronized (aqvt.class) {
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
