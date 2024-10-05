package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avoe extends aonm implements aooz {
    public static final avoe a;
    private static volatile aopf b;
    private aqyg A;
    private aqyg B;
    private aqyg C;
    private byte D = 2;
    private int c;
    private int d;
    private aqyg e;
    private aqyg f;
    private aqyg g;
    private aqyg h;
    private aqyg i;
    private aqyg j;
    private aqyg k;
    private apxf l;
    private atdf m;
    private aulq n;
    private aqyg o;
    private apjt p;
    private apjt q;
    private aulq r;
    private aulq s;
    private aulq t;
    private apjt u;
    private aulq v;
    private aota w;
    private aqyg x;
    private aqyg y;
    private aqyg z;

    static {
        avoe avoeVar = new avoe();
        a = avoeVar;
        aonm.registerDefaultInstance(avoe.class, avoeVar);
    }

    private avoe() {
        emptyProtobufList();
        emptyProtobufList();
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.D);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.D = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0019\u0000\u0002\u0002!\u0019\u0000\u0000\u0019\u0002ᐉ\u001b\u0003ᐉ\u001c\u0004ᐉ\u001d\u0005ᐉ\u001e\u0006ᐉ \u0007ᐉ\n\bᐉ\u000f\nᐉ\u001a\fᐉ\u0003\u000fᐉ\u001f\u0010ᐉ\u0004\u0011ᐉ\u0005\u0012ᐉ\u0006\u0013ᐉ\u0010\u0015ᐉ\t\u0016ᐉ\u000b\u0017ᐉ\u0007\u0019ᐉ\u0014\u001aᐉ\f\u001bᐉ\u0011\u001dᐉ\u0016\u001eᐉ\u0012\u001fᐉ\b ᐉ\u0017!ᐉ\u0018", new Object[]{"c", "d", "x", "y", "z", "A", "C", "l", "o", "w", "e", "B", "f", "g", "h", "p", "k", "m", "i", "s", "n", "q", "t", "r", "j", "u", "v"});
            case NEW_MUTABLE_INSTANCE:
                return new avoe();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avoe.class) {
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
