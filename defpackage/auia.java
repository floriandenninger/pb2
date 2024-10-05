package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auia extends aonm implements aooz {
    public static final auia a;
    private static volatile aopf s;
    public int b;
    public avgg c;
    public aqyg d;
    public aqyg e;
    public aqyg f;
    public avgg g;
    public aqyg h;
    public apxf i;
    public auhy j;
    public apxf k;
    public atdf n;
    public aomf o;
    public aoxy p;
    public int q;
    public String r;
    private aqyg t;
    private aqyg u;
    private auhz v;
    private aota w;
    private apjt x;
    private byte y = 2;
    public aony l = aonm.emptyProtobufList();
    public aony m = aonm.emptyProtobufList();

    static {
        auia auiaVar = new auia();
        a = auiaVar;
        aonm.registerDefaultInstance(auia.class, auiaVar);
    }

    private auia() {
        emptyProtobufList();
        this.o = aomf.b;
        emptyProtobufList();
        this.r = "";
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
                return newMessageInfo(a, "\u0001\u0015\u0000\u0001\u0002\u001f\u0015\u0000\u0002\u0010\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\t\nᐉ\n\u000b\u001a\f\u001a\rᐉ\r\u000fᐉ\u0010\u0010ည\u0011\u0012ᐉ\u000b\u0013ᐉ\f\u0014ᐉ\b\u0019ᐉ\u0013\u001bဌ\u0015\u001dဈ\u0017\u001fᐉ\u0019", new Object[]{"b", "c", "d", "e", "f", "t", "g", "h", "i", "j", "l", "m", "v", "w", "o", "k", "n", "u", "p", "q", aouo.j, "r", "x"});
            case NEW_MUTABLE_INSTANCE:
                return new auia();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = s;
                if (aopfVar == null) {
                    synchronized (auia.class) {
                        aopfVar = s;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            s = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
