package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arih extends aonm implements aooz {
    public static final arih a;
    private static volatile aopf o;
    public int b;
    public arfs c;
    public arfs d;
    public apxf e;
    public aqyg f;
    public aqyg g;
    public arig h;
    public int i;
    public arii j;
    public int k;
    public int n;
    private aqyg p;
    private aota q;
    private byte r = 2;
    public aony l = emptyProtobufList();
    public aomf m = aomf.b;

    static {
        arih arihVar = new arih();
        a = arihVar;
        aonm.registerDefaultInstance(arih.class, arihVar);
    }

    private arih() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.r);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\n\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\b\bᐉ\n\tည\u000b\nဌ\t\u000bᐉ\u0003\fဌ\u0007\rЛ\u000eဌ\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "j", "q", "m", "k", auye.p, "p", "i", auye.o, "l", apxf.class, "n", auye.g});
            case NEW_MUTABLE_INSTANCE:
                return new arih();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (arih.class) {
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
