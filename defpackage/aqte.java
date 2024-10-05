package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqte extends aonm implements aooz {
    public static final aqte a;
    private static volatile aopf z;
    private aqyg A;
    private apxf B;
    private aota C;
    public int b;
    public int c;
    public avgg d;
    public avgg e;
    public aqyg f;
    public aqyg g;
    public float h;
    public float i;
    public float j;
    public float k;
    public long l;
    public long m;
    public aqyg n;
    public aqyg o;
    public aqyg p;
    public aqyg q;
    public aqyg r;
    public aqyg s;
    public apxf t;
    public aqtd u;
    private byte D = 2;
    public aony v = emptyProtobufList();
    public aony w = emptyProtobufList();
    public aony x = emptyProtobufList();
    public aomf y = aomf.b;

    static {
        aqte aqteVar = new aqte();
        a = aqteVar;
        aonm.registerDefaultInstance(aqte.class, aqteVar);
    }

    private aqte() {
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
                return newMessageInfo(a, "\u0001\u001a\u0000\u0001\u0001\u001e\u001a\u0000\u0003\u000f\u0001ဌ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ခ\u0006\u0007ခ\u0007\bခ\b\tခ\t\nဂ\n\u000bဂ\u000b\fᐉ\f\rᐉ\r\u000eᐉ\u0011\u000fᐉ\u0012\u0010ᐉ\u0013\u0011\u001b\u0012\u001b\u0013\u001b\u0014ᐉ\u0014\u0016ᐉ\u0010\u0017ᐉ\u0019\u0018ည\u001a\u001bᐉ\u0017\u001dᐉ\u000e\u001eᐉ\u000f", new Object[]{"b", "c", aqtk.b, "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "r", "s", "t", "v", asus.class, "w", asus.class, "x", asus.class, "u", "A", "C", "y", "B", "p", "q"});
            case NEW_MUTABLE_INSTANCE:
                return new aqte();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = z;
                if (aopfVar == null) {
                    synchronized (aqte.class) {
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
