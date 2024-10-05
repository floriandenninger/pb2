package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rld extends aonm implements aooz {
    private static volatile aopf S;
    public static final rld a;
    public boolean C;
    public int F;
    public long H;
    public long I;
    public int K;
    public rle M;
    public long O;
    public long P;
    public int b;
    public int c;
    public int d;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public int p;
    public long t;
    public long u;
    public boolean w;
    public long y;
    public int z;
    public aony e = emptyProtobufList();
    public aony f = emptyProtobufList();
    public String l = "";
    public String m = "";
    public String n = "";
    public String o = "";
    public String q = "";
    public String r = "";
    public String s = "";
    public String v = "";
    public String x = "";
    public String A = "";
    public String B = "";
    public aony D = emptyProtobufList();
    public String E = "";
    public String G = "";

    /* renamed from: J */
    public String f273J = "";
    public String L = "";
    public aonu N = emptyIntList();
    public String Q = "";
    public String R = "";

    static {
        rld rldVar = new rld();
        a = rldVar;
        aonm.registerDefaultInstance(rld.class, rldVar);
    }

    private rld() {
    }

    public static /* synthetic */ void c(rld rldVar) {
        rldVar.b |= 64;
        rldVar.l = "android";
    }

    public static /* synthetic */ void d(rld rldVar) {
        rldVar.b |= 1;
        rldVar.d = 1;
    }

    public final void a() {
        aony aonyVar = this.e;
        if (aonyVar.c()) {
            return;
        }
        this.e = aonm.mutableCopy(aonyVar);
    }

    public final void b() {
        aony aonyVar = this.f;
        if (aonyVar.c()) {
            return;
        }
        this.f = aonm.mutableCopy(aonyVar);
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
                return newMessageInfo(a, "\u0001)\u0000\u0002\u00014)\u0000\u0004\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'", new Object[]{"b", "c", "d", "e", rkz.class, "f", rlh.class, "g", "h", "i", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "j", "C", "D", rkw.class, "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R"});
            case NEW_MUTABLE_INSTANCE:
                return new rld();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = S;
                if (aopfVar == null) {
                    synchronized (rld.class) {
                        aopfVar = S;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            S = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
