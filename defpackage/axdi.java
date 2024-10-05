package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axdi extends aonm implements aooz {
    public static final axdi a;
    private static volatile aopf g;
    public int b;
    public int c = 0;
    public Object d;
    public boolean e;
    public boolean f;

    static {
        axdi axdiVar = new axdi();
        a = axdiVar;
        aonm.registerDefaultInstance(axdi.class, axdiVar);
    }

    private axdi() {
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
                return newMessageInfo(a, "\u0001\u000e\u0001\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ဇ\f\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u000bဇ\r\fြ\u0000\rြ\u0000\u000eြ\u0000", new Object[]{"d", "c", "b", axdy.class, axdw.class, axcy.class, axbv.class, "e", axbr.class, axed.class, axdz.class, axby.class, axeh.class, "f", axbz.class, axcw.class, axce.class});
            case NEW_MUTABLE_INSTANCE:
                return new axdi();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (axdi.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
