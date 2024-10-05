package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atqv extends aonm implements aooz {
    private static volatile aopf B;
    public static final atqv a;
    public boolean A;
    public int b;
    public int c;
    public int g;
    public int h;
    public int i;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public int p;
    public boolean q;
    public int r;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public int x;
    public boolean y;
    public aomf z;
    public String d = "";
    public String e = "";
    public String f = "";
    public String j = "";
    public String s = "";

    static {
        atqv atqvVar = new atqv();
        a = atqvVar;
        aonm.registerDefaultInstance(atqv.class, atqvVar);
    }

    private atqv() {
        emptyProtobufList();
        this.z = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0018\u0000\u0002\u0001(\u0018\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0004\u0003ဌ\u0005\u0004ဂ\b\u0005ဂ\t\u0007ဌ\u000e\bဇ\u000f\tဌ\u0010\nဈ\u0013\u000bဌ\u0014\rဋ\u0017\u000fဇ\u0019\u0014ဈ\u0001\u0015ဂ\n\u0016ဂ\u000b\u0017ဂ\f\u001dဌ\u0015\u001eဈ\u0002!ဌ!$ဇ$%ဈ\u0007&ဌ\u0003'ည%(ဇ&", new Object[]{"b", "c", "d", "h", atqp.e, "i", atqs.a(), "k", "l", "p", aqjw.a(), "q", "r", atnn.k, "s", "t", atrx.a(), "v", "w", "e", "m", "n", "o", "u", atnn.e, "f", "x", atqp.c, "y", "j", "g", atqp.f, "z", "A"});
            case NEW_MUTABLE_INSTANCE:
                return new atqv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = B;
                if (aopfVar == null) {
                    synchronized (atqv.class) {
                        aopfVar = B;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            B = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
