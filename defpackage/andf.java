package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class andf extends aonm implements aooz {
    public static final andf a;
    private static volatile aopf f;
    public int b;
    public int c;
    public boolean d;
    public float e;

    static {
        andf andfVar = new andf();
        a = andfVar;
        aonm.registerDefaultInstance(andf.class, andfVar);
    }

    private andf() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ခ\u0002", new Object[]{"b", "c", aduo.u, "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new andf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (andf.class) {
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
