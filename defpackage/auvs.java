package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auvs extends aonm implements aooz {
    public static final auvs a;
    private static volatile aopf q;
    public int b;
    public avgg c;
    public aqyg d;
    public aqyg e;
    public int g;
    public int h;
    public int i;
    public apxf j;
    public auvu k;
    public aulq l;
    public atco m;
    public int n;
    public aulq o;
    public auvt p;
    private aqyg r;
    private aqyg s;
    private aulq t;
    private aulq u;
    private aota v;
    private byte w = 2;
    public aony f = emptyProtobufList();

    static {
        auvs auvsVar = new auvs();
        a = auvsVar;
        aonm.registerDefaultInstance(auvs.class, auvsVar);
    }

    private auvs() {
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
                return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0001\u001a\u0013\u0000\u0001\u000e\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u000b\u0004ᐉ\f\u0005Л\u0006ᐉ\u000e\u0007ᐉ\u0010\bᐉ\u0011\tᐉ\u0005\nᐉ\u0006\rᐉ\u0015\u000fᐉ\u0002\u0012ဌ\u000f\u0013ဌ\u0007\u0014ဌ\b\u0015ဌ\t\u0018ᐉ\u0012\u0019ဉ\u0013\u001aᐉ\r", new Object[]{"b", "c", "d", "j", "k", "f", apjt.class, "m", "t", "u", "r", "s", "v", "e", "n", auqy.p, "g", auqy.o, "h", auqy.o, "i", auqy.o, "o", "p", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new auvs();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = q;
                if (aopfVar == null) {
                    synchronized (auvs.class) {
                        aopfVar = q;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            q = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
