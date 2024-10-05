package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apye extends aonm implements aooz {
    public static final apye a;
    public static final aonk b;
    private static volatile aopf f;
    public int c;
    public String d = "";
    public String e = "";

    static {
        apye apyeVar = new apye();
        a = apyeVar;
        aonm.registerDefaultInstance(apye.class, apyeVar);
        b = aonm.newSingularGeneratedExtension(aqug.a, apyeVar, apyeVar, null, 220, aoqn.MESSAGE, apye.class);
    }

    private apye() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new apye();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (apye.class) {
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
