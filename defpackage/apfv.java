package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apfv extends aonm implements aooz {
    public static final apfv a;
    public static final aonk b;
    private static volatile aopf e;
    public arjp c;
    public String d = "";
    private int f;

    static {
        apfv apfvVar = new apfv();
        a = apfvVar;
        aonm.registerDefaultInstance(apfv.class, apfvVar);
        b = aonm.newSingularGeneratedExtension(awnw.a, apfvVar, apfvVar, null, 303917309, aoqn.MESSAGE, apfv.class);
    }

    private apfv() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"f", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new apfv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (apfv.class) {
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
