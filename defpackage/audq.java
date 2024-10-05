package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class audq extends aonm implements aooz {
    public static final audq a;
    private static volatile aopf n;
    public int b;
    public Object d;
    public aulq e;
    public aqyg h;
    public aqyg i;
    public audn j;
    public long k;
    public boolean l;
    public String m;
    private aqyg o;
    private aota p;
    private aulq q;
    public int c = 0;
    private byte r = 2;
    public aony f = emptyProtobufList();
    public aomf g = aomf.b;

    static {
        audq audqVar = new audq();
        a = audqVar;
        aonm.registerDefaultInstance(audq.class, audqVar);
    }

    private audq() {
        emptyProtobufList();
        this.m = "";
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
                return newMessageInfo(a, "\u0001\r\u0001\u0001\u0001\u0012\r\u0000\u0001\b\u0001ᐉ\u0002\u0002Л\u0003ᐉ\u0003\u0005ည\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\tᐉ\u0007\nဂ\b\rျ\u0000\u000eᐉ\u0001\u000fဇ\u000b\u0010ᐉ\f\u0012ဈ\u000e", new Object[]{"d", "c", "b", "o", "f", audo.class, "p", "g", "h", "i", "j", "k", "e", "l", "q", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new audq();
            case NEW_BUILDER:
                return new aone((float[][][]) null, (char[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = n;
                if (aopfVar == null) {
                    synchronized (audq.class) {
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
