package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arhz extends aonm implements aooz {
    public static final arhz a;
    private static volatile aopf t;
    public int b;
    public avgg c;
    public aulq e;
    public aqyg f;
    public arhx g;
    public apxf i;
    public apxf j;
    public aswc l;
    public avwi m;
    public aulq n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    private aovx u;
    private arhy v;
    private aota w;
    private apxf x;
    private byte y = 2;
    public aony d = emptyProtobufList();
    public aomf h = aomf.b;
    public String k = "";

    static {
        arhz arhzVar = new arhz();
        a = arhzVar;
        aonm.registerDefaultInstance(arhz.class, arhzVar);
    }

    private arhz() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.y);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.y = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0015\u0000\u0001\u0001\u0018\u0015\u0000\u0001\f\u0001ᐉ\u0001\u0002ᐉ\u0004\u0003ᐉ\u0005\u0004ᐉ\u0006\u0005ည\u0007\u0006ᐉ\b\u0007ဈ\n\bᐉ\t\tᐉ\u000b\fЛ\rဉ\u000e\u000fᐉ\u0003\u0010ဉ\u0010\u0011ᐉ\u0011\u0012ဌ\u0012\u0013ဌ\u0013\u0014ဌ\u0014\u0015ᐉ\u0002\u0016ᐉ\u0000\u0017ဌ\u0015\u0018ဌ\u0016", new Object[]{"b", "c", "f", "g", "w", "h", "i", "k", "j", "x", "d", avfv.class, "l", "e", "m", "n", "o", aric.a(), "p", arhn.a(), "q", arhr.a(), "v", "u", "r", arib.a(), "s", argn.e});
            case NEW_MUTABLE_INSTANCE:
                return new arhz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = t;
                if (aopfVar == null) {
                    synchronized (arhz.class) {
                        aopfVar = t;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            t = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
