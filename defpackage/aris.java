package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aris extends aonm implements aooz {
    public static final aris a;
    private static volatile aopf f;
    public arnd b;
    public boolean d;
    private int g;
    private aota h;
    private byte i = 2;
    public aony c = emptyProtobufList();
    public aomf e = aomf.b;

    static {
        aris arisVar = new aris();
        a = arisVar;
        aonm.registerDefaultInstance(aris.class, arisVar);
    }

    private aris() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0001\u0003\u0001ᐉ\u0000\u0002Л\u0005ဇ\u0002\u0007ᐉ\u0004\bည\u0005", new Object[]{"g", "b", "c", arit.class, "d", "h", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aris();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aris.class) {
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
