package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afim extends aonm implements aooz {
    public static final afim a;
    private static volatile aopf h;
    public long f;
    public aont b = emptyFloatList();
    public aont c = emptyFloatList();
    public aont d = emptyFloatList();
    public aont e = emptyFloatList();
    public String g = "";

    static {
        afim afimVar = new afim();
        a = afimVar;
        aonm.registerDefaultInstance(afim.class, afimVar);
    }

    private afim() {
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
                return newMessageInfo(a, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0004\u0000\u0001$\u0002$\u0003$\u0004Ȉ\u0005$\u0006\u0002", new Object[]{"b", "c", "d", "g", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new afim();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (afim.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
