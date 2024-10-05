package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aszy extends aonm implements aooz {
    private static final aszy a;
    private static volatile aopf b;
    private int c;
    private int d;
    private aony e = emptyProtobufList();

    static {
        aszy aszyVar = new aszy();
        a = aszyVar;
        aonm.registerDefaultInstance(aszy.class, aszyVar);
    }

    private aszy() {
    }

    public static aszx a() {
        return (aszx) a.createBuilder();
    }

    public static /* synthetic */ void c(aszy aszyVar, int i) {
        aszyVar.g(i);
    }

    public static /* synthetic */ void d(aszy aszyVar, aszw aszwVar) {
        aszyVar.e(aszwVar);
    }

    public void e(aszw aszwVar) {
        aszwVar.getClass();
        f();
        this.e.add(aszwVar);
    }

    private void f() {
        aony aonyVar = this.e;
        if (aonyVar.c()) {
            return;
        }
        this.e = aonm.mutableCopy(aonyVar);
    }

    public void g(int i) {
        this.c |= 1;
        this.d = i;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u001b", new Object[]{"c", "d", "e", aszw.class});
            case NEW_MUTABLE_INSTANCE:
                return new aszy();
            case NEW_BUILDER:
                return new aszx();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aszy.class) {
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
