package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqct extends aonm implements aooz {
    public static final aqct a;
    private static volatile aopf f;
    public int b;
    public aqcu c;
    public aony d = emptyProtobufList();
    public aony e = emptyProtobufList();

    static {
        aqct aqctVar = new aqct();
        a = aqctVar;
        aonm.registerDefaultInstance(aqct.class, aqctVar);
    }

    private aqct() {
    }

    public final void a() {
        aony aonyVar = this.e;
        if (aonyVar.c()) {
            return;
        }
        this.e = aonm.mutableCopy(aonyVar);
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b", new Object[]{"b", "c", "d", aqcu.class, "e", aqcs.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqct();
            case NEW_BUILDER:
                return new aone((int[]) null, (char[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aqct.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
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
