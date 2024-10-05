package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axda extends aonm implements aooz {
    private static final axda a;
    private static volatile aopf b;
    private int c;
    private int d = 1;
    private boolean e;

    static {
        axda axdaVar = new axda();
        a = axdaVar;
        aonm.registerDefaultInstance(axda.class, axdaVar);
    }

    private axda() {
    }

    public static axda c() {
        return a;
    }

    public axcf a() {
        axcf b2 = axcf.b(this.d);
        return b2 == null ? axcf.ADD_STICKER : b2;
    }

    public boolean d() {
        return this.e;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"c", "d", axcf.a(), "e"});
            case NEW_MUTABLE_INSTANCE:
                return new axda();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (axda.class) {
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
