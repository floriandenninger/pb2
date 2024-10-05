package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqys extends aonm implements aooz {
    public static final aqys a;
    private static volatile aopf j;
    public int b;
    public aqyg c;
    public aqyg e;
    public aqyg f;
    public apxf g;
    public ashb h;
    private aota k;
    private byte l = 2;
    public aony d = emptyProtobufList();
    public aomf i = aomf.b;

    static {
        aqys aqysVar = new aqys();
        a = aqysVar;
        aonm.registerDefaultInstance(aqys.class, aqysVar);
    }

    private aqys() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0005\u0001ᐉ\u0000\u0002\u001b\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ဉ\u0004\u0007ᐉ\u0005\bည\u0006", new Object[]{"b", "c", "d", aqyr.class, "e", "f", "g", "h", "k", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new aqys();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (aqys.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
