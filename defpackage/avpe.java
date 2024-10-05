package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avpe extends aonm implements aooz {
    public static final avpe a;
    private static volatile aopf b;
    private int c;
    private int d;
    private aqyg e;
    private aqyg f;
    private aqyg g;
    private aqyg h;
    private aqyg i;
    private aqyg j;
    private aqyg k;
    private aqyg l;
    private aqyg m;
    private aqyg n;
    private aqyg o;
    private apjt p;
    private apjt q;
    private apxf r;
    private apxf s;
    private apxf t;
    private aulq u;
    private apjt v;
    private aulq w;
    private apjt x;
    private aota y;
    private byte z = 2;

    static {
        avpe avpeVar = new avpe();
        a = avpeVar;
        aonm.registerDefaultInstance(avpe.class, avpeVar);
    }

    private avpe() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.z);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.z = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0015\u0000\u0002\u0003$\u0015\u0000\u0000\u0015\u0003ᐉ\u000b\u0004ᐉ\r\u0005ᐉ\u000e\u0006ᐉ\u000f\u0007ᐉ\u0010\bᐉ\u0017\tᐉ\u0013\u000bᐉ!\u000eᐉ\u0015\u000fᐉ\u0007\u0010ᐉ\t\u0013ᐉ\u0018\u0014ᐉ\n\u0018ᐉ\u001b\u0019ᐉ\f\u001aᐉ\u001c\u001cᐉ\u001e\u001eᐉ\u001d\u001fᐉ\u0016\"ᐉ\b$ᐉ\u001f", new Object[]{"c", "d", "i", "k", "l", "m", "n", "r", "o", "y", "p", "e", "g", "s", "h", "t", "j", "u", "w", "v", "q", "f", "x"});
            case NEW_MUTABLE_INSTANCE:
                return new avpe();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avpe.class) {
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
