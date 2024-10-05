package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apoh extends aonm implements aooz {
    public static final apoh a;
    public static final aonk b;
    public static final aonk c;
    public static final aonk d;
    private static volatile aopf e;

    static {
        apoh apohVar = new apoh();
        a = apohVar;
        aonm.registerDefaultInstance(apoh.class, apohVar);
        b = aonm.newSingularGeneratedExtension(apoj.a, apok.a, apok.a, null, 146730964, aoqn.MESSAGE, apok.class);
        c = aonm.newSingularGeneratedExtension(apoj.a, false, null, null, 147492108, aoqn.BOOL, Boolean.class);
        d = aonm.newRepeatedGeneratedExtension(apoj.a, apok.a, null, 154861719, aoqn.MESSAGE, false, apok.class);
    }

    private apoh() {
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
                return newMessageInfo(a, "\u0001\u0000", null);
            case NEW_MUTABLE_INSTANCE:
                return new apoh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (apoh.class) {
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
