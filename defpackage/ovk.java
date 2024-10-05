package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ovk extends aonm implements aooz {
    public static final ovk a;
    private static volatile aopf f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        ovk ovkVar = new ovk();
        a = ovkVar;
        aonm.registerDefaultInstance(ovk.class, ovkVar);
    }

    private ovk() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"b", "c", aosx.a(), "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new ovk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (ovk.class) {
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
