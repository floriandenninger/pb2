package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atcr extends aonm implements aooz {
    public static final atcr a;
    private static volatile aopf l;
    public int b;
    public aqyg c;
    public arfs d;
    public apmh e;
    public avgg f;
    public avgg g;
    public avgg h;
    public aulq i;
    public aulq j;
    public aomf k;
    private apmh m;
    private aulq n;
    private aqyg o;
    private aulq p;
    private aota q;
    private byte r = 2;

    static {
        atcr atcrVar = new atcr();
        a = atcrVar;
        aonm.registerDefaultInstance(atcr.class, atcrVar);
    }

    private atcr() {
        emptyProtobufList();
        this.k = aomf.b;
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
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0000\r\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\f\u0006ည\r\u0007ᐉ\u0003\bᐉ\u0004\tᐉ\u0006\nᐉ\u0007\u000bᐉ\b\fᐉ\n\rᐉ\t\u000eᐉ\u0005\u000fᐉ\u000b", new Object[]{"b", "c", "d", "e", "q", "k", "f", "g", "h", "i", "j", "o", "n", "m", "p"});
            case NEW_MUTABLE_INSTANCE:
                return new atcr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (atcr.class) {
                        aopfVar = l;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            l = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
