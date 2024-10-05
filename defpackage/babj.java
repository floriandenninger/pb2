package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class babj extends aonm implements aooz {
    private static volatile aopf A;
    public static final babj a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;

    static {
        babj babjVar = new babj();
        a = babjVar;
        aonm.registerDefaultInstance(babj.class, babjVar);
    }

    private babj() {
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
                return newMessageInfo(a, "\u0001\u0018\u0000\u0001\u0001\u0018\u0018\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0007\bင\b\tင\t\nင\n\u000bင\u000b\fင\f\rင\r\u000eင\u000e\u000fင\u000f\u0010င\u0010\u0011င\u0011\u0012င\u0012\u0013င\u0006\u0014ဂ\u0013\u0015ဂ\u0014\u0016ဂ\u0015\u0017ဂ\u0016\u0018ဂ\u0017", new Object[]{"b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "i", "v", "w", "x", "y", "z"});
            case NEW_MUTABLE_INSTANCE:
                return new babj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = A;
                if (aopfVar == null) {
                    synchronized (babj.class) {
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
