package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alwd extends aonm implements aooz {
    public static final aonv a = new uct(2);
    public static final alwd b;
    private static volatile aopf e;
    public String c = "";
    public aonu d = emptyIntList();
    private int f;

    static {
        alwd alwdVar = new alwd();
        b = alwdVar;
        aonm.registerDefaultInstance(alwd.class, alwdVar);
    }

    private alwd() {
        emptyIntList();
        emptyIntList();
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
                return newMessageInfo(b, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002ဈ\u0001\u0003\u001e", new Object[]{"f", "c", "d", alwb.b()});
            case NEW_MUTABLE_INSTANCE:
                return new alwd();
            case NEW_BUILDER:
                return new aone(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (alwd.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(b);
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
