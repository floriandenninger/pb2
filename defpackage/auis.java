package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auis extends aonm implements aooz {
    private static final auis a;
    private static volatile aopf b;
    private int c;
    private int d;
    private int e;
    private int f;

    static {
        auis auisVar = new auis();
        a = auisVar;
        aonm.registerDefaultInstance(auis.class, auisVar);
    }

    private auis() {
    }

    public static auir a() {
        return (auir) a.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(auit auitVar) {
        this.d = auitVar.e;
        this.c |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(aqjw aqjwVar) {
        this.e = aqjwVar.B;
        this.c |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(auiu auiuVar) {
        this.f = auiuVar.f;
        this.c |= 8;
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0004ဌ\u0003", new Object[]{"c", "d", auit.a(), "e", aqjw.a(), "f", auiu.a()});
            case NEW_MUTABLE_INSTANCE:
                return new auis();
            case NEW_BUILDER:
                return new auir();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (auis.class) {
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
