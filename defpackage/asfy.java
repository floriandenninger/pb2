package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asfy extends aonm implements aooz {
    public static final asfy a;
    private static volatile aopf t;
    public int b;
    public Object d;
    public Object f;
    public arnd g;
    public asgd k;
    public boolean o;
    public apxf p;
    public apxf r;
    public int s;
    private apxf u;
    private apxf v;
    private aqzg w;
    public int c = 0;
    public int e = 0;
    private byte x = 2;
    public String h = "";
    public String i = "";
    public aomf j = aomf.b;
    public aomf l = aomf.b;
    public aomf m = aomf.b;
    public aomf n = aomf.b;
    public aomf q = aomf.b;

    static {
        asfy asfyVar = new asfy();
        a = asfyVar;
        aonm.registerDefaultInstance(asfy.class, asfyVar);
    }

    private asfy() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.x);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.x = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0014\u0002\u0001\u0001̉\u0014\u0000\u0000\n\u0001ᐉ\u0000\u0004ဈ\u0004\u0005ဈ\u0005\u0006ᐉ\u0007\u0007ွ\u0000\bည\b\tည\t\nည\u0006\u000bᐼ\u0001\fᐼ\u0001\rည\f\u000eᐉ\r\u000fᐼ\u0000\u0010ဇ\u000e\u0011ᐉ\u000f\u0012ည\u0010\u0013ᐉ\u0011\u0014ᐉ\u0012\u0015ဌ\u0013̉ᐉ\u0014", new Object[]{"d", "c", "f", "e", "b", "g", "h", "i", "k", "l", "m", "j", apxf.class, apxf.class, "n", "u", aulq.class, "o", "p", "q", "v", "r", "s", apld.c, "w"});
            case NEW_MUTABLE_INSTANCE:
                return new asfy();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = t;
                if (aopfVar == null) {
                    synchronized (asfy.class) {
                        aopfVar = t;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            t = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
