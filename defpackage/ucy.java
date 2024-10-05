package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ucy extends aonm implements aooz {
    public static final ucy a;
    private static volatile aopf g;
    public int b;
    public aokw d;
    public int e;
    public aony c = emptyProtobufList();
    public String f = "";

    static {
        ucy ucyVar = new ucy();
        a = ucyVar;
        aonm.registerDefaultInstance(ucy.class, ucyVar);
    }

    private ucy() {
    }

    public final void a() {
        aony aonyVar = this.c;
        if (aonyVar.c()) {
            return;
        }
        this.c = aonm.mutableCopy(aonyVar);
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဈ\u0002\u0004ဌ\u0001", new Object[]{"b", "c", aojv.class, "d", "f", "e", aoib.d});
            case NEW_MUTABLE_INSTANCE:
                return new ucy();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (ucy.class) {
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
