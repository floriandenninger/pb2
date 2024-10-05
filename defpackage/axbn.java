package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axbn extends aonm implements aooz {
    private static final axbn a;
    private static volatile aopf b;
    private int c;
    private String d = "";

    static {
        axbn axbnVar = new axbn();
        a = axbnVar;
        aonm.registerDefaultInstance(axbn.class, axbnVar);
    }

    private axbn() {
    }

    public static axbm a() {
        return (axbm) a.createBuilder();
    }

    public static /* synthetic */ void c(axbn axbnVar, String str) {
        axbnVar.d(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        str.getClass();
        this.c |= 1;
        this.d = str;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new axbn();
            case NEW_BUILDER:
                return new axbm();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (axbn.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
