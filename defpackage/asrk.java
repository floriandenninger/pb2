package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asrk extends aonm implements aooz {
    public static final asrk a;
    private static volatile aopf d;
    public int b;
    public boolean c;
    private boolean e;

    static {
        asrk asrkVar = new asrk();
        a = asrkVar;
        aonm.registerDefaultInstance(asrk.class, asrkVar);
    }

    private asrk() {
    }

    public static /* synthetic */ void a(asrk asrkVar) {
        asrkVar.b |= 2;
        asrkVar.e = true;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"b", "c", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new asrk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (asrk.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
