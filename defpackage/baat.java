package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baat extends aonm implements aooz {
    public static final baat a;
    private static volatile aopf f;
    public int b;
    public aony c = emptyProtobufList();
    public baau d;
    public int e;

    static {
        baat baatVar = new baat();
        a = baatVar;
        aonm.registerDefaultInstance(baat.class, baatVar);
    }

    private baat() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003င\u0001", new Object[]{"b", "c", baas.class, "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new baat();
            case NEW_BUILDER:
                return new aone((byte[][][]) null, (boolean[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (baat.class) {
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
