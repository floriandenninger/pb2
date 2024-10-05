package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awdq extends aonm implements aooz {
    public static final awdq a;
    private static volatile aopf f;
    public int b;
    public atxo c;
    public atxn d;
    public atxp e;

    static {
        awdq awdqVar = new awdq();
        a = awdqVar;
        aonm.registerDefaultInstance(awdq.class, awdqVar);
    }

    private awdq() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\uf027₅\ue433ⲧ\u0003\u0000\u0000\u0000\uf027₅ဉ\u0001\ue7c7₡ဉ\u0000\ue433ⲧဉ\u0003", new Object[]{"b", "d", "c", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new awdq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (awdq.class) {
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
