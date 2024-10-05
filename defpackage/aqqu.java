package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqqu extends aonm implements aooz {
    private static final aqqu a;
    private static volatile aopf b;
    private int c;
    private aqqt d;
    private aqqq e;
    private int f;
    private aony g = emptyProtobufList();

    static {
        aqqu aqquVar = new aqqu();
        a = aqquVar;
        aonm.registerDefaultInstance(aqqu.class, aqquVar);
    }

    private aqqu() {
    }

    public static aqqp a() {
        return (aqqp) a.createBuilder();
    }

    public static /* synthetic */ aqqu b() {
        return a;
    }

    public void g(aqqo aqqoVar) {
        aqqoVar.getClass();
        h();
        this.g.add(aqqoVar);
    }

    private void h() {
        aony aonyVar = this.g;
        if (aonyVar.c()) {
            return;
        }
        this.g = aonm.mutableCopy(aonyVar);
    }

    public void i(aqqq aqqqVar) {
        aqqqVar.getClass();
        this.e = aqqqVar;
        this.c |= 2;
    }

    public void j(aqqt aqqtVar) {
        aqqtVar.getClass();
        this.d = aqqtVar;
        this.c |= 1;
    }

    public void k(int i) {
        this.c |= 4;
        this.f = i;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004\u001b", new Object[]{"c", "d", "e", "f", "g", aqqo.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqqu();
            case NEW_BUILDER:
                return new aqqp();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aqqu.class) {
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
