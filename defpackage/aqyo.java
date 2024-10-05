package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqyo extends aonm implements aooz {
    public static final aqyo a;
    private static volatile aopf l;
    public int b;
    public aqyg c;
    public aqyg e;
    public aqyg f;
    public apxf g;
    public ashb h;
    private aota m;
    private byte n = 2;
    public aony d = emptyProtobufList();
    public String i = "";
    public String j = "";
    public aomf k = aomf.b;

    static {
        aqyo aqyoVar = new aqyo();
        a = aqyoVar;
        aonm.registerDefaultInstance(aqyo.class, aqyoVar);
    }

    private aqyo() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0005\u0001ᐉ\u0000\u0002\u001b\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ဉ\u0004\u0007ဈ\u0005\bဈ\u0006\tᐉ\u0007\nည\b", new Object[]{"b", "c", "d", aqyn.class, "e", "f", "g", "h", "i", "j", "m", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new aqyo();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (aqyo.class) {
                        aopfVar = l;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            l = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
