package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ansi extends aonm implements aooz {
    private static final ansi a;
    private static volatile aopf b;
    private int c;
    private Object e;
    private int f;
    private int d = 0;
    private String g = "";

    static {
        ansi ansiVar = new ansi();
        a = ansiVar;
        aonm.registerDefaultInstance(ansi.class, ansiVar);
    }

    private ansi() {
    }

    public static ansh a() {
        return (ansh) a.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(ansd ansdVar) {
        this.f = ansdVar.f;
        this.c |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(anse anseVar) {
        anseVar.getClass();
        this.e = anseVar;
        this.d = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(String str) {
        str.getClass();
        this.d = 1;
        this.e = str;
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ျ\u0000\u0002ြ\u0000\u0003ဌ\u0002", new Object[]{"e", "d", "c", anse.class, "f", ansd.b()});
            case NEW_MUTABLE_INSTANCE:
                return new ansi();
            case NEW_BUILDER:
                return new ansh();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (ansi.class) {
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
