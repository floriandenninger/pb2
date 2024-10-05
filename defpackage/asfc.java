package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asfc extends aonh implements aoni {
    public static final asfc a;
    private static volatile aopf z;
    private aota A;
    private aulq B;
    private aulq C;
    private aulq D;
    private aulq E;
    private aulq F;
    private byte G = 2;
    public int b;
    public arnd c;
    public asfd d;
    public aulp e;
    public aseo f;
    public aqde g;
    public aqde h;
    public aulq i;
    public asfa j;
    public asew k;
    public asfe m;
    public apxf n;
    public avgg o;
    public asez p;
    public aony q;
    public aony r;
    public aulq s;
    public aomf t;
    public aony u;
    public apxf v;
    public apxf w;
    public aqzg x;
    public arhb y;

    static {
        asfc asfcVar = new asfc();
        a = asfcVar;
        aonm.registerDefaultInstance(asfc.class, asfcVar);
    }

    private asfc() {
        emptyProtobufList();
        this.q = emptyProtobufList();
        this.r = emptyProtobufList();
        this.t = aomf.b;
        this.u = emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.G);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.G = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u001c\u0000\u0001\u0001̉\u001c\u0000\u0003\u001b\u0001ᐉ\u0000\u0007ᐉ\u0001\bᐉ\u0002\tᐉ\f\rည\u0011\u000eᐉ\u0005\u000fᐉ\u0006\u0010ᐉ\n\u0011ᐉ\u000b\u0012ᐉ\u0010\u0014ᐉ\t\u0015Л\u0018ᐉ\u000e\u0019Л\u001aᐉ\u0012\u001dᐉ\r\u001eЛ ᐉ\u0013!ᐉ\u0018\"ᐉ\u001a#ᐉ\u001b$ᐉ\u001c%ᐉ\b'ᐉ\u001d(ᐉ\u0007)ᐉ\u001e*ᐉ\u000f̉ᐉ\u0019", new Object[]{"b", "c", "d", "e", "n", "t", "f", "g", "k", "m", "A", "j", "u", apxf.class, "p", "q", aqto.class, "v", "o", "r", aqto.class, "w", "B", "C", "D", "E", "i", "F", "h", "y", "s", "x"});
            case NEW_MUTABLE_INSTANCE:
                return new asfc();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = z;
                if (aopfVar == null) {
                    synchronized (asfc.class) {
                        aopfVar = z;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            z = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
