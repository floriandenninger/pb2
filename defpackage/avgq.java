package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avgq extends aonm implements aooz {
    public static final avgq a;
    private static volatile aopf k;
    public int b;
    public Object d;
    public aqyg e;
    public aqyg f;
    public aqyg g;
    public arfs h;
    public int i;
    private aota l;
    public int c = 0;
    private byte m = 2;
    public aomf j = aomf.b;

    static {
        avgq avgqVar = new avgq();
        a = avgqVar;
        aonm.registerDefaultInstance(avgq.class, avgqVar);
    }

    private avgq() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0001\u0001\u0001\t\t\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐼ\u0000\u0006ᐼ\u0000\u0007ဌ\u0006\bᐉ\u0007\tည\b", new Object[]{"d", "c", "b", "e", "f", "g", "h", apxf.class, apxf.class, "i", avcl.r, "l", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new avgq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (avgq.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
