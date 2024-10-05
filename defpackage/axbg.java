package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axbg extends aonm implements aooz {
    public static final axbg a;
    private static volatile aopf b;
    private aoot c = aoot.a;
    private aoot d = aoot.a;

    static {
        axbg axbgVar = new axbg();
        a = axbgVar;
        aonm.registerDefaultInstance(axbg.class, axbgVar);
    }

    private axbg() {
        emptyIntList();
        emptyProtobufList();
        emptyProtobufList();
        emptyIntList();
        emptyIntList();
        emptyIntList();
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0018\u0019\u0002\u0002\u0000\u0000\u00182\u00192", new Object[]{"c", axbe.a, "d", axbf.a});
            case NEW_MUTABLE_INSTANCE:
                return new axbg();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (axbg.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
