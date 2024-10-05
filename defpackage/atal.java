package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atal extends aonm implements aooz {
    private static final atal a;
    private static volatile aopf b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;

    static {
        atal atalVar = new atal();
        a = atalVar;
        aonm.registerDefaultInstance(atal.class, atalVar);
    }

    private atal() {
    }

    public static atak a() {
        return (atak) a.createBuilder();
    }

    public static /* synthetic */ atal b() {
        return a;
    }

    public void g(boolean z) {
        this.c |= 8;
        this.g = z;
    }

    public void h(int i) {
        this.c |= 2;
        this.e = i;
    }

    public void i(atbh atbhVar) {
        this.d = atbhVar.m;
        this.c |= 1;
    }

    public void j(boolean z) {
        this.c |= 4;
        this.f = z;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"c", "d", atbh.a(), "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new atal();
            case NEW_BUILDER:
                return new atak();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (atal.class) {
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
