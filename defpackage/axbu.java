package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axbu extends aonm implements aooz {
    public static final aonv a = new atpn(10);
    public static final axbu b;
    private static volatile aopf f;
    public int c;
    public int d;
    public aonu e = emptyIntList();

    static {
        axbu axbuVar = new axbu();
        b = axbuVar;
        aonm.registerDefaultInstance(axbu.class, axbuVar);
    }

    private axbu() {
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
                return newMessageInfo(b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001e", new Object[]{"c", "d", axbx.a(), "e", axbx.a()});
            case NEW_MUTABLE_INSTANCE:
                return new axbu();
            case NEW_BUILDER:
                return new aone((boolean[][]) null, (char[]) null);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (axbu.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(b);
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
