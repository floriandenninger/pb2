package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqtu extends aonm implements aooz {
    public static final aqtu a;
    private static volatile aopf o;
    public int b;
    public aqyg c;
    public aulq d;
    public aqyg e;
    public aqtv f;
    public aqyg g;
    public aulq h;
    public boolean i;
    public aulq j;
    public avgg k;
    public apxf l;
    public aulq m;
    public aulq n;
    private aulq p;
    private aulq q;
    private aulq r;
    private apxf s;
    private apxf t;
    private aota u;
    private byte v = 2;

    static {
        aqtu aqtuVar = new aqtu();
        a = aqtuVar;
        aonm.registerDefaultInstance(aqtu.class, aqtuVar);
    }

    private aqtu() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.v);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.v = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0012\u0000\u0001\u0001\u0017\u0012\u0000\u0000\u0011\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0001\u0005ᐉ\u0004\u0006ᐉ\u0005\bᐉ\t\nᐉ\u000f\u000bᐉ\u0014\rᐉ\n\u000eဇ\u0007\u000fᐉ\r\u0010ᐉ\u0010\u0011ᐉ\u0011\u0013ᐉ\u000e\u0015ᐉ\f\u0016ᐉ\b\u0017ᐉ\u0013", new Object[]{"b", "c", "e", "f", "d", "g", "h", "p", "r", "u", "k", "i", "q", "s", "t", "m", "l", "j", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new aqtu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (aqtu.class) {
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
