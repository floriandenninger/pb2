package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class augd extends aonm implements aooz {
    public static final augd a;
    private static volatile aopf s;
    public int b;
    public avgg c;
    public aqyg d;
    public float e;
    public aqyg f;
    public aqyg g;
    public apxf h;
    public apmh j;
    public atdf k;
    public augb l;
    public long m;
    public long n;
    public augc o;
    public aoxy p;
    private aota t;
    private byte u = 2;
    public aony i = emptyProtobufList();
    public aomf q = aomf.b;
    public String r = "";

    static {
        augd augdVar = new augd();
        a = augdVar;
        aonm.registerDefaultInstance(augd.class, augdVar);
    }

    private augd() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.u);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.u = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0001\n\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ခ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007Л\bᐉ\u0006\tᐉ\u0007\nဉ\b\u000bᐉ\r\fည\u000e\rဂ\t\u000eဂ\n\u000fဉ\u000b\u0010ᐉ\f\u0011ဈ\u000f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", apxf.class, "j", "k", "l", "t", "q", "m", "n", "o", "p", "r"});
            case NEW_MUTABLE_INSTANCE:
                return new augd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = s;
                if (aopfVar == null) {
                    synchronized (augd.class) {
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
