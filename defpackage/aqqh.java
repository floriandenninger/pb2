package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqqh extends aonm implements aooz {
    public static final aqqh a;
    private static volatile aopf d;
    public int b = 0;
    public Object c;

    static {
        aqqh aqqhVar = new aqqh();
        a = aqqhVar;
        aonm.registerDefaultInstance(aqqh.class, aqqhVar);
    }

    private aqqh() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ျ\u0000\u0002ြ\u0000\u0003ျ\u0000", new Object[]{"c", "b", aumz.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqqh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aqqh.class) {
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
