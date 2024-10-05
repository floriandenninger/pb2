package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axej extends aonm implements aooz {
    public static final axej a;
    private static volatile aopf f;
    public int b;
    public axek d;
    public aony c = emptyProtobufList();
    public aony e = emptyProtobufList();

    static {
        axej axejVar = new axej();
        a = axejVar;
        aonm.registerDefaultInstance(axej.class, axejVar);
    }

    private axej() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002ဉ\u0000\u0003\u001b", new Object[]{"b", "c", axei.class, "d", "e", axcq.class});
            case NEW_MUTABLE_INSTANCE:
                return new axej();
            case NEW_BUILDER:
                return new aone((float[]) null, (char[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (axej.class) {
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
