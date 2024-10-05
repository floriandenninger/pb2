package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apme extends aonm implements aooz {
    public static final apme a;
    public static final aonk b;
    private static volatile aopf e;
    public int c;
    public int d;

    static {
        apme apmeVar = new apme();
        a = apmeVar;
        aonm.registerDefaultInstance(apme.class, apmeVar);
        b = aonm.newSingularGeneratedExtension(apmg.a, apmeVar, apmeVar, null, 160206468, aoqn.MESSAGE, apme.class);
    }

    private apme() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "d", apld.k});
            case NEW_MUTABLE_INSTANCE:
                return new apme();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (apme.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
