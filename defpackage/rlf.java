package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rlf extends aonm implements aooz {
    public static final rlf a;
    private static volatile aopf f;
    public aonx b = emptyLongList();
    public aonx c = emptyLongList();
    public aony d = emptyProtobufList();
    public aony e = emptyProtobufList();

    static {
        rlf rlfVar = new rlf();
        a = rlfVar;
        aonm.registerDefaultInstance(rlf.class, rlfVar);
    }

    private rlf() {
    }

    public final void a() {
        aony aonyVar = this.d;
        if (aonyVar.c()) {
            return;
        }
        this.d = aonm.mutableCopy(aonyVar);
    }

    public final void b() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"b", "c", "d", rkx.class, "e", rlg.class});
            case NEW_MUTABLE_INSTANCE:
                return new rlf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (rlf.class) {
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
