package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avrp extends aonm implements aooz {
    public static final avrp a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private aqyg f;
    private aqyg g;
    private aqyg h;
    private aqyg i;
    private aqyg j;
    private atdf k;
    private apxf l;
    private apxf m;
    private apjt n;
    private apjt o;
    private apjt p;
    private aulq q;
    private aulq r;
    private apjt s;
    private aota t;
    private aqyg u;
    private aqyg v;
    private aqyg w;
    private aqyg x;
    private byte y = 2;

    static {
        avrp avrpVar = new avrp();
        a = avrpVar;
        aonm.registerDefaultInstance(avrp.class, avrpVar);
    }

    private avrp() {
        emptyProtobufList();
        emptyProtobufList();
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0015\u0000\u0001\u00039\u0015\u0000\u0000\u0015\u0003ᐉ\u0019\u000bᐉ\u000e\u001bᐉ\u0018\u001dᐉ\u001a\u001eᐉ\u001b\u001fᐉ\u001c\"ᐉ\n&ᐉ\u0011'ᐉ\u0001(ᐉ\u0002)ᐉ\u0003*ᐉ\u0004,ᐉ\u0005-ᐉ\u0006.ᐉ\u000f1ᐉ\r2ᐉ\u00145ᐉ\u00136ᐉ\u00128ᐉ\u00159ᐉ\u0016", new Object[]{"c", "u", "l", "t", "v", "w", "x", "j", "n", "d", "e", "f", "g", "h", "i", "m", "k", "q", "p", "o", "r", "s"});
            case NEW_MUTABLE_INSTANCE:
                return new avrp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avrp.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
