package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class audv extends aonm implements aooz {
    public static final audv a;
    public static final aonk b;
    private static volatile aopf f;
    public int c;
    public String d = "";
    public boolean e;

    static {
        audv audvVar = new audv();
        a = audvVar;
        aonm.registerDefaultInstance(audv.class, audvVar);
        b = aonm.newSingularGeneratedExtension(aqug.a, audvVar, audvVar, null, 290, aoqn.MESSAGE, audv.class);
    }

    private audv() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new audv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (audv.class) {
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
