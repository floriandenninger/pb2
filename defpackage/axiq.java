package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axiq extends aonm implements aooz {
    public static final axiq a;
    private static volatile aopf k;
    public int b;
    public int c;
    public String d = "";
    public int e;
    public int f;
    public int g;
    public long h;
    public int i;
    public boolean j;

    static {
        axiq axiqVar = new axiq();
        a = axiqVar;
        aonm.registerDefaultInstance(axiq.class, axiqVar);
    }

    private axiq() {
    }

    public static /* synthetic */ void a(axiq axiqVar) {
        axiqVar.b |= 128;
        axiqVar.h = 350000000L;
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0003\n\b\u0000\u0000\u0000\u0003ဌ\u0000\u0004ဈ\u0001\u0005ဌ\u0004\u0006င\u0005\u0007င\u0006\bဂ\u0007\tင\b\nဇ\t", new Object[]{"b", "c", axio.a(), "d", "e", axin.a(), "f", "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new axiq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (axiq.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
