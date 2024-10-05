package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqov extends aonm implements aooz {
    public static final aqov a;
    public static final aonk b;
    private static volatile aopf g;
    public int c;
    public long d;
    public aqpc e;
    public boolean f;

    static {
        aqov aqovVar = new aqov();
        a = aqovVar;
        aonm.registerDefaultInstance(aqov.class, aqovVar);
        b = aonm.newSingularGeneratedExtension(atpo.b, aqovVar, aqovVar, null, 288486286, aoqn.MESSAGE, aqov.class);
    }

    private aqov() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0005\t\u0003\u0000\u0000\u0000\u0005ဂ\u0003\bဉ\u0006\tဇ\u0007", new Object[]{"c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aqov();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aqov.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
