package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqqv extends aonm implements aooz {
    private static final aqqv a;
    private static volatile aopf b;
    private aony c = emptyProtobufList();

    static {
        aqqv aqqvVar = new aqqv();
        a = aqqvVar;
        aonm.registerDefaultInstance(aqqv.class, aqqvVar);
    }

    private aqqv() {
    }

    public static aqqn a() {
        return (aqqn) a.createBuilder();
    }

    public static /* synthetic */ void c(aqqv aqqvVar, aqqu aqquVar) {
        aqqvVar.d(aqquVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(aqqu aqquVar) {
        aqquVar.getClass();
        e();
        this.c.add(aqquVar);
    }

    private void e() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"c", aqqu.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqqv();
            case NEW_BUILDER:
                return new aqqn();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aqqv.class) {
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
