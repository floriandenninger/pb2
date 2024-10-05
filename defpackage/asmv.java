package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asmv extends aonm implements aooz {
    private static final asmv a;
    private static volatile aopf b;
    private int c;
    private int d;
    private int e;

    static {
        asmv asmvVar = new asmv();
        a = asmvVar;
        aonm.registerDefaultInstance(asmv.class, asmvVar);
    }

    private asmv() {
    }

    public static asmu a() {
        return (asmu) a.createBuilder();
    }

    public static /* synthetic */ void c(asmv asmvVar, asmw asmwVar) {
        asmvVar.f(asmwVar);
    }

    public void e(int i) {
        this.c |= 2;
        this.e = i;
    }

    public void f(asmw asmwVar) {
        this.d = asmwVar.j;
        this.c |= 1;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"c", "d", asmw.a(), "e"});
            case NEW_MUTABLE_INSTANCE:
                return new asmv();
            case NEW_BUILDER:
                return new asmu();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (asmv.class) {
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
