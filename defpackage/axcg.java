package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axcg extends aonm implements aooz {
    private static final axcg a;
    private static volatile aopf b;
    private int c;
    private axdk d;

    static {
        axcg axcgVar = new axcg();
        a = axcgVar;
        aonm.registerDefaultInstance(axcg.class, axcgVar);
    }

    private axcg() {
    }

    public static axcg b() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(axdk axdkVar) {
        axdkVar.getClass();
        this.d = axdkVar;
        this.c |= 1;
    }

    public axdk c() {
        axdk axdkVar = this.d;
        return axdkVar == null ? axdk.l() : axdkVar;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new axcg();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (axcg.class) {
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
