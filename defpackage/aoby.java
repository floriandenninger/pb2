package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoby extends aonm implements aooz {
    public static final aoby a;
    private static volatile aopf f;
    public aocq b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        aoby aobyVar = new aoby();
        a = aobyVar;
        aonm.registerDefaultInstance(aoby.class, aobyVar);
    }

    private aoby() {
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
                return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aoby();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aoby.class) {
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
