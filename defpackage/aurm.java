package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aurm extends aonm implements aooz {
    public static final aurm a;
    public static final aonk b;
    private static volatile aopf d;
    public String c = "";
    private int e;

    static {
        aurm aurmVar = new aurm();
        a = aurmVar;
        aonm.registerDefaultInstance(aurm.class, aurmVar);
        b = aonm.newSingularGeneratedExtension(apxf.a, aurmVar, aurmVar, null, 353172822, aoqn.MESSAGE, aurm.class);
    }

    private aurm() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"e", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new aurm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aurm.class) {
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
