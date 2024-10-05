package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alwi extends aonm implements aooz {
    public static final alwi a;
    private static volatile aopf e;
    public aony b = emptyProtobufList();
    public aonu c = emptyIntList();
    public boolean d;

    static {
        alwi alwiVar = new alwi();
        a = alwiVar;
        aonm.registerDefaultInstance(alwi.class, alwiVar);
    }

    private alwi() {
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
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002'\u0003\u0007", new Object[]{"b", alwh.class, "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new alwi();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (alwi.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
