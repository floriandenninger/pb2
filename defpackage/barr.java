package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class barr extends aonm implements aooz {
    public static final barr a;
    private static volatile aopf g;
    public aoot b = aoot.a;
    public aoot c = aoot.a;
    public aony d = emptyProtobufList();
    public aonu e = emptyIntList();
    public aony f = emptyProtobufList();

    static {
        barr barrVar = new barr();
        a = barrVar;
        aonm.registerDefaultInstance(barr.class, barrVar);
    }

    private barr() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0000\u0001\u0005\u0005\u0002\u0003\u0000\u00012\u00022\u0003\u001b\u0004'\u0005\u001b", new Object[]{"b", barp.a, "c", barq.a, "d", baro.class, "e", "f", barl.class});
            case NEW_MUTABLE_INSTANCE:
                return new barr();
            case NEW_BUILDER:
                return new aone((float[][]) null, (boolean[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (barr.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
