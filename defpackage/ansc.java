package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ansc extends aonm implements aooz {
    private static final ansc a;
    private static volatile aopf b;
    private int c;
    private String d = "";
    private ansk e;
    private int f;

    static {
        ansc anscVar = new ansc();
        a = anscVar;
        aonm.registerDefaultInstance(ansc.class, anscVar);
    }

    private ansc() {
    }

    public static ansb a() {
        return (ansb) a.createBuilder();
    }

    public static /* synthetic */ ansc b() {
        return a;
    }

    public static ansc c() {
        return a;
    }

    public void h(String str) {
        str.getClass();
        this.c |= 1;
        this.d = str;
    }

    public void i(ansk anskVar) {
        anskVar.getClass();
        this.e = anskVar;
        this.c |= 2;
    }

    public void j(int i) {
        this.c |= 4;
        this.f = i;
    }

    public String d() {
        return this.d;
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဋ\u0002", new Object[]{"c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new ansc();
            case NEW_BUILDER:
                return new ansb();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (ansc.class) {
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
