package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asrp extends aonm implements aooz {
    public static final asrp a;
    private static volatile aopf n;
    public int b;
    public aqyg d;
    public int e;
    public int f;
    public int g;
    public avgg h;
    public int i;
    public int j;
    public apxf k;
    private aspl o;
    private aota p;
    private byte q = 2;
    public String c = "";
    public String l = "";
    public aomf m = aomf.b;

    static {
        asrp asrpVar = new asrp();
        a = asrpVar;
        aonm.registerDefaultInstance(asrp.class, asrpVar);
    }

    private asrp() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.q);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u000f\r\u0000\u0000\u0005\u0001ဈ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0006ဋ\u0004\u0007ဋ\u0005\bဋ\u0006\tᐉ\u0007\nဋ\b\u000bᐉ\n\fဈ\u000b\rဋ\t\u000eᐉ\f\u000fည\r", new Object[]{"b", "c", "d", "o", "e", "f", "g", "h", "i", "k", "l", "j", "p", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new asrp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = n;
                if (aopfVar == null) {
                    synchronized (asrp.class) {
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
