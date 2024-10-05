package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anrw extends aonm implements aooz {
    public static final anrw a;
    private static volatile aopf f;
    public int b;
    public aomf c = aomf.b;
    public aony d = emptyProtobufList();
    public boolean e;

    static {
        anrw anrwVar = new anrw();
        a = anrwVar;
        aonm.registerDefaultInstance(anrw.class, anrwVar);
    }

    private anrw() {
    }

    public final void a() {
        aony aonyVar = this.d;
        if (aonyVar.c()) {
            return;
        }
        this.d = aonm.mutableCopy(aonyVar);
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ည\u0000\u0002\u001c\u0003ဇ\u0002", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new anrw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (anrw.class) {
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
