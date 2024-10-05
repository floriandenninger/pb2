package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ansg extends aonm implements aooz {
    private static final ansg a;
    private static volatile aopf b;
    private int c;
    private int d;
    private boolean e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    static {
        ansg ansgVar = new ansg();
        a = ansgVar;
        aonm.registerDefaultInstance(ansg.class, ansgVar);
    }

    private ansg() {
    }

    public static ansf a() {
        return (ansf) a.createBuilder();
    }

    public static /* synthetic */ ansg b() {
        return a;
    }

    public void k(int i) {
        this.c |= 16;
        this.h = i;
    }

    public void l(ansd ansdVar) {
        this.f = ansdVar.f;
        this.c |= 4;
    }

    public void m(boolean z) {
        this.c |= 2;
        this.e = z;
    }

    public void n(int i) {
        this.c |= 8;
        this.g = i;
    }

    public void o(int i) {
        this.c |= 64;
        this.j = i;
    }

    public void p(int i) {
        this.c |= 1;
        this.d = i;
    }

    public void q(int i) {
        this.c |= 32;
        this.i = i;
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006", new Object[]{"c", "d", "e", "f", ansd.b(), "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new ansg();
            case NEW_BUILDER:
                return new ansf();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (ansg.class) {
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

    public boolean j() {
        return (this.c & 16) != 0;
    }
}
