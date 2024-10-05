package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqzy extends aonm implements aooz {
    public static final aqzy a;
    private static volatile aopf l;
    public int b;
    public avgg c;
    public avgg d;
    public apmh e;
    public aqyg f;
    public avgg i;
    public arfs j;
    public apmh k;
    private aqyg m;
    private aqyg n;
    private apmh o;
    private aqyg p;
    private aulq q;
    private aulq r;
    private aqyg s;
    private apxf t;
    private apxf u;
    private aota v;
    private byte w = 2;
    public aony g = emptyProtobufList();
    public String h = "";

    static {
        aqzy aqzyVar = new aqzy();
        a = aqzyVar;
        aonm.registerDefaultInstance(aqzy.class, aqzyVar);
    }

    private aqzy() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.w);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.w = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0002\u0015\u0013\u0000\u0001\u0012\u0002ᐉ\u0014\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u0006\tᐉ\u0007\nᐉ\b\u000bЛ\fᐉ\t\rဈ\n\u000eᐉ\u000b\u000fᐉ\f\u0010ᐉ\r\u0011ᐉ\u000e\u0012ᐉ\u000f\u0013ᐉ\u0010\u0014ᐉ\u0011\u0015ᐉ\u0012", new Object[]{"b", "v", "c", "d", "m", "n", "e", "o", "f", "g", aqyg.class, "p", "h", "q", "r", "s", "i", "j", "k", "t", "u"});
            case NEW_MUTABLE_INSTANCE:
                return new aqzy();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (aqzy.class) {
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
