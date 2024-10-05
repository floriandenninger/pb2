package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ovg extends aonm implements aooz {
    private static volatile aopf A;
    public static final ovg a;
    public int b;
    public long c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public long i;
    public int j;
    public boolean k;
    public long l;
    public int m;
    public int n;
    public int o;
    public int p;
    public long q;
    public long r;
    public boolean s;
    public int t;
    public int u;
    public long v;
    public boolean w;
    public ovn x;
    public long y;
    public int z;

    static {
        ovg ovgVar = new ovg();
        a = ovgVar;
        aonm.registerDefaultInstance(ovg.class, ovgVar);
    }

    private ovg() {
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
                return newMessageInfo(a, "\u0001\u0018\u0000\u0001\r+\u0018\u0000\u0000\u0000\rဂ\u0000\u000eဏ\u0001\u0010င\u0002\u0011ဌ\u0003\u0012င\u0004\u0013င\u0005\u0014ဂ\u0006\u0015င\u0007\u0016ဇ\b\u0017ဂ\t\u0018ဌ\n\u0019ဌ\u000b\u001aဌ\f\u001bဌ\r\u001cဂ\u000e\u001dဂ\u000f\u001eဇ\u0010 ဌ\u0011\"င\u0013$ဂ\u0015%ဇ\u0016&ဉ\u0017'ဂ\u0018+င\u001c", new Object[]{"b", "c", "d", "e", "f", aqjw.a(), "g", "h", "i", "j", "k", "l", "m", apew.g, "n", apew.g, "o", avzr.a(), "p", atwo.a(), "q", "r", "s", "t", atmj.b, "u", "v", "w", "x", "y", "z"});
            case NEW_MUTABLE_INSTANCE:
                return new ovg();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = A;
                if (aopfVar == null) {
                    synchronized (ovg.class) {
                        aopfVar = A;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            A = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
