package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axcv extends aonm implements aooz {
    public static final axcv a;
    private static volatile aopf g;
    public int b;
    public Object d;
    public int e;
    public int c = 0;
    public aony f = emptyProtobufList();

    static {
        axcv axcvVar = new axcv();
        a = axcvVar;
        aonm.registerDefaultInstance(axcv.class, axcvVar);
    }

    private axcv() {
    }

    public final void a() {
        aony aonyVar = this.f;
        if (aonyVar.c()) {
            return;
        }
        this.f = aonm.mutableCopy(aonyVar);
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ြ\u0000\u0003\u001b\u0004ြ\u0000", new Object[]{"d", "c", "b", "e", axcs.a, axcr.class, "f", axct.class, axcu.class});
            case NEW_MUTABLE_INSTANCE:
                return new axcv();
            case NEW_BUILDER:
                return new aone((int[][][]) null, (byte[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (axcv.class) {
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
