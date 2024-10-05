package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axbv extends aonm implements aooz {
    public static final axbv a;
    private static volatile aopf i;
    public int b;
    public axbp c;
    public String d = "";
    public String e = "";
    public String f = "";
    public axbu g;
    public int h;

    static {
        axbv axbvVar = new axbv();
        a = axbvVar;
        aonm.registerDefaultInstance(axbv.class, axbvVar);
    }

    private axbv() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဉ\u0004\u0007ဌ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h", axbw.a()});
            case NEW_MUTABLE_INSTANCE:
                return new axbv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (axbv.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
