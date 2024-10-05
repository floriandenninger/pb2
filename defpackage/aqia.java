package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqia extends aonm implements aooz {
    public static final aqia a;
    private static volatile aopf h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        aqia aqiaVar = new aqia();
        a = aqiaVar;
        aonm.registerDefaultInstance(aqia.class, aqiaVar);
    }

    private aqia() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0004\t\u0005\u0000\u0000\u0000\u0004ဌ\u0003\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b", new Object[]{"b", "c", apyu.n, "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aqia();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aqia.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
