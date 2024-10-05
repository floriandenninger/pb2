package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axkm extends aonh implements aoni {
    private static final axkm a;
    private static volatile aopf b;
    private int c;
    private long d;
    private long e;
    private int g;
    private long i;
    private boolean x;
    private int w = -1;
    private byte z = 2;
    private String f = "";
    private String h = "";
    private aony j = emptyProtobufList();
    private aomf k = aomf.b;
    private aomf m = aomf.b;
    private String n = "";
    private String o = "";
    private String p = "";
    private String q = "";
    private long r = 180000;
    private aomf s = aomf.b;
    private String t = "";
    private aonu u = emptyIntList();
    private aonu v = emptyIntList();
    private String y = "";

    static {
        axkm axkmVar = new axkm();
        a = axkmVar;
        aonm.registerDefaultInstance(axkm.class, axkmVar);
    }

    private axkm() {
    }

    public static axkl g() {
        return (axkl) a.createBuilder();
    }

    public static /* synthetic */ axkm h() {
        return a;
    }

    public void r(aomf aomfVar) {
        this.c |= 262144;
        this.s = aomfVar;
    }

    public void s(String str) {
        this.c |= 32;
        this.h = "";
    }

    public void t(int i) {
        this.c |= 16;
        this.g = i;
    }

    public void u(long j) {
        this.c |= 64;
        this.i = j;
    }

    public void v(long j) {
        this.c |= 1;
        this.d = j;
    }

    public void w(long j) {
        this.c |= 2;
        this.e = j;
    }

    public void x(boolean z) {
        this.c |= 8388608;
        this.x = z;
    }

    public void y(aomf aomfVar) {
        aomfVar.getClass();
        this.c |= 1024;
        this.m = aomfVar;
    }

    public void z(long j) {
        this.c |= 65536;
        this.r = j;
    }

    public int a() {
        return this.g;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.z);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.z = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u001a\t\u0000\u0000\u0000\u0001ဂ\u0000\u0006ည\n\u000bင\u0004\fဂ\u0006\u000fတ\u0010\u0011ဂ\u0001\u0012ည\u0012\u0019ဇ\u0017\u001aဈ\u0005", new Object[]{"c", "d", "m", "g", "i", "r", "e", "s", "x", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new axkm();
            case NEW_BUILDER:
                return new axkl();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (axkm.class) {
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

    public long e() {
        return this.d;
    }

    public aomf f() {
        return this.m;
    }
}
