package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aovj extends aonm implements aooz {
    public static final aovj a;
    private static volatile aopf o;
    public int b;
    public aqyg c;
    public aqyg d;
    public avgg e;
    public aqyg f;
    public aulq g;
    public apxf h;
    public aulq j;
    public aulq k;
    public aulq l;
    public aulq m;
    private apxf p;
    private apxf q;
    private apxf r;
    private aovi s;
    private aota t;
    private byte u = 2;
    public aony i = emptyProtobufList();
    public aomf n = aomf.b;

    static {
        aovj aovjVar = new aovj();
        a = aovjVar;
        aonm.registerDefaultInstance(aovj.class, aovjVar);
    }

    private aovj() {
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
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0001\u0010\u0001ᐉ\u0000\u0002ᐉ\u0002\u0004ᐉ\u0006\u0005ᐉ\u0007\u0006ᐉ\n\u0007Л\bᐉ\b\tᐉ\u0001\nᐉ\t\u000bᐉ\u0004\rᐉ\u000b\u000eᐉ\f\u000fᐉ\u000e\u0010ᐉ\u000f\u0011ည\u0010\u0012ᐉ\u0005\u0013ᐉ\r", new Object[]{"b", "c", "e", "p", "q", "s", "i", aqyg.class, "h", "d", "r", "f", "j", "k", "m", "t", "n", "g", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new aovj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (aovj.class) {
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
