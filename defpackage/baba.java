package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baba extends aonm implements aooz {
    public static final baba a;
    private static volatile aopf f;
    public int b;
    public aony c = emptyProtobufList();
    public aony d = emptyProtobufList();
    public baaz e;

    static {
        baba babaVar = new baba();
        a = babaVar;
        aonm.registerDefaultInstance(baba.class, babaVar);
    }

    private baba() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"b", "c", babd.class, "d", baay.class, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new baba();
            case NEW_BUILDER:
                return new aone((byte[]) null, (boolean[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (baba.class) {
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
