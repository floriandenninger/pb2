package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aquq extends aonm implements aooz {
    public static final aquq a;
    private static volatile aopf f;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    private int g;

    static {
        aquq aquqVar = new aquq();
        a = aquqVar;
        aonm.registerDefaultInstance(aquq.class, aquqVar);
    }

    private aquq() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဇ\u0001\u0003င\u0000\u0004ဇ\u0002\u0005ဌ\u0003", new Object[]{"g", "c", "b", "d", "e", aqjm.a()});
            case NEW_MUTABLE_INSTANCE:
                return new aquq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aquq.class) {
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
