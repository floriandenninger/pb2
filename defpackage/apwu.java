package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apwu extends aonm implements aooz {
    public static final apwu a;
    public static final aonk b;
    private static volatile aopf e;
    public int c;
    public int d;

    static {
        apwu apwuVar = new apwu();
        a = apwuVar;
        aonm.registerDefaultInstance(apwu.class, apwuVar);
        b = aonm.newSingularGeneratedExtension(awnw.a, apwuVar, apwuVar, null, 273756508, aoqn.MESSAGE, apwu.class);
    }

    private apwu() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "d", aufc.a()});
            case NEW_MUTABLE_INSTANCE:
                return new apwu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (apwu.class) {
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
