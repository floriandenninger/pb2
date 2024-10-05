package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class andl extends aonm implements aooz {
    private static final andl a;
    private static volatile aopf b;
    private int c;
    private int d;
    private long e;
    private int o;
    private andj p;
    private andn q;
    private andh t;
    private byte u = 2;
    private String f = "";
    private String g = "";
    private String h = "";
    private aonu i = emptyIntList();
    private aony j = emptyProtobufList();
    private aony k = emptyProtobufList();
    private aony l = emptyProtobufList();
    private aony m = emptyProtobufList();
    private aony n = emptyProtobufList();
    private aony r = emptyProtobufList();
    private aony s = emptyProtobufList();

    static {
        andl andlVar = new andl();
        a = andlVar;
        aonm.registerDefaultInstance(andl.class, andlVar);
    }

    private andl() {
    }

    public static andk b() {
        return (andk) a.createBuilder();
    }

    public static andk c(andl andlVar) {
        return (andk) a.createBuilder(andlVar);
    }

    public static /* synthetic */ andl d() {
        return a;
    }

    public void m(andi andiVar) {
        andiVar.getClass();
        n();
        this.r.add(andiVar);
    }

    private void n() {
        aony aonyVar = this.r;
        if (aonyVar.c()) {
            return;
        }
        this.r = aonm.mutableCopy(aonyVar);
    }

    public void o(andh andhVar) {
        andhVar.getClass();
        this.t = andhVar;
        this.d |= 256;
    }

    public void p(andj andjVar) {
        andjVar.getClass();
        this.p = andjVar;
        this.c |= 1073741824;
    }

    public void q(String str) {
        this.c |= 2048;
        this.f = str;
    }

    public void r(int i) {
        this.c |= 268435456;
        this.o = i;
    }

    public void s(String str) {
        this.c |= 65536;
        this.h = str;
    }

    public void t(String str) {
        str.getClass();
        this.c |= 16384;
        this.g = str;
    }

    public void u(long j) {
        this.c |= 2;
        this.e = j;
    }

    public andj a() {
        andj andjVar = this.p;
        return andjVar == null ? andj.a : andjVar;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.u);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.u = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0002\u00020\t\u0000\u0001\u0001\u0002ဂ\u0001\tဈ\u000e\rဈ\u000b\u0011ဈ\u0010\u001fဆ\u001c!ဉ\u001e%ᐉ (\u001b0ဉ(", new Object[]{"c", "d", "e", "g", "f", "h", "o", "p", "q", "r", andi.class, "t"});
            case NEW_MUTABLE_INSTANCE:
                return new andl();
            case NEW_BUILDER:
                return new andk();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (andl.class) {
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
