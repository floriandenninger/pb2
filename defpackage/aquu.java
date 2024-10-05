package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aquu extends aonm implements aooz {
    public static final aquu a;
    private static volatile aopf h;
    public long b;
    public int c;
    public aqut d;
    public aqut e;
    public boolean f;
    public boolean g;
    private int i;

    static {
        aquu aquuVar = new aquu();
        a = aquuVar;
        aonm.registerDefaultInstance(aquu.class, aquuVar);
    }

    private aquu() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0003\b\u0006\u0000\u0000\u0000\u0003ဃ\u0002\u0004ဌ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"i", "b", "c", aquw.b, "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aquu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aquu.class) {
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
