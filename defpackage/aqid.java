package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqid extends aonm implements aooz {
    private static final aqid a;
    private static volatile aopf b;
    private int c;
    private Object e;
    private int d = 0;
    private String f = "";
    private String g = "";

    static {
        aqid aqidVar = new aqid();
        a = aqidVar;
        aonm.registerDefaultInstance(aqid.class, aqidVar);
    }

    private aqid() {
    }

    public static aqic a() {
        return (aqic) a.createBuilder();
    }

    public static /* synthetic */ aqid b() {
        return a;
    }

    public void g(String str) {
        str.getClass();
        this.c |= 8;
        this.f = str;
    }

    public void h(String str) {
        str.getClass();
        this.c |= 16;
        this.g = str;
    }

    public void i(aomf aomfVar) {
        aomfVar.getClass();
        this.d = 5;
        this.e = aomfVar;
    }

    public void j(aqib aqibVar) {
        this.e = Integer.valueOf(aqibVar.h);
        this.d = 1;
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဿ\u0000\u0002ဈ\u0003\u0003ဈ\u0004\u0004့\u0000\u0005ွ\u0000", new Object[]{"e", "d", "c", aqib.a(), "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aqid();
            case NEW_BUILDER:
                return new aqic();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aqid.class) {
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
