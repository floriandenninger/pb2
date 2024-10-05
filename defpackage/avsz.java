package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avsz extends aonm implements aooz {
    private static final avsz a;
    private static volatile aopf b;
    private int c;
    private avta d;
    private int e;
    private int g;
    private int h;
    private int i;
    private int j;
    private long l;
    private int m;
    private int n;
    private long o;
    private long p;
    private long q;
    private long r;
    private avsw t;
    private avth u;
    private String f = "";
    private String k = "";
    private aony s = emptyProtobufList();
    private String v = "";

    static {
        avsz avszVar = new avsz();
        a = avszVar;
        aonm.registerDefaultInstance(avsz.class, avszVar);
    }

    private avsz() {
    }

    public void A(avtr avtrVar) {
        this.g = avtrVar.S;
        this.c |= 8192;
    }

    public void B(long j) {
        this.c |= 262144;
        this.l = j;
    }

    public void C(avsw avswVar) {
        avswVar.getClass();
        this.t = avswVar;
        this.c |= 536870912;
    }

    public void D(avtj avtjVar) {
        this.m = avtjVar.d;
        this.c |= 524288;
    }

    public void E(avtn avtnVar) {
        this.j = avtnVar.k;
        this.c |= 65536;
    }

    public void F(avta avtaVar) {
        avtaVar.getClass();
        this.d = avtaVar;
        this.c |= 1;
    }

    public void G(String str) {
        str.getClass();
        this.c |= 131072;
        this.k = str;
    }

    public void H(avth avthVar) {
        avthVar.getClass();
        this.u = avthVar;
        this.c |= 1073741824;
    }

    public static avsy a() {
        return (avsy) a.createBuilder();
    }

    public static /* synthetic */ avsz b() {
        return a;
    }

    public void s(avtp avtpVar) {
        this.n = avtpVar.p;
        this.c |= 1048576;
    }

    public void t(long j) {
        this.c |= 2097152;
        this.o = j;
    }

    public void u(long j) {
        this.c |= 4194304;
        this.p = j;
    }

    public void v(long j) {
        this.c |= 16777216;
        this.r = j;
    }

    public void w(long j) {
        this.c |= 8388608;
        this.q = j;
    }

    public void x(avtk avtkVar) {
        this.i = avtkVar.l;
        this.c |= 32768;
    }

    public void y(avto avtoVar) {
        this.e = avtoVar.aJ;
        this.c |= 2;
    }

    public void z(avtq avtqVar) {
        this.h = avtqVar.aB;
        this.c |= 16384;
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
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0001,\u0010\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\rဌ\r\u000eဌ\u000e\u000fဌ\u0010\u0010ဈ\u0011\u0011ဃ\u0012\u0012ဌ\u0013\u0013ဌ\u0014\u0015ဃ\u0015\u0016ဃ\u0016\u0017ဃ\u0017\u0018ဃ\u0018\u001eဉ\u001e\"ဌ\u000f,ဉ\u001d", new Object[]{"c", "d", "e", avto.a(), "g", avtr.a(), "h", avtq.a(), "j", avtn.a(), "k", "l", "m", avtj.a(), "n", avtp.a(), "o", "p", "q", "r", "u", "i", avtk.a(), "t"});
            case NEW_MUTABLE_INSTANCE:
                return new avsz();
            case NEW_BUILDER:
                return new avsy();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avsz.class) {
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
