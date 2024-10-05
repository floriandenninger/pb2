package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqre extends aonm implements aooz {
    public static final aqre a;
    public static final aonk b;
    private static volatile aopf d;
    public int c;
    private int e;

    static {
        aqre aqreVar = new aqre();
        a = aqreVar;
        aonm.registerDefaultInstance(aqre.class, aqreVar);
        b = aonm.newSingularGeneratedExtension(aqrg.a, aqreVar, aqreVar, null, 259430334, aoqn.MESSAGE, aqre.class);
    }

    private aqre() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"e", "c", apqr.u});
            case NEW_MUTABLE_INSTANCE:
                return new aqre();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aqre.class) {
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
