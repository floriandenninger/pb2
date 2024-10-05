package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apsa extends aonm implements aooz {
    public static final apsa a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private apxf e;
    private apxf f;
    private aqyg g;
    private aqyg h;
    private aqyg i;
    private aqyg j;
    private aqyg k;
    private auzs l;
    private apkd m;
    private aqyg n;
    private apbz o;
    private aqyg p;
    private aulq q;
    private aqyg r;
    private aota s;
    private aqyg t;
    private aqyg u;
    private byte v = 2;

    static {
        apsa apsaVar = new apsa();
        a = apsaVar;
        aonm.registerDefaultInstance(apsa.class, apsaVar);
    }

    private apsa() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0012\u0000\u0001\u0002!\u0012\u0000\u0000\u0012\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\b\bᐉ\t\nᐉ\n\fᐉ\f\rᐉ\r\u000eᐉ\u000e\u0010ᐉ\u0016\u0013ᐉ\u0007\u0015ᐉ\u000b\u0019ᐉ\u0019\u001aᐉ\u001a\u001eᐉ\u0015 ᐉ\u0003!ᐉ\u0010", new Object[]{"c", "d", "e", "g", "h", "j", "k", "l", "n", "o", "p", "s", "i", "m", "t", "u", "r", "f", "q"});
            case NEW_MUTABLE_INSTANCE:
                return new apsa();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (apsa.class) {
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
