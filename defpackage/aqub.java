package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqub extends aonm implements aooz {
    public static final aqub a;
    private static volatile aopf f;
    public int b;
    public long c;
    public int d;
    public aomf e = aomf.b;

    static {
        aqub aqubVar = new aqub();
        a = aqubVar;
        aonm.registerDefaultInstance(aqub.class, aqubVar);
    }

    private aqub() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002ည\u0002\u0004ဂ\u0000\u0005ဌ\u0001", new Object[]{"b", "e", "c", "d", aqtk.n});
            case NEW_MUTABLE_INSTANCE:
                return new aqub();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aqub.class) {
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
