package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ated extends aonm implements aooz {
    public static final ated a;
    private static volatile aopf f;
    public aqyg b;
    public boolean d;
    private int g;
    private aota h;
    private byte i = 2;
    public aony c = emptyProtobufList();
    public aomf e = aomf.b;

    static {
        ated atedVar = new ated();
        a = atedVar;
        aonm.registerDefaultInstance(ated.class, atedVar);
    }

    private ated() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0003\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0002\u0004ည\u0003\u0005ဇ\u0001", new Object[]{"g", "b", "c", aqyg.class, "h", "e", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new ated();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (ated.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
