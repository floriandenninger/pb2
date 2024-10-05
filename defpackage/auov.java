package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auov extends aonm implements aooz {
    public static final auov a;
    public static final aonk b;
    private static volatile aopf r;
    public int c;
    public auow f;
    public auou g;
    public auos h;
    public boolean i;
    public auot j;
    public aulq k;
    public auor n;
    public int o;
    public int q;
    private aota s;
    private byte t = 2;
    public aony d = emptyProtobufList();
    public aony e = emptyProtobufList();
    public String l = "";
    public aomf m = aomf.b;
    public String p = "";

    static {
        auov auovVar = new auov();
        a = auovVar;
        aonm.registerDefaultInstance(auov.class, auovVar);
        b = aonm.newSingularGeneratedExtension(aulp.a, auovVar, auovVar, null, 49399797, aoqn.MESSAGE, auov.class);
    }

    private auov() {
    }

    public final void a() {
        aony aonyVar = this.d;
        if (aonyVar.c()) {
            return;
        }
        this.d = aonm.mutableCopy(aonyVar);
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.t);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.t = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0013\u000f\u0000\u0002\t\u0001Л\u0002Л\u0003ᐉ\u0007\u0004ည\b\u0005ᐉ\u0000\u0006ᐉ\u0001\u0007ᐉ\u0004\bᐉ\u0002\tဇ\u0003\rဈ\u0006\u000fᐉ\r\u0010ဌ\u000e\u0011ဈ\u000f\u0012ဌ\u0010\u0013ᐉ\u0005", new Object[]{"c", "d", auoy.class, "e", auox.class, "s", "m", "f", "g", "j", "h", "i", "l", "n", "o", aukz.o, "p", "q", aukz.p, "k"});
            case NEW_MUTABLE_INSTANCE:
                return new auov();
            case NEW_BUILDER:
                return new aone((float[][][]) null, (int[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = r;
                if (aopfVar == null) {
                    synchronized (auov.class) {
                        aopfVar = r;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            r = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
