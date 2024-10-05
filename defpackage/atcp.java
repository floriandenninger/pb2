package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atcp extends aonm implements aooz {
    public static final atcp a;
    private static volatile aopf o;
    public int b;
    public avgg d;
    public avgg e;
    public arfs f;
    public aqyg g;
    public aony h;
    public apmh i;
    public apmh j;
    public avgg k;
    public aulq l;
    public aulq m;
    public aomf n;
    private aqyg p;
    private apxf q;
    private aota r;
    private byte s = 2;
    public aony c = emptyProtobufList();

    static {
        atcp atcpVar = new atcp();
        a = atcpVar;
        aonm.registerDefaultInstance(atcp.class, atcpVar);
    }

    private atcp() {
        emptyProtobufList();
        this.h = emptyProtobufList();
        this.n = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.s);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.s = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0010\u000f\u0000\u0002\u000e\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u000b\tည\f\nᐉ\u0006\u000bЛ\fЛ\rᐉ\u0007\u000eᐉ\b\u000fᐉ\t\u0010ᐉ\n", new Object[]{"b", "p", "d", "e", "f", "g", "i", "r", "n", "j", "c", aqyg.class, "h", aqyg.class, "k", "l", "m", "q"});
            case NEW_MUTABLE_INSTANCE:
                return new atcp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (atcp.class) {
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
