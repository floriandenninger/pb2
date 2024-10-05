package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqcf extends aonm implements aooz {
    public static final aqcf a;
    private static volatile aopf d;
    private int e;
    private aqyg f;
    private aqyg g;
    private aota h;
    private byte i = 2;
    public aony b = emptyProtobufList();
    public aomf c = aomf.b;

    static {
        aqcf aqcfVar = new aqcf();
        a = aqcfVar;
        aonm.registerDefaultInstance(aqcf.class, aqcfVar);
    }

    private aqcf() {
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0004\u0001Л\u0003ᐉ\u0002\u0004ည\u0003\u0006ᐉ\u0000\u0007ᐉ\u0001", new Object[]{"e", "b", aqce.class, "h", "c", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aqcf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aqcf.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
