package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apfh extends aonm implements aooz {
    public static final apfh a;
    private static volatile aopf f;
    public int b;
    public int c;
    public String d = "";
    public avdg e;

    static {
        apfh apfhVar = new apfh();
        a = apfhVar;
        aonm.registerDefaultInstance(apfh.class, apfhVar);
    }

    private apfh() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0004ဉ\u0003", new Object[]{"b", "c", apew.c, "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new apfh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (apfh.class) {
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
