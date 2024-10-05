package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avhy extends aonm implements aooz {
    public static final avhy a;
    private static volatile aopf p;
    public int b;
    public aufr c;
    public aqyg e;
    public aqyg f;
    public aulq g;
    public aulq h;
    public float i;
    public avhv j;
    public avhx k;
    public avhu l;
    public long m;
    public apxf o;
    private aota q;
    private byte r = 2;
    public String d = "";
    public aomf n = aomf.b;

    static {
        avhy avhyVar = new avhy();
        a = avhyVar;
        aonm.registerDefaultInstance(avhy.class, avhyVar);
    }

    private avhy() {
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
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ခ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဂ\n\fည\u000b\rᐉ\f\u000fᐉ\r", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "q", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new avhy();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = p;
                if (aopfVar == null) {
                    synchronized (avhy.class) {
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
