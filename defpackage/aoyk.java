package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoyk extends aonm implements aooz {
    public static final aoyk a;
    private static volatile aopf h;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float f;
    public int g;
    private int i;
    private int j;
    private int k;

    static {
        aoyk aoykVar = new aoyk();
        a = aoykVar;
        aonm.registerDefaultInstance(aoyk.class, aoykVar);
    }

    private aoyk() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0003\u0007E\u0006\u0000\u0000\u0000\u0007င\u0005?ဇ;Aဌ=Cဇ?Dခ@EငA", new Object[]{"i", "j", "k", "b", "c", "d", aouo.n, "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aoyk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aoyk.class) {
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
